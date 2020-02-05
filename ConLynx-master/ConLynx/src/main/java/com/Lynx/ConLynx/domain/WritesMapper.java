package com.Lynx.ConLynx.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.Lynx.ConLynx.domain.Writes;

@Mapper
public interface WritesMapper {
	@Select("SELECT paperid, email FROM writes")
	List<Writes> getWritesList();

	@Select("SELECT paperid, email FROM writes where paperid = #{paperid}")
	Writes getWrites(Writes writes);

	@Update("update writes set email = #{email} where paperid = #{paperid}")
	void updateWrites(Writes writes);

	@Insert("insert into writes(paperid, email) values (#{paperid}, #{email})")
	void insertWrites(Writes writes);
}

