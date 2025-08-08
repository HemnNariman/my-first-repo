public class PaintJob {
  public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
    if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
      return -1;
    }
    double area = width * height;
    double remainingArea = area - (extraBuckets * areaPerBucket);
    return getBucketCount(remainingArea, areaPerBucket);
  }

  public static int getBucketCount(double width, double height, double areaPerBucket) {
    if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
      return -1;
    }
    double area = width * height;
    return getBucketCount(area, areaPerBucket);

  }

  public static int getBucketCount(double area, double areaPerBucket) {
    if (area <= 0 || areaPerBucket <= 0) {
      return -1;
    }
    double numberOfBuckets = area / areaPerBucket;
    return (int) Math.ceil(numberOfBuckets);
  }

  public static void main(String[] args) {
    System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // ➜ -1 (invalid width)
    System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // ➜ 3
    System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // ➜ 3

    System.out.println(getBucketCount(-3.4, 2.1, 1.5)); // ➜ -1 (invalid width)
    System.out.println(getBucketCount(3.4, 2.1, 1.5)); // ➜ 5
    System.out.println(getBucketCount(7.25, 4.3, 2.35)); // ➜ 14

    System.out.println(getBucketCount(3.4, 1.5)); // ➜ 3
    System.out.println(getBucketCount(6.26, 2.2)); // ➜ 3
    System.out.println(getBucketCount(3.26, 0.75));
  }
}
/**
 * PaintJob class helps calculate how many paint buckets are needed to paint a
 * wall.
 * 
 * It provides three overloaded methods named getBucketCount:
 * 
 * 1. getBucketCount(width, height, areaPerBucket, extraBuckets):
 * Calculates the number of buckets Bob needs to buy given wall dimensions,
 * bucket coverage area, and how many extra buckets he already has at home.
 * 
 * 2. getBucketCount(width, height, areaPerBucket):
 * Calculates the number of buckets needed given wall dimensions and bucket
 * coverage area,
 * assuming no extra buckets at home.
 * 
 * 3. getBucketCount(area, areaPerBucket):
 * Calculates the number of buckets needed given the total area and bucket
 * coverage area.
 * 
 * Input validation:
 * - Returns -1 if any parameter is invalid (zero or negative where not
 * allowed).
 * 
 * Uses Math.ceil to round up the number of buckets since partial buckets mean a
 * full bucket must be bought.
 * 
 * Example usage is demonstrated in the main method.
 */

// The PaintJob class provides methods to calculate the number of paint buckets
// needed
// based on wall dimensions and bucket coverage area, including validation of
// inputs.
