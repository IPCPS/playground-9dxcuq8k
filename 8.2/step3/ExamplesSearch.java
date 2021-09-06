class MatchesExtension {
  String ext;
  MatchesExtension(String ext) { this.ext = ext; }
  boolean matches(ImageData id) {
    return /* FILL IN */;
  }
}
class ExamplesSearch {
  ImageData i1 = new ImageData("ucsd cse computer science", "png", 600, 400);
  ...
  MatchesExtension png = new MatchesExtension("png");
  MatchesExtension jpg = new MatchesExtension("jpg");
  boolean testMatchesExtensionClass(Tester t) {
    return t.checkExpect(this.png.matches(i1), true) &&
           t.checkExpect(this.jpg.matches(i1), false);
  }
}
