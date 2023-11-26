// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Dentist extends system.proxies.User
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Dentist";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FirstName("FirstName"),
		LastName("LastName"),
		Email("Email"),
		Politeness_midgrade("Politeness_midgrade"),
		Professionalism_midgrade("Professionalism_midgrade"),
		Hygiene_midgrade("Hygiene_midgrade"),
		Availibility_midgrade("Availibility_midgrade"),
		Name("Name"),
		Password("Password"),
		LastLogin("LastLogin"),
		Blocked("Blocked"),
		BlockedSince("BlockedSince"),
		Active("Active"),
		FailedLogins("FailedLogins"),
		WebServiceUser("WebServiceUser"),
		IsAnonymous("IsAnonymous"),
		UserRoles("System.UserRoles"),
		User_Language("System.User_Language"),
		User_TimeZone("System.User_TimeZone");

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

	public Dentist(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Dentist(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject dentistMendixObject)
	{
		super(context, dentistMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, dentistMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'Dentist.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Dentist initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Dentist.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.Dentist initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Dentist(context, mendixObject);
	}

	public static myfirstmodule.proxies.Dentist load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Dentist.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Dentist> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.Dentist.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName()
	{
		return getFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName
	 */
	public final java.lang.String getFirstName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FirstName.toString());
	}

	/**
	 * Set value of FirstName
	 * @param firstname
	 */
	public final void setFirstName(java.lang.String firstname)
	{
		setFirstName(getContext(), firstname);
	}

	/**
	 * Set value of FirstName
	 * @param context
	 * @param firstname
	 */
	public final void setFirstName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname)
	{
		getMendixObject().setValue(context, MemberNames.FirstName.toString(), firstname);
	}

	/**
	 * @return value of LastName
	 */
	public final java.lang.String getLastName()
	{
		return getLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName
	 */
	public final java.lang.String getLastName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastName.toString());
	}

	/**
	 * Set value of LastName
	 * @param lastname
	 */
	public final void setLastName(java.lang.String lastname)
	{
		setLastName(getContext(), lastname);
	}

	/**
	 * Set value of LastName
	 * @param context
	 * @param lastname
	 */
	public final void setLastName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastname)
	{
		getMendixObject().setValue(context, MemberNames.LastName.toString(), lastname);
	}

	/**
	 * @return value of Email
	 */
	public final java.lang.String getEmail()
	{
		return getEmail(getContext());
	}

	/**
	 * @param context
	 * @return value of Email
	 */
	public final java.lang.String getEmail(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Email.toString());
	}

	/**
	 * Set value of Email
	 * @param email
	 */
	public final void setEmail(java.lang.String email)
	{
		setEmail(getContext(), email);
	}

	/**
	 * Set value of Email
	 * @param context
	 * @param email
	 */
	public final void setEmail(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String email)
	{
		getMendixObject().setValue(context, MemberNames.Email.toString(), email);
	}

	/**
	 * @return value of Politeness_midgrade
	 */
	public final java.math.BigDecimal getPoliteness_midgrade()
	{
		return getPoliteness_midgrade(getContext());
	}

	/**
	 * @param context
	 * @return value of Politeness_midgrade
	 */
	public final java.math.BigDecimal getPoliteness_midgrade(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Politeness_midgrade.toString());
	}

	/**
	 * Set value of Politeness_midgrade
	 * @param politeness_midgrade
	 */
	public final void setPoliteness_midgrade(java.math.BigDecimal politeness_midgrade)
	{
		setPoliteness_midgrade(getContext(), politeness_midgrade);
	}

	/**
	 * Set value of Politeness_midgrade
	 * @param context
	 * @param politeness_midgrade
	 */
	public final void setPoliteness_midgrade(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal politeness_midgrade)
	{
		getMendixObject().setValue(context, MemberNames.Politeness_midgrade.toString(), politeness_midgrade);
	}

	/**
	 * @return value of Professionalism_midgrade
	 */
	public final java.math.BigDecimal getProfessionalism_midgrade()
	{
		return getProfessionalism_midgrade(getContext());
	}

	/**
	 * @param context
	 * @return value of Professionalism_midgrade
	 */
	public final java.math.BigDecimal getProfessionalism_midgrade(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Professionalism_midgrade.toString());
	}

	/**
	 * Set value of Professionalism_midgrade
	 * @param professionalism_midgrade
	 */
	public final void setProfessionalism_midgrade(java.math.BigDecimal professionalism_midgrade)
	{
		setProfessionalism_midgrade(getContext(), professionalism_midgrade);
	}

	/**
	 * Set value of Professionalism_midgrade
	 * @param context
	 * @param professionalism_midgrade
	 */
	public final void setProfessionalism_midgrade(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal professionalism_midgrade)
	{
		getMendixObject().setValue(context, MemberNames.Professionalism_midgrade.toString(), professionalism_midgrade);
	}

	/**
	 * @return value of Hygiene_midgrade
	 */
	public final java.math.BigDecimal getHygiene_midgrade()
	{
		return getHygiene_midgrade(getContext());
	}

	/**
	 * @param context
	 * @return value of Hygiene_midgrade
	 */
	public final java.math.BigDecimal getHygiene_midgrade(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Hygiene_midgrade.toString());
	}

	/**
	 * Set value of Hygiene_midgrade
	 * @param hygiene_midgrade
	 */
	public final void setHygiene_midgrade(java.math.BigDecimal hygiene_midgrade)
	{
		setHygiene_midgrade(getContext(), hygiene_midgrade);
	}

	/**
	 * Set value of Hygiene_midgrade
	 * @param context
	 * @param hygiene_midgrade
	 */
	public final void setHygiene_midgrade(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal hygiene_midgrade)
	{
		getMendixObject().setValue(context, MemberNames.Hygiene_midgrade.toString(), hygiene_midgrade);
	}

	/**
	 * @return value of Availibility_midgrade
	 */
	public final java.math.BigDecimal getAvailibility_midgrade()
	{
		return getAvailibility_midgrade(getContext());
	}

	/**
	 * @param context
	 * @return value of Availibility_midgrade
	 */
	public final java.math.BigDecimal getAvailibility_midgrade(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Availibility_midgrade.toString());
	}

	/**
	 * Set value of Availibility_midgrade
	 * @param availibility_midgrade
	 */
	public final void setAvailibility_midgrade(java.math.BigDecimal availibility_midgrade)
	{
		setAvailibility_midgrade(getContext(), availibility_midgrade);
	}

	/**
	 * Set value of Availibility_midgrade
	 * @param context
	 * @param availibility_midgrade
	 */
	public final void setAvailibility_midgrade(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal availibility_midgrade)
	{
		getMendixObject().setValue(context, MemberNames.Availibility_midgrade.toString(), availibility_midgrade);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Dentist that = (myfirstmodule.proxies.Dentist) obj;
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
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
