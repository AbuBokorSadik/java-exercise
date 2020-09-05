public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){

        if ((width > 0) && (height > 0) && (areaPerBucket > 0) && (extraBucket >= 0)){
            double area = width * height;
            return  (int) (Math.ceil(area / areaPerBucket) - extraBucket);
        }
        return -1;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        if ((width > 0) && (height > 0) && (areaPerBucket > 0)){
            double area = width * height;
            return  (int) (Math.ceil(area / areaPerBucket));
        }
        return -1;
    }

    public static int getBucketCount(double area, double areaPerBucket){

        if ((area > 0) && (areaPerBucket > 0)){
            return  (int) (Math.ceil(area / areaPerBucket));
        }
        return -1;
    }
}
