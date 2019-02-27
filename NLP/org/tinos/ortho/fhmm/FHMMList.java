package org.tinos.ortho.fhmm;
import org.tinos.view.obj.FMHMMNode;
//词汇翻译系统
import java.io.IOException;
import java.util.List;
import java.util.Map;
public interface FHMMList {
	void index() throws IOException;
	void indexPosEnToCn() throws IOException;  
	void indexPosEnToEn() throws IOException;  
	void indexEnToCn() throws IOException;  
	void indexCnToEn() throws IOException;  
	void indexFullEnToCn() throws IOException;
	void indexFullCnToEn() throws IOException;
	void indexFullCnToJp() throws IOException;
	void indexFullCnToRs() throws IOException;
	void indexFullCnToAb() throws IOException;
	void indexFullCnToFn() throws IOException;
	void indexFullCnToGm() throws IOException;
	void indexFullCnToKo() throws IOException;
	void indexFullCnToSp() throws IOException;
	void indexFullCnToPy() throws IOException;
	Map<String, FMHMMNode> getMap();
	Map<String, String> getPosEnToCn(); 
	Map<String, String> getPosEnToEn(); 
	Map<String, String> getPosCnToCn(); 
	Map<String, String> getEnToCn(); 
	Map<String, String> getCnToEn(); 
	Map<String, String> getFullEnToCn(); 
	Map<String, String> getFullCnToEn();
	Map<String, String> getFullCnToJp();
	Map<String, String> getFullCnToRs();
	Map<String, String> getFullCnToAb();
	Map<String, String> getFullCnToFn();
	Map<String, String> getFullCnToGm();
	Map<String, String> getFullCnToKo();
	Map<String, String> getFullCnToSp();
	Map<String, String> getFullCnToPy();
	List<String> englishStringToWordsList(String string); 
}