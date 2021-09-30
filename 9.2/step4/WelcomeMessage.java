class WelcomeMessage {
  String welcomeMessage(int hour) {
    String message = "Good Morning";
    if(hour >= 0 && hour < 12) {
      message = "Good Morning";
    }
    else if(hour < 18) {
      message = "Good Afternoon";
    }
    else if(hour < 24) {
      message = "Good Evening";
    }
    else {
      message = "Invalid Hour";
    }
    return message;
  }

  String message1 = welcomeMessage(4);
  String message2 = welcomeMessage(15);
  String message3 = welcomeMessage(20);
  String message4 = welcomeMessage(-10);
}
