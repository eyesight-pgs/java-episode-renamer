

class Logger {
  public static void info(String msg) {
    System.out.println(msg);
  }
  public static void error(String msg) {
    System.out.println(msg);
  }
}

class Help {
  public void showHelp() {
    Logger.info("=============================================================");
    Logger.info("=========================== HELP ============================");
    Logger.info("=============================================================");
    Logger.info("Usage:");
    Logger.info("    java EpisodeRenamer <path> \"<format>\"");
    Logger.info("Example:");
    Logger.info("    java EpisodeRenamer ./death-note \"Death Note - s1 ep{}\"");
  }
}

class Input {
  public String path;
  public String newName;
  private Help help;

  public Input(String path, String newName) {
    this.help = new Help();
    this.help.showHelp();
  }

  public static void validate(String args[]) throws Exception {
    if (args.length < 2) {
      throw new Exception("Invalid input!!!!!!!");
    } else {
      Logger.info("Input is valid :)");
    }
  }
}


class EpisodeRenamer {
  public static void main(String args[]) {
    Logger.info("===========================================================");
    Logger.info("=============== Welcome to Episode Renamer ================");
    Logger.info("===========================================================");
    try {
      Input.validate(args);
    } catch(Exception e) {
      Logger.error("Error: " + e.toString());
      return;
    }
    Input input = new Input(args[0], args[1]); 
  }
}





























