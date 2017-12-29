package com.nsarvar.repository;

import com.nsarvar.model.Spittle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by nsarvar on 12/29/17.
 */
@Repository
public class SpittleRepositoryImpl implements SpittleRepository {
    List<Spittle> spittles = new ArrayList<Spittle>();

    public SpittleRepositoryImpl() {
        createSpittleList(20);
    }

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return spittles;
    }

    @Override
    public Spittle findOne(long id) {
        Spittle spittle = spittles.stream()
                .filter(a -> a.getId()!=null && a.getId().equals(id))
                .findFirst()
                .orElse(null);
        if(spittle == null) {
            return null;
        }

        return  spittle;
    }

    private List<Spittle> createSpittleList(int count) {
        double latlong[];
        for (int i=0; i < count; i++) {
            latlong = generateLatLong();
            spittles.add(new Spittle((long) i, "Spittle " + i, new Date(), latlong[0], latlong[1]));
        }
        return spittles;
    }

    private double[] generateLatLong(){
        return new double[]{Math.random()*90, Math.random()*180};
    }
}
