package com.prasadJayant.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prasadJayant.controller.Library;

public interface LibraryRepo extends JpaRepository<Library, String > {

}
