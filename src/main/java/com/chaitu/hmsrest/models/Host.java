package com.chaitu.hmsrest.models;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.chaitu.hmsrest.utils.AddressProof;

/**
 * Host is the one who is the owner of all Hostels. Under him lot of hostels will be running. <br />
 *
 * Created by chaitanya.
 */
@Entity
@Table(name = "HOST")
public class Host implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HOST_ID", unique = true, nullable = false)
    private long hostId;

    @Column(name = "HOST_NAME")
    private String hostName;

    @Column(name = "HOST_EMAIL")
    private String hostEmail;

    @Column(name = "HOST_PASSWORD")
    private String hostPassword;

    @Column(name = "HOST_PIC_PATH")
    private String hostPicPath;
    
    @Column(name = "ADDRESS_PROOF_TYPE")
    private AddressProof addressProof;
    
    @Column(name = "ADDRESS_PROOF_ID")
    private String addressProofId;
    
    @OneToMany(cascade = CascadeType.ALL)
    List<Hostel> hostels;
    
    public AddressProof getAddressProof() {
		return addressProof;
	}

	public void setAddressProof(AddressProof addressProof) {
		this.addressProof = addressProof;
	}

	public String getAddressProofId() {
		return addressProofId;
	}

	public void setAddressProofId(String addressProofId) {
		this.addressProofId = addressProofId;
	}

	public List<Hostel> getHostels() {
		return hostels;
	}

	public void setHostels(List<Hostel> hostels) {
		this.hostels = hostels;
	}

	public long getHostId() {
        return hostId;
    }

    public void setHostId(long hostId) {
        this.hostId = hostId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostEmail() {
        return hostEmail;
    }

    public void setHostEmail(String hostEmail) {
        this.hostEmail = hostEmail;
    }

    public String getHostPassword() {
        return hostPassword;
    }

    public void setHostPassword(String hostPassword) {
        this.hostPassword = hostPassword;
    }

    public String getHostPicPath() {
        return hostPicPath;
    }

    public void setHostPicPath(String hostPicPath) {
        this.hostPicPath = hostPicPath;
    }

	@Override
	public String toString() {
		return "Host [hostId=" + hostId + ", hostName=" + hostName + ", hostEmail=" + hostEmail + ", hostPassword="
				+ hostPassword + ", hostPicPath=" + hostPicPath + ", addressProof=" + addressProof + ", addressProofId="
				+ addressProofId + ", hostels=" + hostels + "]";
	}
}
