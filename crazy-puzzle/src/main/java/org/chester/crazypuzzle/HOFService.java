package org.chester.crazypuzzle;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("hofService")
public class HOFService {  
  public List<String> getScores() { return Arrays.asList("Xin: 90", "Greg: 83", "Iliya: 79", "Chester: 25"); }
}
