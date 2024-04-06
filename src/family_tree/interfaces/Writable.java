package family_tree.interfaces;

import family_tree.person.Human;
import family_tree.tree.FamilyTree;


import java.io.Serializable;

public interface Writable {
    boolean writeTreeAsByteCode(Serializable outputObject, String fileNameForTree);
    boolean writeHumanAsByteCode(Serializable outputObject, String fileNameForPeople);
    FamilyTree readFromByteCodeFile(String fileNameForTree);
    Human readHumanFromByteCodeFile(String fileNameForPeople);



}
