class WelcomeMessage {
  String welcomeMessage(int hour) {
    String message = "Good Morning";
    if(time >= 0) {
      message = "Good Morning";
    }
    else if(time >= 12) {
      message = "Good Afternoon";
    }
    else {
      message = "Good Evening";
    }
    return message;
  }

  String message1 = welcomeMessage(4);
  String message2 = welcomeMessage(15);
  String message3 = welcomeMessage(20);
  String message4 = welcomeMessage(-10);
}
