class LargerThan {
  int minWidth, minHeight;
  
// { autofold
  public LargerThan(int minWidth, int minHeight) {
    this.minWidth = minWidth;
    this.minHeight = minHeight;
  }
// }
  boolean matches(ImageData id) {
    return id.width >= this.minWidth && id.height >= this.minHeight;
  }
}
class ExamplesSearch {
  ImageData i1 = new ImageData("ucsd cse computer science", "png", 600, 400);
  ...
  LargerThan lg1 = new LargerThan(600, 400);
  LargerThan lg2 = new LargerThan(599, 400);
  LargerThan lg3 = new LargerThan(600, 399);
  boolean testLargerThanClass(Tester t) {
    return t.checkExpect(this.lg1.matches(i1), /* fill in: true or false*/) &&
           t.checkExpect(this.lg2.matches(i1), /* fill in: true or false*/) &&
           t.checkExpect(this.lg3.matches(i1), /* fill in: true or false*/);
  }
}
