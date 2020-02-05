package com.Lynx.ConLynx.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.Lynx.ConLynx.dao.Topics_of_interestsDAO;

@Mapper
public interface Topics_of_interestsMapper {

	@Select("SELECT revemail, topic FROM topics_of_interests")
	List<Topics_of_interests> getTopics_of_interestsList();

	@Select("SELECT revemail, topic FROM topics_of_interests where revemail = #{revemail}")
	Topics_of_interests getTopics_of_interests(Topics_of_interests topics_of_interests);

	@Update("update topics_of_interests set topic = #{topic} where revemail = #{revemail}")
	void updateTopics_of_interests(Topics_of_interests topics_of_interests);

	@Insert("insert into topics_of_interests(revemail, topic) values (#{revemail}, #{topic})")
	void insertTopics_of_interests(Topics_of_interests topics_of_interests);
}
