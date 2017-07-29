package com.techtalk;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "talks", path = "talks")
public interface TalkRepository extends MongoRepository<Talk, String> {

    List<Talk> findByPresenter(@Param("presenter") String presenter);

    List<Talk> findByTopicLikeIgnoreCase(@Param("search") String search);

}

