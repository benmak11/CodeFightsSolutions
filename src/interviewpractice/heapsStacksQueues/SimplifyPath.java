package interviewpractice.heapsStacksQueues;

import java.util.Stack;

/**
 * @author benmakusha
 */
public class SimplifyPath {

    String simplifyPath(String path) {
        String[] tempStrArray = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String str: tempStrArray){
            if(!str.equals(".") && !str.isEmpty()){
                if(str.equals("..")){
                    if(!stack.isEmpty())
                        stack.pop();
                }else
                    stack.push(str);
            }
        }
        if(stack.isEmpty())
            return "/";
        StringBuilder res= new StringBuilder();
        for(String st : stack)
            res.append("/"+st);

        return res.toString();
    }
}
