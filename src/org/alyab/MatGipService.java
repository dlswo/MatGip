package org.alyab;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MatGipService {

    private ArrayList<MatGipVO> list;

    public MatGipService() {
        list = new ArrayList<>();
    }

    public void register(MatGipVO obj) {
        list.add(obj);
    }

    public ArrayList<MatGipVO> findByPlace(String place) {

        ArrayList<MatGipVO> result = new ArrayList<>();

        for (MatGipVO vo : this.list) {


            if (vo.checkArea(place)) {

                result.add(vo);
            }
        }
        return result;
    }

    public List<MatGipVO> findByPlace2(String place) {

        return this.list.stream().filter(x -> x.checkArea(place)).collect(Collectors.toList());

    }


}