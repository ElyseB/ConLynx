package com.Lynx.ConLynx.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.Lynx.ConLynx.domain.Participator;

@Mapper
public interface ParticipatorMapper {
	@Select("SELECT  email, firstname, minit, lastname, phone, affiliation, password FROM participator")
	List<Participator> getParticipatorList();

	@Select("SELECT  email, firstname, minit, lastname, phone, affiliation, password FROM participator where email = #{email}")
	Participator getParticipator(Participator participator);

	@Update("update participator set firstname = #{firstname}, minit = #{minit}, lastname = #{lastname}, phone = #{phone}, affiliation = #{affiliation} where email = #{email}")
	void updateParticipator(Participator participator);

	@Insert("insert into participator(email, firstname, minit, lastname, phone, affiliation, password) values (#{email}, #{firstname}, #{minit}, #{lastname}, #{phone}, #{affiliation}, #{password})")
	void insertParticipator(Participator participator);

	@Select("SELECT  email, firstname, minit, lastname, phone, affiliation, password FROM participator where email = #{email} and password = #{password}")
	Participator logInParticipator(Participator participator);
}
