public class VoteRecorder {

	
	public static String nameCandidatePresident1;
	public static String nameCandidatePresident2;
	public static String nameCandidateVicePresident1;
	public static String nameCandidateVicePresident2;
	public static int votesCandidatePresident1;
	public static int votesCandidatePresident2;
	public static int votesCandidateVicePresident1;
	public static int votesCandidateVicePresident2;
	public int myVoteForPresident;
	public int myVoteForVicePresident;
	
	public static void setCandidatesPresident(String name1, String name2){
		name1 = nameCandidatePresident1;
		name2 = nameCandidatePresident2;		
	}
	public static void setCandidatesVicePresident(String name1, String name2){
		name1 = nameCandidateVicePresident1;
		name2 = nameCandidateVicePresident2;
		
	}
	public static void resetVotes(){
		votesCandidatePresident1 = 0;
		votesCandidatePresident2 = 0;
		votesCandidateVicePresident1 = 0;
		votesCandidateVicePresident2 = 0;
	}
	public static String getCurrentVotePresident(int pres1, int pres2){
		int total = pres1 + pres2;
		String newTotal = Integer.toString(total);
		return newTotal;
	}
	public static String getCurrentVoteVicePresident(int vice1, int vice2){
		int total = vice1 + vice2;
		String newTotal = Integer.toString(total);
		return newTotal;
	}
	public void getAndConfirmVotes(){
		
	}
	private int getAVote(String name1, String name2){
		
	}
	private getVotes(){
			
	}
	private void confirmVotes(){
		
	}
	private recordVotes(){
		
	}
	
	public static void main(String[] args) {
	}

}
