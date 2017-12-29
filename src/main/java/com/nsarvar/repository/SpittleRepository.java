package com.nsarvar.repository;

import com.nsarvar.model.Spittle;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nsarvar on 12/25/17.
 */
public interface SpittleRepository{
//        extends JpaRepository<Spittle, Long> {
//    /*
//    max - spittle id that represents the maximum ID of any Spittle that should be returned
//    count - how many Spittle objects to return
//    20 most recent Spittle objects, you can call findSpittles() like this:
//    List<Spittle> recent = spittleRepository.findSpittles(Long.MAX_VALUE, 20);
//     */
    List<Spittle> findSpittles (long max, int count);
    Spittle findOne(long id);
}
