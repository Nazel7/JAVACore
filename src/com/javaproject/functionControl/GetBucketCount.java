package com.javaproject.functionControl;

public class GetBucketCount {
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 4.25, 2.5, 0));
        System.out.println(getBucketCount(2.34, 3.45, 2));
        System.out.println(getBucketCount(3.26, 0.75));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int myCount;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        else{
            myCount= (int) Math.ceil (((width * height) / areaPerBucket)- extraBuckets);
            return myCount;
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int myPale;
        int extraBuckets= 0;
         myPale= getBucketCount(width, height, areaPerBucket, extraBuckets);
        return myPale;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        int areaBucket;
        if(area <= 0  || areaPerBucket <= 0){
            return -1;
        }
        areaBucket=(int) Math.ceil(area / areaPerBucket);
        return areaBucket;
    }
}

