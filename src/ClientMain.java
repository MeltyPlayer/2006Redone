public final class ClientMain {
  public static void main(String[] args) {
    Thread clientThread = new Thread(new ClientThread());
    clientThread.start();
  }
}