class javaCode{
  public static void main(String[] args){
    String userMessage = getUserMeassge();

    printUserMessage(userMessage);

    System.out.println("And that's all folks");
  }

  public static String getUserMessage(){
    System.out.print("Say something: ");
    Scanner input = new Scanner(System.in);

    return input.toString();
  }

  public static void printUserMessage(String userMessage){
    System.out.print("You said " + userMessage);
  }
}
