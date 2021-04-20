package com.optym.cityjokes.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.optym.cityjokes.entity.CityJoke;

public interface SearchRepository extends MongoRepository<CityJoke, String> {
	@Query(value = "{ $or: [ { 'setup' : {$regex:?0,$options:'i'} }, { 'punchline' : {$regex:?0,$options:'i'} } ] }")
	public List<CityJoke> searchBykey(String key);
	@Query(value = "{$and : [{'type': {$regex:?1,$options:'i'}}], $or: [ { 'setup' : {$regex:?0,$options:'i'} }, { 'punchline' : {$regex:?0,$options:'i'} } ] }")
	public List<CityJoke> searchBykeyAndType(String key,String type);
		
	public List<CityJoke> searchByType(String type);
}
