// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum Equipment
{
	Dental_Chair_for_Patient(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental Chair for Patient" } }),
	Operatory_cabinet(new java.lang.String[][] { new java.lang.String[] { "en_US", "Operatory cabinet" } }),
	Dental_light(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental light" } }),
	X_ray_Imaging_Equpment(new java.lang.String[][] { new java.lang.String[] { "en_US", "X-ray Imaging Equpment" } }),
	Dental_Delivery_Systems(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental Delivery Systems" } }),
	Dental_Sterilization_Equipment(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental Sterilization Equipment" } }),
	Dental_Utility_Equipment(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental Utility Equipment" } }),
	Dental_Handpiece_Systems(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental Handpiece Systems" } }),
	Dental_Intraoral_Cameras(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental Intraoral Cameras" } }),
	Chairside_CAD_CAM_Technology(new java.lang.String[][] { new java.lang.String[] { "en_US", "Chairside CAD/CAM Technology" } }),
	Dental_Cone_Beam_Imaging(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental Cone Beam Imaging" } }),
	Dental_Microscopes(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental Microscopes" } }),
	Dental_Lasers(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental Lasers" } }),
	Endodontic_Equipment(new java.lang.String[][] { new java.lang.String[] { "en_US", "Endodontic Equipment" } }),
	Portable_Dental_Office_Equipment(new java.lang.String[][] { new java.lang.String[] { "en_US", "Portable Dental Office Equipment" } }),
	Dental_examination_mirrors(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental examination mirror" } }),
	Probes(new java.lang.String[][] { new java.lang.String[] { "en_US", "Probe" } }),
	Pliers(new java.lang.String[][] { new java.lang.String[] { "en_US", "Pliers" } }),
	Turbine(new java.lang.String[][] { new java.lang.String[] { "en_US", "Turbine" } }),
	Micromotor(new java.lang.String[][] { new java.lang.String[] { "en_US", "Micromotor" } }),
	Handpiece(new java.lang.String[][] { new java.lang.String[] { "en_US", "Handpiece" } }),
	Dental_Contra_Angle(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental Contra Angle" } }),
	Dental_Lights_Curing_Lamp(new java.lang.String[][] { new java.lang.String[] { "en_US", "Dental Lights-Curing Lamp" } }),
	Apex_Locator(new java.lang.String[][] { new java.lang.String[] { "en_US", "Apex Locator" } }),
	Gloves(new java.lang.String[][] { new java.lang.String[] { "en_US", "Gloves" } });

	private final java.util.Map<java.lang.String, java.lang.String> captions;

	private Equipment(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<>();
		for (java.lang.String[] captionString : captionStrings) {
			captions.put(captionString[0], captionString[1]);
		}
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		return captions.getOrDefault(languageCode, "en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
