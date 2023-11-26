// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Equipment_order
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject equipment_orderMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Equipment_order";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DateOfOrder("DateOfOrder"),
		Name("Name"),
		Amount("Amount"),
		Unit("Unit"),
		creates_eq_order("MyFirstModule.creates_eq_order"),
		doc_eq("MyFirstModule.doc_eq");

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

	public Equipment_order(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Equipment_order(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject equipment_orderMendixObject)
	{
		if (equipment_orderMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, equipment_orderMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.equipment_orderMendixObject = equipment_orderMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Equipment_order.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Equipment_order initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Equipment_order.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.Equipment_order initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Equipment_order(context, mendixObject);
	}

	public static myfirstmodule.proxies.Equipment_order load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Equipment_order.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Equipment_order> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.Equipment_order.initialize(context, obj))
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
	 * @return value of DateOfOrder
	 */
	public final java.util.Date getDateOfOrder()
	{
		return getDateOfOrder(getContext());
	}

	/**
	 * @param context
	 * @return value of DateOfOrder
	 */
	public final java.util.Date getDateOfOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateOfOrder.toString());
	}

	/**
	 * Set value of DateOfOrder
	 * @param dateoforder
	 */
	public final void setDateOfOrder(java.util.Date dateoforder)
	{
		setDateOfOrder(getContext(), dateoforder);
	}

	/**
	 * Set value of DateOfOrder
	 * @param context
	 * @param dateoforder
	 */
	public final void setDateOfOrder(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date dateoforder)
	{
		getMendixObject().setValue(context, MemberNames.DateOfOrder.toString(), dateoforder);
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final myfirstmodule.proxies.Equipment getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final myfirstmodule.proxies.Equipment getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Name.toString());
		if (obj == null) {
			return null;
		}
		return myfirstmodule.proxies.Equipment.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(myfirstmodule.proxies.Equipment name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Equipment name)
	{
		if (name != null) {
			getMendixObject().setValue(context, MemberNames.Name.toString(), name.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.Name.toString(), null);
		}
	}

	/**
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount()
	{
		return getAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Amount.toString());
	}

	/**
	 * Set value of Amount
	 * @param amount
	 */
	public final void setAmount(java.lang.Integer amount)
	{
		setAmount(getContext(), amount);
	}

	/**
	 * Set value of Amount
	 * @param context
	 * @param amount
	 */
	public final void setAmount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer amount)
	{
		getMendixObject().setValue(context, MemberNames.Amount.toString(), amount);
	}

	/**
	 * @return value of Unit
	 */
	public final java.lang.String getUnit()
	{
		return getUnit(getContext());
	}

	/**
	 * @param context
	 * @return value of Unit
	 */
	public final java.lang.String getUnit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Unit.toString());
	}

	/**
	 * Set value of Unit
	 * @param unit
	 */
	public final void setUnit(java.lang.String unit)
	{
		setUnit(getContext(), unit);
	}

	/**
	 * Set value of Unit
	 * @param context
	 * @param unit
	 */
	public final void setUnit(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String unit)
	{
		getMendixObject().setValue(context, MemberNames.Unit.toString(), unit);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of creates_eq_order
	 */
	public final myfirstmodule.proxies.Medical_staff getcreates_eq_order() throws com.mendix.core.CoreException
	{
		return getcreates_eq_order(getContext());
	}

	/**
	 * @param context
	 * @return value of creates_eq_order
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Medical_staff getcreates_eq_order(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Medical_staff result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.creates_eq_order.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Medical_staff.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of creates_eq_order
	 * @param creates_eq_order
	 */
	public final void setcreates_eq_order(myfirstmodule.proxies.Medical_staff creates_eq_order)
	{
		setcreates_eq_order(getContext(), creates_eq_order);
	}

	/**
	 * Set value of creates_eq_order
	 * @param context
	 * @param creates_eq_order
	 */
	public final void setcreates_eq_order(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Medical_staff creates_eq_order)
	{
		if (creates_eq_order == null) {
			getMendixObject().setValue(context, MemberNames.creates_eq_order.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.creates_eq_order.toString(), creates_eq_order.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of doc_eq
	 */
	public final myfirstmodule.proxies.Eq_doc getdoc_eq() throws com.mendix.core.CoreException
	{
		return getdoc_eq(getContext());
	}

	/**
	 * @param context
	 * @return value of doc_eq
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Eq_doc getdoc_eq(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Eq_doc result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.doc_eq.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Eq_doc.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of doc_eq
	 * @param doc_eq
	 */
	public final void setdoc_eq(myfirstmodule.proxies.Eq_doc doc_eq)
	{
		setdoc_eq(getContext(), doc_eq);
	}

	/**
	 * Set value of doc_eq
	 * @param context
	 * @param doc_eq
	 */
	public final void setdoc_eq(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Eq_doc doc_eq)
	{
		if (doc_eq == null) {
			getMendixObject().setValue(context, MemberNames.doc_eq.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.doc_eq.toString(), doc_eq.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return equipment_orderMendixObject;
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
			final myfirstmodule.proxies.Equipment_order that = (myfirstmodule.proxies.Equipment_order) obj;
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
