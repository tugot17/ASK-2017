package Sorts.AdvancedSorts.ShellSort;

import Helpers.IntegersGenerator;
import Helpers.Sort;
import Sorts.ISort;

/**
 * Created by pmazurek on 08.05.2017.
 */
public class ShellSort extends Sort implements ISort {


    @Override
    public void sort(int amountOfSortedElements) {
        this.amountOfSortedElements = amountOfSortedElements;
        array = IntegersGenerator.createRandomArrayGenerator(amountOfSortedElements);

        sort(array);
    }


    @Override
    public  void sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int helper = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > helper; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = helper;
            }
        }
    }


}
