// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Appointment
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject appointmentMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Appointment";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DateAndTime("DateAndTime"),
		Description("Description"),
		Politeness("Politeness"),
		Professionalism("Professionalism"),
		Hygiene("Hygiene"),
		Availibility("Availibility"),
		IsRated("IsRated"),
		makes("MyFirstModule.makes"),
		goes("MyFirstModule.goes");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Appointment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Appointment(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject appointmentMendixObject)
	{
		if (appointmentMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, appointmentMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.appointmentMendixObject = appointmentMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Appointment.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Appointment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Appointment.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.Appointment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Appointment(context, mendixObject);
	}

	public static myfirstmodule.proxies.Appointment load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Appointment.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Appointment> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.Appointment.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of DateAndTime
	 */
	public final java.util.Date getDateAndTime()
	{
		return getDateAndTime(getContext());
	}

	/**
	 * @param context
	 * @return value of DateAndTime
	 */
	public final java.util.Date getDateAndTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateAndTime.toString());
	}

	/**
	 * Set value of DateAndTime
	 * @param dateandtime
	 */
	public final void setDateAndTime(java.util.Date dateandtime)
	{
		setDateAndTime(getContext(), dateandtime);
	}

	/**
	 * Set value of DateAndTime
	 * @param context
	 * @param dateandtime
	 */
	public final void setDateAndTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date dateandtime)
	{
		getMendixObject().setValue(context, MemberNames.DateAndTime.toString(), dateandtime);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of Politeness
	 */
	public final java.lang.Integer getPoliteness()
	{
		return getPoliteness(getContext());
	}

	/**
	 * @param context
	 * @return value of Politeness
	 */
	public final java.lang.Integer getPoliteness(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Politeness.toString());
	}

	/**
	 * Set value of Politeness
	 * @param politeness
	 */
	public final void setPoliteness(java.lang.Integer politeness)
	{
		setPoliteness(getContext(), politeness);
	}

	/**
	 * Set value of Politeness
	 * @param context
	 * @param politeness
	 */
	public final void setPoliteness(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer politeness)
	{
		getMendixObject().setValue(context, MemberNames.Politeness.toString(), politeness);
	}

	/**
	 * @return value of Professionalism
	 */
	public final java.lang.Integer getProfessionalism()
	{
		return getProfessionalism(getContext());
	}

	/**
	 * @param context
	 * @return value of Professionalism
	 */
	public final java.lang.Integer getProfessionalism(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Professionalism.toString());
	}

	/**
	 * Set value of Professionalism
	 * @param professionalism
	 */
	public final void setProfessionalism(java.lang.Integer professionalism)
	{
		setProfessionalism(getContext(), professionalism);
	}

	/**
	 * Set value of Professionalism
	 * @param context
	 * @param professionalism
	 */
	public final void setProfessionalism(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer professionalism)
	{
		getMendixObject().setValue(context, MemberNames.Professionalism.toString(), professionalism);
	}

	/**
	 * @return value of Hygiene
	 */
	public final java.lang.Integer getHygiene()
	{
		return getHygiene(getContext());
	}

	/**
	 * @param context
	 * @return value of Hygiene
	 */
	public final java.lang.Integer getHygiene(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Hygiene.toString());
	}

	/**
	 * Set value of Hygiene
	 * @param hygiene
	 */
	public final void setHygiene(java.lang.Integer hygiene)
	{
		setHygiene(getContext(), hygiene);
	}

	/**
	 * Set value of Hygiene
	 * @param context
	 * @param hygiene
	 */
	public final void setHygiene(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer hygiene)
	{
		getMendixObject().setValue(context, MemberNames.Hygiene.toString(), hygiene);
	}

	/**
	 * @return value of Availibility
	 */
	public final java.lang.Integer getAvailibility()
	{
		return getAvailibility(getContext());
	}

	/**
	 * @param context
	 * @return value of Availibility
	 */
	public final java.lang.Integer getAvailibility(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Availibility.toString());
	}

	/**
	 * Set value of Availibility
	 * @param availibility
	 */
	public final void setAvailibility(java.lang.Integer availibility)
	{
		setAvailibility(getContext(), availibility);
	}

	/**
	 * Set value of Availibility
	 * @param context
	 * @param availibility
	 */
	public final void setAvailibility(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer availibility)
	{
		getMendixObject().setValue(context, MemberNames.Availibility.toString(), availibility);
	}

	/**
	 * @return value of IsRated
	 */
	public final java.lang.Boolean getIsRated()
	{
		return getIsRated(getContext());
	}

	/**
	 * @param context
	 * @return value of IsRated
	 */
	public final java.lang.Boolean getIsRated(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsRated.toString());
	}

	/**
	 * Set value of IsRated
	 * @param israted
	 */
	public final void setIsRated(java.lang.Boolean israted)
	{
		setIsRated(getContext(), israted);
	}

	/**
	 * Set value of IsRated
	 * @param context
	 * @param israted
	 */
	public final void setIsRated(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean israted)
	{
		getMendixObject().setValue(context, MemberNames.IsRated.toString(), israted);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of makes
	 */
	public final myfirstmodule.proxies.Dentist getmakes() throws com.mendix.core.CoreException
	{
		return getmakes(getContext());
	}

	/**
	 * @param context
	 * @return value of makes
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Dentist getmakes(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Dentist result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.makes.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Dentist.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of makes
	 * @param makes
	 */
	public final void setmakes(myfirstmodule.proxies.Dentist makes)
	{
		setmakes(getContext(), makes);
	}

	/**
	 * Set value of makes
	 * @param context
	 * @param makes
	 */
	public final void setmakes(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Dentist makes)
	{
		if (makes == null) {
			getMendixObject().setValue(context, MemberNames.makes.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.makes.toString(), makes.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of goes
	 */
	public final myfirstmodule.proxies.Patient getgoes() throws com.mendix.core.CoreException
	{
		return getgoes(getContext());
	}

	/**
	 * @param context
	 * @return value of goes
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Patient getgoes(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Patient result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.goes.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Patient.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of goes
	 * @param goes
	 */
	public final void setgoes(myfirstmodule.proxies.Patient goes)
	{
		setgoes(getContext(), goes);
	}

	/**
	 * Set value of goes
	 * @param context
	 * @param goes
	 */
	public final void setgoes(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Patient goes)
	{
		if (goes == null) {
			getMendixObject().setValue(context, MemberNames.goes.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.goes.toString(), goes.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return appointmentMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Appointment that = (myfirstmodule.proxies.Appointment) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
