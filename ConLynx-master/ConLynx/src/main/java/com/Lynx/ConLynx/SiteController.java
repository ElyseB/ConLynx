package com.Lynx.ConLynx;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import com.Lynx.ConLynx.domain.Author;
import com.Lynx.ConLynx.domain.Paper;
import com.Lynx.ConLynx.domain.Participator;
import com.Lynx.ConLynx.domain.Reviewer;
import com.Lynx.ConLynx.domain.Reviews;
import com.Lynx.ConLynx.domain.Topics_of_interests;
import com.Lynx.ConLynx.domain.Writes;
import com.Lynx.ConLynx.service.AuthorService;
import com.Lynx.ConLynx.service.PaperService;
import com.Lynx.ConLynx.service.ReviewerService;
import com.Lynx.ConLynx.service.ReviewsService;
import com.Lynx.ConLynx.service.Topics_of_interestsService;
import com.Lynx.ConLynx.service.WritesService;
import com.Lynx.ConLynx.service.ParticipatorService;

@Controller
public class SiteController {

	@Autowired
	PaperService paperService;
	@Autowired
	AuthorService authorService;
	@Autowired
	ReviewerService reviewerService;
	@Autowired
	ReviewsService reviewsService;
	@Autowired
	Topics_of_interestsService topics_of_interestsService;
	@Autowired
	WritesService writesService;
	@Autowired
	ParticipatorService participatorService;

	/* Methods related to Log In */

	// Log In

	@RequestMapping(value = "/logIn", method = RequestMethod.GET)
	public String login(@ModelAttribute Participator participator, Model model) {
		return "logIn";
	}

	// Processing Log In Page

	@RequestMapping(value = "/processLogIn", method = RequestMethod.POST)
	public String processLogin(@RequestParam String email, String firstName, @ModelAttribute Participator participator,
			Author author, Reviewer reviewer, Model model) {
		participator = participatorService.logInParticipator(participator);
		System.out.println(participator);
		model.addAttribute("message", "Hello " + participator.getFirstname() + ", what would you like to do?");
		model.addAttribute("email", participator.getEmail());
		model.addAttribute(participator);

		String emailLogIn = participator.getEmail();
		author.setEmail(emailLogIn);
		author = authorService.getAuthor(author);
		reviewer.setEmail(emailLogIn);
		reviewer = reviewerService.getReviewer(reviewer);
		boolean auth = false;
		boolean revi = false;

		if (author != null) {
			auth = true;
		}
		if (reviewer != null) {
			revi = true;
		}

		if (revi == true && auth == true) {
			return "welcomeBoth";
		} else if (revi == true) {
			return "welcomeReviewer";
		} else if (auth == true) {
			return "welcomeAuthor";
		}
		return "welcomeBoth";
	}

	// Register New User
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegistrationForm(WebRequest request, Model model) {
		Participator participator = new Participator();
		model.addAttribute("participator", participator);
		return "register";
	}

	// Processing New User
	@RequestMapping(value = "/processRegister", method = RequestMethod.POST)
	public String processRegister(@RequestParam String email, String firstName, String minit, String lastName,
			String phone, String affiliation, String password, @ModelAttribute Participator participator, Model model) {
		participatorService.insertParticipator(participator);
		/* getParticipator(model); */
		return "logIn";
	}

	// Author Table
	@GetMapping("/author")
	public String getAuthor(Model model) {
		System.out.println("inside /author");
		List<Author> authorList = new ArrayList<Author>();
		authorList = authorService.getAuthorList();
		model.addAttribute("authorList", authorList);
		return "authorLanding";
	}

	// Paper Table
	@RequestMapping(value = "/myPaper/{contactauthoremail}", method = RequestMethod.GET)
	public String getMyPaper(@ModelAttribute Paper paper, Model model) {
		paper = paperService.getMyPaper(paper);
		System.out.println(paper);
		List<Paper> myPaperList = new ArrayList<Paper>();
		myPaperList = paperService.getMyPaperList(paper);
		System.out.println(myPaperList);
		model.addAttribute("myPaperList", myPaperList);
		model.addAttribute("contactauthoremail", paper.getContactauthoremail());
		return "YourPapers";
	}

	// Reviews Table
	@RequestMapping(value = "/myReviews/{revemail}", method = RequestMethod.GET)
	public String getMyReviews(@PathVariable String revemail, @ModelAttribute Reviews reviews, Model model) {
		reviews = reviewsService.getMyReviews(reviews);
		System.out.println(reviews);
		List<Reviews> myReviewsList = new ArrayList<Reviews>();
		myReviewsList = reviewsService.getMyReviewsList(reviews);
		System.out.println(myReviewsList);
		model.addAttribute("myReviewsList", myReviewsList);
		model.addAttribute("revemail", reviews.getRevemail());
		return "YourReviews";
	}

// Enter New Review
	@RequestMapping(value = "/NewReview", method = RequestMethod.GET)
	public String showReviewForm(WebRequest request, Model model) {
		Reviews reviews = new Reviews();
		model.addAttribute("reviews", reviews);
		return "NewReview";
	}

// Processing New Review
	@RequestMapping(value = "/processNewReview", method = RequestMethod.POST)
	public String processNewReview(@RequestParam String revemail, int paperid, int techmerit, int readability,
			int originality, int relavance, int overallrecomm, String commentforcommittee, String commentforauthor,
			@ModelAttribute Reviews reviews, Model model) {
		reviewsService.insertReviews(reviews);
		return "YourReviews";
	}

	// Read A Paper Review

	@GetMapping("/readAPaperReview")
	public String getReadAPaperReview(Reviews reviews, Model model) {
		System.out.println("inside /readAPaperReview");
		List<Reviews> reviewsList = new ArrayList<Reviews>();
		reviewsList = reviewsService.getReviewsList();
		model.addAttribute("reviewsList", reviewsList);
		return "ReadAPaperReview";
	}
	//Process Read A Paper Review
	
	@RequestMapping(value = "/processReadAPaperReview", method = RequestMethod.POST)
	public String processReadAPaperReview(@RequestParam String paperid, @ModelAttribute Reviews reviews, Model model) {
		reviews = reviewsService.getReviewsByPaperID(reviews);
		System.out.println(reviews);
		List<Reviews> ReviewsByPaperIDList = new ArrayList<Reviews>();
		ReviewsByPaperIDList = reviewsService.getReviewsByPaperIDList(reviews);
		System.out.println(ReviewsByPaperIDList);
		model.addAttribute("ReviewsByPaperIDList", ReviewsByPaperIDList);
		model.addAttribute("paperid", reviews.getPaperid());
		return "reviewLanding";}
}
	
