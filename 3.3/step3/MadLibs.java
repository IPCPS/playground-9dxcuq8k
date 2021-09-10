class MadLibs {
  /*
    Places the given adjective and number into the sentence template to
    create a full sentence.
  */
  String fillIn(String adjective, int number) {
    return "The professor's explanation was " + adjective +
        ", probably because he's been teaching for " + number + " years.";
  }

  String example1 = this.fillIn("useless", 2);
}
