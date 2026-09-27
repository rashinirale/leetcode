class Solution:
    def reverseParentheses(self, s):
        stack = []
        
        for char in s:
            if char == ')':
                temp = []
                # Pop characters until '('
                while stack and stack[-1] != '(':
                    temp.append(stack.pop())
                
                # Pop the '(' itself
                if stack:
                    stack.pop()
                
                # Push the characters back into the stack. 
                # Because temp already popped them in reverse order, 
                # appending them back pushes them in the reversed/correct order.
                for c in temp:
                    stack.append(c)
            else:
                stack.append(char)
                
        return "".join(stack)