package entity;

import entity.Answers;
import entity.Options;
import entity.Types;
import entity.Userquestions;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-28T12:36:27")
@StaticMetamodel(Questions.class)
public class Questions_ { 

    public static volatile SingularAttribute<Questions, Integer> questionsId;
    public static volatile ListAttribute<Questions, Answers> answersList;
    public static volatile ListAttribute<Questions, Options> optionsList;
    public static volatile SingularAttribute<Questions, Types> questionsIdType;
    public static volatile SingularAttribute<Questions, String> questionsTitle;
    public static volatile ListAttribute<Questions, Userquestions> userquestionsList;

}