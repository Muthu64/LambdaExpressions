package com.demo.java8;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Test
{
    private Queue< List<Integer> > listQueue;
    private Map< String, List<Integer> > integerListMap = new HashMap<>( 2 );

    public int minListNumberAcrossQueue;
    public int maxListNumberAcrossQueue;

    public String MIN_NUMBER_KEY = "MIN_NUMBER";
    public String MAX_NUMBER_KEY = "MAX_NUMBER";

    public static void main( String[] args )
    {
        List<List<Integer>> listList = new ArrayList<>(  );

        List<Integer> integerList = Arrays.asList( 10,15 );
        List<Integer> integerList1 = Arrays.asList( 10,30 );
        List<Integer> integerList2 = Arrays.asList( 30, 10);

        listList.add( integerList );
        listList.add( integerList1 );
        listList.add( integerList2 );

        Comparator<List<Integer>> listComparator =  (list1, list2)->
        {
            if( ( list1.stream().mapToInt(i -> i.intValue()).sum() ) < ( list2.stream().mapToInt( i->i.intValue() ).sum() ) )
            {
                return 1;
            }
            else
                {
                return -1;
            }


        };

        List<Integer> minimumList = listList.stream().max( listComparator  ).get();
        System.out.println(minimumList);
    }


    public class ListInformation
    {
        int sumOfItemsInList;
        List<Integer> listOfItemsToPrepare;

        public ListInformation( int sumOfItemsInList, List<Integer> listOfItemsToPrepare )
        {
            this.sumOfItemsInList = sumOfItemsInList;
            this.listOfItemsToPrepare = listOfItemsToPrepare;
        }

        public int getSumOfItemsInList()
        {
            return sumOfItemsInList;
        }

        public List<Integer> getListOfItemsToPrepare()
        {
            return listOfItemsToPrepare;
        }
    }
    /*public int calculate( List<ItemData> itemDataList, ItemCategory itemCategory )
    {
        minListNumberAcrossQueue= 0;
        maxListNumberAcrossQueue = 0;

        listQueue = new LinkedBlockingDeque<>( itemCategory.getChefCount() );
        ListInformation listInformation;
        for ( ItemData itemData : itemDataList )
        {
            if ( ( itemCategory.getChefCount() - listQueue.size() ) > 0 )
            {
                List<Integer> list = new ArrayList<>();

                list.add( itemData.getTimeToPrepareInMins() );
                listQueue.add( list );
                listInformation = new ListInformation( list.stream().mapToInt( i->i.intValue() ).sum(), list );

                if ( minListNumberAcrossQueue == 0 )
                {
                    minListNumberAcrossQueue = itemData.getTimeToPrepareInMins();
                    integerListMap.put( MIN_NUMBER_KEY, list );
                }

                if ( itemData.getTimeToPrepareInMins() < minListNumberAcrossQueue )
                {
                    minListNumberAcrossQueue = itemData.getTimeToPrepareInMins();
                    integerListMap.put( MIN_NUMBER_KEY, list );
                }

                if ( itemData.getTimeToPrepareInMins() > maxListNumberAcrossQueue )
                {
                    maxListNumberAcrossQueue = itemData.getTimeToPrepareInMins();
                    integerListMap.put( MAX_NUMBER_KEY, list );
                }
            }
            else
            {
                integerListMap.get( MIN_NUMBER_KEY ).add( itemData.getTimeToPrepareInMins() );

                int sumOfAllItemsInList = integerListMap.get( MIN_NUMBER_KEY ).stream().reduce( ( integer1, integer2 ) -> integer1 + integer2 ).get();

                if ( maxListNumberAcrossQueue < sumOfAllItemsInList )
                {
                    maxListNumberAcrossQueue = sumOfAllItemsInList;
                    integerListMap.put( MAX_NUMBER_KEY, integerListMap.get( MIN_NUMBER_KEY ) );
                }

                minListNumberAcrossQueue = 0;
                //logic to update the min number after adding items to the queue
                listQueue.stream().forEach( integerList ->
                        {
                            int tempMinNumber = integerList.stream().reduce( ( integer1, integer2 ) -> integer1 + integer2 ).get();

                            if ( minListNumberAcrossQueue == 0 )
                            {
                                minListNumberAcrossQueue = tempMinNumber;
                                integerListMap.put( MIN_NUMBER_KEY, integerList );
                            }
                            else if ( tempMinNumber < minListNumberAcrossQueue )
                            {
                                minListNumberAcrossQueue = tempMinNumber;
                                integerListMap.put( MIN_NUMBER_KEY, integerList );
                            }
                        }
                );

            }
        }
        System.out.println("-************************************************************");
        System.out.println("Category : "+  itemCategory );
        System.out.println("List of items ordered : "+ itemDataList);
        System.out.println( "minNumberAccrossQueue-->" + minListNumberAcrossQueue );
        System.out.println( "maxNumberAccrossQueue-->" + maxListNumberAcrossQueue );
        System.out.println("-************************************************************");
        return maxListNumberAcrossQueue;
    }*/

}
