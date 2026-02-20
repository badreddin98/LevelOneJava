package org.horrorcore;

import org.horrorcore.config.DatabaseConnection;
import org.horrorcore.entity.Sub;
import org.horrorcore.repository.SubRepository;

import java.sql.SQLException;
import java.util.List;

public class Main {
    static void main() {
        try {
            DatabaseConnection.getInstance().getConnection().isValid(50);
        } catch (SQLException e) {
            System.err.println("DATABASE NOT CONNECTION");
        }

        Sub sub = new Sub("Dreadnought", "Virginia-class", 4300000000.00);
        SubRepository subRepository = new SubRepository();
        long id = sub.getSubId();

        subRepository.save(sub);

        System.out.println(
                "Sub Name: "
                        .concat(sub.getSubName())
                        .concat(", Sub Id: ")
                        .concat( String.valueOf(sub.getSubId())));

        System.out.println("----------------------------------------------");
        List<Sub> allSubs = subRepository.findAll();
        System.out.println("Total Subs: " + allSubs.size());
        for (Sub subAll : allSubs) {
            System.out.println(subAll.getSubId() + " " + subAll.getSubName() + " " + subAll.getSubType() + " " + subAll.getCost());
        }

        System.out.println(" ------------------------------------------------");

        Sub foundSub = subRepository.findById(sub.getSubId());
        if (foundSub != null) {
            System.out.println("Found Sub: " + foundSub.getSubName() + " " + foundSub.getSubType());
        } else {
            System.out.println("No sub found with id: " + sub.getSubId());
        }

        System.out.println("---------------------------------------------------");

        sub.setSubName("Dreadnought UPDATE");
        sub.setCost(4400000000.00);
        subRepository.update(sub);

        Sub afterUpdateSub = subRepository.findById(sub.getSubId());
        System.out.println("After Update Sub: " + afterUpdateSub.getSubName() + " " + afterUpdateSub.getSubType());


        System.out.println("-----------------------------------------------------");

        subRepository.delete(sub.getSubId());
        System.out.println("Deleted Sub: " + sub.getSubId());


    }



}
