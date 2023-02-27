package hws.hw15;

import scn.MyScanner;

import static java.lang.Thread.sleep;

public class Tsk3 {
    public void main(String[] args) throws InterruptedException {

        popitka();
    }
    public void popitka(){
        MyScanner scn = new MyScanner();
        Man man = new Man("admin","admin");
        int tries = 3;
        while(tries!=0) {
            String login = scn.next("login: ");
            String password = scn.next("password: ");
            if(login.equals(man.log)&password.equals(man.pas)){
                System.out.println("krasavchik");
                break;
            }
            else{
                tries-=1;
            }
        }
    }
}
class Man{
    String log;
    String pas;

    public Man(String log, String pas) {
        this.log = log;
        this.pas = pas;
    }
}