class TheaterExamples {
  boolean[] row1 = {true, true, false, false};
  boolean[] row2 = {true, false, false, false, true};
  boolean[] row3 = {true, false, true, true, true, true};
  boolean[][] seats = {row1, row2, row3};

  static int totalSeats(boolean[][] seats) {
    int total = 0;
    for(boolean[] row: seats) {
    for(boolean seat: __________________)
    if(_______________)
    total += ________________________;
    }
    }
    }
    return total;
  }

  void testTotalSeats(Tester t) {
    t.checkExpect(totalSeats(seats), 15);
  }
  void testAvailableSeats(Tester t) {
    t.checkExpect(availableSeats(seats), 9);
  }
	
}
