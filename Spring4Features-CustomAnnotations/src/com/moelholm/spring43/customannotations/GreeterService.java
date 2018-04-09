package com.moelholm.spring43.customannotations;

@BusinessService
public class GreeterService {

  @LocalizedMessage("greeterservice.greeting")
  private Message greetingMsg;

  public String sayHello( String caller) {
    return greetingMsg.format(caller);
  }

}
