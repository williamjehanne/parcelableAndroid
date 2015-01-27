import android.os.Parcel;
import android.os.Parcelable;


public class User implements Parcelable{
	private String mFirstName;
	private String mLastName;
	private String mPseudo;
	private String mMail;
	private String mTwitter;
	private String mGooglePlus;
	
	public User(String firstName, String lastName, String pseudo, String mail, String twitter, String googlePlus){
		super();
		this.mFirstName = firstName;
		this.mLastName = lastName;
		this.mPseudo = pseudo;
		this.mMail = mail;
		this.mTwitter = twitter;
		this.mGooglePlus = googlePlus;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		dest.writeString(mFirstName);
		dest.writeString(mLastName);
		dest.writeString(mPseudo);
		dest.writeString(mMail);
		dest.writeString(mTwitter);
		dest.writeString(mGooglePlus);
	}
}
