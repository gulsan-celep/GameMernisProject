package GameMernisProject;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;
import java.time.ZoneId;


public class MernisValidateManager implements UserValidateService{

	@Override
	public boolean validate(Gamer gamer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();	
		try {
			 return kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(), 
					gamer.getBirthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
