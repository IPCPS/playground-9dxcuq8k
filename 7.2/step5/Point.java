class Point {
  int x;
  int y;
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  /*
    @param other A point to calculate the distance to
    @return The (approximate) units between the points, calculated by
      the root of sum of squares of differences in coordinates
  */
  int distance(Point other) {
    return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
  }
}
