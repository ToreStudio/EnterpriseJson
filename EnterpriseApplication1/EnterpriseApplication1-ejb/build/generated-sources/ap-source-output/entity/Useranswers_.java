package entity;

import entity.Userquestions;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-28T12:36:27")
@StaticMetamodel(Useranswers.class)
public class Useranswers_ { 

    public static volatile SingularAttribute<Useranswers, String> userquestionsAnswer;
    public static volatile SingularAttribute<Useranswers, Integer> useranswersId;
    public static volatile SingularAttribute<Useranswers, Userquestions> useranswersIdquestion;

}