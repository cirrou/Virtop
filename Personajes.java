package appinventor.ai_dnchibi.virtual_tabletop;

import com.google.appinventor.components.runtime.Component;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleMethod;
import gnu.mapping.CallContext;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;

public class Personajes$frame
  extends ModuleBody
{
  Personajes $main;
  
  public Object apply0(ModuleMethod paramModuleMethod)
  {
    switch (paramModuleMethod.selector)
    {
    default: 
      return super.apply0(paramModuleMethod);
    case 15: 
      return Personajes.lambda2();
    case 16: 
      this.$main.$define();
      return Values.empty;
    }
    return Personajes.lambda3();
  }
  
  public Object apply1(ModuleMethod paramModuleMethod, Object paramObject)
  {
    switch (paramModuleMethod.selector)
    {
    case 2: 
    case 4: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    default: 
      return super.apply1(paramModuleMethod, paramObject);
    case 1: 
      this.$main.androidLogForm(paramObject);
      return Values.empty;
    case 3: 
      paramModuleMethod = this.$main;
    }
    try
    {
      localSymbol = (Symbol)paramObject;
      return paramModuleMethod.lookupInFormEnvironment(localSymbol);
    }
    catch (ClassCastException paramModuleMethod)
    {
      Symbol localSymbol;
      throw new WrongType(paramModuleMethod, "lookup-in-form-environment", 1, paramObject);
    }
    paramModuleMethod = this.$main;
    try
    {
      localSymbol = (Symbol)paramObject;
      if (paramModuleMethod.isBoundInFormEnvironment(localSymbol)) {
        return Boolean.TRUE;
      }
      return Boolean.FALSE;
    }
    catch (ClassCastException paramModuleMethod)
    {
      throw new WrongType(paramModuleMethod, "is-bound-in-form-environment", 1, paramObject);
    }
    this.$main.addToFormDoAfterCreation(paramObject);
    return Values.empty;
    this.$main.sendError(paramObject);
    return Values.empty;
    this.$main.processException(paramObject);
    return Values.empty;
  }
  
  public Object apply2(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2)
  {
    switch (paramModuleMethod.selector)
    {
    case 4: 
    case 5: 
    case 8: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      return super.apply2(paramModuleMethod, paramObject1, paramObject2);
    case 2: 
      paramModuleMethod = this.$main;
    }
    try
    {
      localSymbol = (Symbol)paramObject1;
      paramModuleMethod.addToFormEnvironment(localSymbol, paramObject2);
      return Values.empty;
    }
    catch (ClassCastException paramModuleMethod)
    {
      Symbol localSymbol;
      throw new WrongType(paramModuleMethod, "add-to-form-environment", 1, paramObject1);
    }
    paramModuleMethod = this.$main;
    try
    {
      localSymbol = (Symbol)paramObject1;
      return paramModuleMethod.lookupInFormEnvironment(localSymbol, paramObject2);
    }
    catch (ClassCastException paramModuleMethod)
    {
      throw new WrongType(paramModuleMethod, "lookup-in-form-environment", 1, paramObject1);
    }
    paramModuleMethod = this.$main;
    try
    {
      localSymbol = (Symbol)paramObject1;
      paramModuleMethod.addToGlobalVarEnvironment(localSymbol, paramObject2);
      return Values.empty;
    }
    catch (ClassCastException paramModuleMethod)
    {
      throw new WrongType(paramModuleMethod, "add-to-global-var-environment", 1, paramObject1);
    }
    this.$main.addToEvents(paramObject1, paramObject2);
    return Values.empty;
    this.$main.addToGlobalVars(paramObject1, paramObject2);
    return Values.empty;
    return this.$main.lookupHandler(paramObject1, paramObject2);
  }
  
  /* Error */
  public Object apply4(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 19	gnu/expr/ModuleMethod:selector	I
    //   4: lookupswitch	default:+28->32, 8:+40->44, 13:+57->61
    //   32: aload_0
    //   33: aload_1
    //   34: aload_2
    //   35: aload_3
    //   36: aload 4
    //   38: aload 5
    //   40: invokespecial 121	gnu/expr/ModuleBody:apply4	(Lgnu/expr/ModuleMethod;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   43: areturn
    //   44: aload_0
    //   45: getfield 29	appinventor/ai_dnchibi/virtual_tabletop/Personajes$frame:$main	Lappinventor/ai_dnchibi/virtual_tabletop/Personajes;
    //   48: aload_2
    //   49: aload_3
    //   50: aload 4
    //   52: aload 5
    //   54: invokevirtual 125	appinventor/ai_dnchibi/virtual_tabletop/Personajes:addToComponents	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   57: getstatic 38	gnu/mapping/Values:empty	Lgnu/mapping/Values;
    //   60: areturn
    //   61: aload_0
    //   62: getfield 29	appinventor/ai_dnchibi/virtual_tabletop/Personajes$frame:$main	Lappinventor/ai_dnchibi/virtual_tabletop/Personajes;
    //   65: astore_1
    //   66: aload_2
    //   67: checkcast 127	com/google/appinventor/components/runtime/Component
    //   70: astore 6
    //   72: aload_3
    //   73: checkcast 129	java/lang/String
    //   76: astore_2
    //   77: aload 4
    //   79: checkcast 129	java/lang/String
    //   82: astore_3
    //   83: aload 5
    //   85: checkcast 131	[Ljava/lang/Object;
    //   88: astore 4
    //   90: aload_1
    //   91: aload 6
    //   93: aload_2
    //   94: aload_3
    //   95: aload 4
    //   97: invokevirtual 135	appinventor/ai_dnchibi/virtual_tabletop/Personajes:dispatchEvent	(Lcom/google/appinventor/components/runtime/Component;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Z
    //   100: ifeq +7 -> 107
    //   103: getstatic 67	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   106: areturn
    //   107: getstatic 70	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   110: areturn
    //   111: astore_1
    //   112: new 81	gnu/mapping/WrongType
    //   115: dup
    //   116: aload_1
    //   117: ldc -120
    //   119: iconst_1
    //   120: aload_2
    //   121: invokespecial 86	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   124: athrow
    //   125: astore_1
    //   126: new 81	gnu/mapping/WrongType
    //   129: dup
    //   130: aload_1
    //   131: ldc -120
    //   133: iconst_2
    //   134: aload_3
    //   135: invokespecial 86	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   138: athrow
    //   139: astore_1
    //   140: new 81	gnu/mapping/WrongType
    //   143: dup
    //   144: aload_1
    //   145: ldc -120
    //   147: iconst_3
    //   148: aload 4
    //   150: invokespecial 86	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   153: athrow
    //   154: astore_1
    //   155: new 81	gnu/mapping/WrongType
    //   158: dup
    //   159: aload_1
    //   160: ldc -120
    //   162: iconst_4
    //   163: aload 5
    //   165: invokespecial 86	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   168: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	this	frame
    //   0	169	1	paramModuleMethod	ModuleMethod
    //   0	169	2	paramObject1	Object
    //   0	169	3	paramObject2	Object
    //   0	169	4	paramObject3	Object
    //   0	169	5	paramObject4	Object
    //   70	22	6	localComponent	Component
    // Exception table:
    //   from	to	target	type
    //   66	72	111	java/lang/ClassCastException
    //   72	77	125	java/lang/ClassCastException
    //   77	83	139	java/lang/ClassCastException
    //   83	90	154	java/lang/ClassCastException
  }
  
  public int match0(ModuleMethod paramModuleMethod, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    default: 
      return super.match0(paramModuleMethod, paramCallContext);
    case 17: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    case 16: 
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 0;
      return 0;
    }
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 0;
    return 0;
  }
  
  public int match1(ModuleMethod paramModuleMethod, Object paramObject, CallContext paramCallContext)
  {
    int i = -786431;
    switch (paramModuleMethod.selector)
    {
    case 2: 
    case 4: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    default: 
      i = super.match1(paramModuleMethod, paramObject, paramCallContext);
    case 12: 
    case 11: 
    case 10: 
    case 5: 
    case 3: 
      do
      {
        do
        {
          do
          {
            return i;
          } while (!(paramObject instanceof Personajes));
          paramCallContext.value1 = paramObject;
          paramCallContext.proc = paramModuleMethod;
          paramCallContext.pc = 1;
          return 0;
          paramCallContext.value1 = paramObject;
          paramCallContext.proc = paramModuleMethod;
          paramCallContext.pc = 1;
          return 0;
          paramCallContext.value1 = paramObject;
          paramCallContext.proc = paramModuleMethod;
          paramCallContext.pc = 1;
          return 0;
        } while (!(paramObject instanceof Symbol));
        paramCallContext.value1 = paramObject;
        paramCallContext.proc = paramModuleMethod;
        paramCallContext.pc = 1;
        return 0;
      } while (!(paramObject instanceof Symbol));
      paramCallContext.value1 = paramObject;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 1;
      return 0;
    }
    paramCallContext.value1 = paramObject;
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 1;
    return 0;
  }
  
  public int match2(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    case 4: 
    case 5: 
    case 8: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    default: 
      return super.match2(paramModuleMethod, paramObject1, paramObject2, paramCallContext);
    case 14: 
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 9: 
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 7: 
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 6: 
      if (!(paramObject1 instanceof Symbol)) {
        return -786431;
      }
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    case 3: 
      if (!(paramObject1 instanceof Symbol)) {
        return -786431;
      }
      paramCallContext.value1 = paramObject1;
      paramCallContext.value2 = paramObject2;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 2;
      return 0;
    }
    if (!(paramObject1 instanceof Symbol)) {
      return -786431;
    }
    paramCallContext.value1 = paramObject1;
    paramCallContext.value2 = paramObject2;
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 2;
    return 0;
  }
  
  public int match4(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, CallContext paramCallContext)
  {
    switch (paramModuleMethod.selector)
    {
    default: 
      return super.match4(paramModuleMethod, paramObject1, paramObject2, paramObject3, paramObject4, paramCallContext);
    case 13: 
      if (!(paramObject1 instanceof Personajes)) {
        return -786431;
      }
      paramCallContext.value1 = paramObject1;
      if (!(paramObject2 instanceof Component)) {
        return -786430;
      }
      paramCallContext.value2 = paramObject2;
      if (!(paramObject3 instanceof String)) {
        return -786429;
      }
      paramCallContext.value3 = paramObject3;
      if (!(paramObject4 instanceof String)) {
        return -786428;
      }
      paramCallContext.value4 = paramObject4;
      paramCallContext.proc = paramModuleMethod;
      paramCallContext.pc = 4;
      return 0;
    }
    paramCallContext.value1 = paramObject1;
    paramCallContext.value2 = paramObject2;
    paramCallContext.value3 = paramObject3;
    paramCallContext.value4 = paramObject4;
    paramCallContext.proc = paramModuleMethod;
    paramCallContext.pc = 4;
    return 0;
  }
}
