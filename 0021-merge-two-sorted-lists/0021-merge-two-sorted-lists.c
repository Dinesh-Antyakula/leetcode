/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* a, struct ListNode* b) {
    struct ListNode *head,*last;
    if(a==NULL){
        return b;
    }
    if(b==NULL){
        return a;
    }
    if(a->val < b->val){
        head=last=a;
        a=a->next;
    }
    else{
        head=last=b;
        b=b->next;
    }
    while(a!=NULL && b!=NULL){
        if(a->val < b->val){
            last->next=a;
            last=a;
            a=a->next;
        }
        else{
            last->next=b;
            last=b;
            b=b->next;
        }
    }
    if(a==NULL){
        last->next=b;
    }
    if(b==NULL){
        last->next=a;
    }
    return head;
    
}