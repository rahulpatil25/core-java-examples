package day6.assignments.foreachLoop;
import java.util.*;
public class TestInvitationCard {
	public static void main(String[] args) {
		InvitationCard invitationCard1 = new InvitationCard("John", 2);
		InvitationCard invitationCard2 = new InvitationCard("Peter", 6);
		InvitationCard invitationCard3 = new InvitationCard("Derek", 4);
		InvitationCard invitationCard4 = new InvitationCard("Lisa", 7);
		
		ArrayList<InvitationCard> inviList = new ArrayList<InvitationCard>();
		
		inviList.add(invitationCard1);
		inviList.add(invitationCard2);
		inviList.add(invitationCard3);
		inviList.add(invitationCard4);
		
		for(InvitationCard ic : inviList) {
			System.out.println(ic);
		}
		
	}
}
