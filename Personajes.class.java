package appinventor.ai_dnchibi.virtual_tabletop;

import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.lists.Consumer;
import gnu.lists.LList;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.standard.Scheme;

public class Personajes
  extends Form
  implements Runnable
{
  static final SimpleSymbol Lit0 = (SimpleSymbol)new SimpleSymbol("Personajes").readResolve();
  static final SimpleSymbol Lit1;
  static final SimpleSymbol Lit10;
  static final SimpleSymbol Lit11;
  static final SimpleSymbol Lit12;
  static final SimpleSymbol Lit13;
  static final SimpleSymbol Lit14;
  static final SimpleSymbol Lit15;
  static final SimpleSymbol Lit16;
  static final SimpleSymbol Lit17 = (SimpleSymbol)new SimpleSymbol("lookup-handler").readResolve();
  static final SimpleSymbol Lit2;
  static final SimpleSymbol Lit3;
  static final SimpleSymbol Lit4;
  static final SimpleSymbol Lit5;
  static final SimpleSymbol Lit6;
  static final SimpleSymbol Lit7;
  static final SimpleSymbol Lit8;
  static final SimpleSymbol Lit9;
  public static Personajes Personajes;
  static final ModuleMethod lambda$Fn1;
  static final ModuleMethod lambda$Fn2;
  public Boolean $Stdebug$Mnform$St;
  public final ModuleMethod $define;
  public final ModuleMethod add$Mnto$Mncomponents;
  public final ModuleMethod add$Mnto$Mnevents;
  public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
  public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
  public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
  public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
  public final ModuleMethod android$Mnlog$Mnform;
  public LList components$Mnto$Mncreate;
  public final ModuleMethod dispatchEvent;
  public LList events$Mnto$Mnregister;
  public LList form$Mndo$Mnafter$Mncreation;
  public Environment form$Mnenvironment;
  public Symbol form$Mnname$Mnsymbol;
  public Environment global$Mnvar$Mnenvironment;
  public LList global$Mnvars$Mnto$Mncreate;
  public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
  public final ModuleMethod lookup$Mnhandler;
  public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
  public final ModuleMethod process$Mnexception;
  public final ModuleMethod send$Mnerror;
  
  static
  {
    Lit16 = (SimpleSymbol)new SimpleSymbol("dispatchEvent").readResolve();
    Lit15 = (SimpleSymbol)new SimpleSymbol("send-error").readResolve();
    Lit14 = (SimpleSymbol)new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    Lit13 = (SimpleSymbol)new SimpleSymbol("add-to-global-vars").readResolve();
    Lit12 = (SimpleSymbol)new SimpleSymbol("add-to-components").readResolve();
    Lit11 = (SimpleSymbol)new SimpleSymbol("add-to-events").readResolve();
    Lit10 = (SimpleSymbol)new SimpleSymbol("add-to-global-var-environment").readResolve();
    Lit9 = (SimpleSymbol)new SimpleSymbol("is-bound-in-form-environment").readResolve();
    Lit8 = (SimpleSymbol)new SimpleSymbol("lookup-in-form-environment").readResolve();
    Lit7 = (SimpleSymbol)new SimpleSymbol("add-to-form-environment").readResolve();
    Lit6 = (SimpleSymbol)new SimpleSymbol("android-log-form").readResolve();
    Lit5 = (SimpleSymbol)new SimpleSymbol("Title").readResolve();
    Lit4 = (SimpleSymbol)new SimpleSymbol("text").readResolve();
    Lit3 = (SimpleSymbol)new SimpleSymbol("AppName").readResolve();
    Lit2 = (SimpleSymbol)new SimpleSymbol("*the-null-value*").readResolve();
    Lit1 = (SimpleSymbol)new SimpleSymbol("getMessage").readResolve();
  }
  
  public Personajes()
  {
    ModuleInfo.register(this);
    Personajes.frame localframe = new Personajes.frame();
    localframe.$main = this;
    this.android$Mnlog$Mnform = new ModuleMethod(localframe, 1, Lit6, 4097);
    this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(localframe, 2, Lit7, 8194);
    this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 3, Lit8, 8193);
    this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 5, Lit9, 4097);
    this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(localframe, 6, Lit10, 8194);
    this.add$Mnto$Mnevents = new ModuleMethod(localframe, 7, Lit11, 8194);
    this.add$Mnto$Mncomponents = new ModuleMethod(localframe, 8, Lit12, 16388);
    this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(localframe, 9, Lit13, 8194);
    this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(localframe, 10, Lit14, 4097);
    this.send$Mnerror = new ModuleMethod(localframe, 11, Lit15, 4097);
    this.process$Mnexception = new ModuleMethod(localframe, 12, "process-exception", 4097);
    this.dispatchEvent = new ModuleMethod(localframe, 13, Lit16, 16388);
    this.lookup$Mnhandler = new ModuleMethod(localframe, 14, Lit17, 8194);
    ModuleMethod localModuleMethod = new ModuleMethod(localframe, 15, null, 0);
    localModuleMethod.setProperty("source-location", "/tmp/runtime3360684575095069687.scm:552");
    lambda$Fn1 = localModuleMethod;
    this.$define = new ModuleMethod(localframe, 16, "$define", 0);
    lambda$Fn2 = new ModuleMethod(localframe, 17, null, 0);
  }
  
  /* Error */
  public static SimpleSymbol lambda1symbolAppend$V(Object[] paramArrayOfObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: invokestatic 213	gnu/lists/LList:makeList	([Ljava/lang/Object;I)Lgnu/lists/LList;
    //   5: astore_1
    //   6: getstatic 219	kawa/standard/Scheme:apply	Lgnu/kawa/functions/Apply;
    //   9: astore_2
    //   10: getstatic 224	kawa/lib/strings:string$Mnappend	Lgnu/expr/ModuleMethod;
    //   13: astore_3
    //   14: getstatic 227	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   17: astore_0
    //   18: aload_1
    //   19: getstatic 227	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   22: if_acmpne +23 -> 45
    //   25: aload_2
    //   26: aload_3
    //   27: aload_0
    //   28: invokestatic 231	gnu/lists/LList:reverseInPlace	(Ljava/lang/Object;)Lgnu/lists/LList;
    //   31: invokevirtual 237	gnu/mapping/Procedure:apply2	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   34: astore_0
    //   35: aload_0
    //   36: checkcast 239	java/lang/CharSequence
    //   39: astore_1
    //   40: aload_1
    //   41: invokestatic 245	kawa/lib/misc:string$To$Symbol	(Ljava/lang/CharSequence;)Lgnu/mapping/SimpleSymbol;
    //   44: areturn
    //   45: aload_1
    //   46: checkcast 247	gnu/lists/Pair
    //   49: astore 4
    //   51: aload 4
    //   53: invokevirtual 250	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   56: astore_1
    //   57: aload 4
    //   59: invokevirtual 253	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   62: astore 4
    //   64: aload 4
    //   66: checkcast 255	gnu/mapping/Symbol
    //   69: astore 5
    //   71: aload 5
    //   73: invokestatic 259	kawa/lib/misc:symbol$To$String	(Lgnu/mapping/Symbol;)Ljava/lang/String;
    //   76: aload_0
    //   77: invokestatic 263	gnu/lists/Pair:make	(Ljava/lang/Object;Ljava/lang/Object;)Lgnu/lists/Pair;
    //   80: astore_0
    //   81: goto -63 -> 18
    //   84: astore_0
    //   85: new 265	gnu/mapping/WrongType
    //   88: dup
    //   89: aload_0
    //   90: ldc_w 267
    //   93: bipush -2
    //   95: aload_1
    //   96: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   99: athrow
    //   100: astore_0
    //   101: new 265	gnu/mapping/WrongType
    //   104: dup
    //   105: aload_0
    //   106: ldc_w 272
    //   109: iconst_1
    //   110: aload 4
    //   112: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   115: athrow
    //   116: astore_1
    //   117: new 265	gnu/mapping/WrongType
    //   120: dup
    //   121: aload_1
    //   122: ldc_w 274
    //   125: iconst_1
    //   126: aload_0
    //   127: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   130: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	paramArrayOfObject	Object[]
    //   5	91	1	localObject1	Object
    //   116	6	1	localClassCastException	ClassCastException
    //   9	17	2	localApply	gnu.kawa.functions.Apply
    //   13	14	3	localModuleMethod	ModuleMethod
    //   49	62	4	localObject2	Object
    //   69	3	5	localSymbol	Symbol
    // Exception table:
    //   from	to	target	type
    //   45	51	84	java/lang/ClassCastException
    //   64	71	100	java/lang/ClassCastException
    //   35	40	116	java/lang/ClassCastException
  }
  
  static Object lambda2()
  {
    return null;
  }
  
  static Object lambda3()
  {
    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "virtual_tabletop", Lit4);
    return runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Personajes", Lit4);
  }
  
  /* Error */
  public void $define()
  {
    // Byte code:
    //   0: invokestatic 292	kawa/standard/Scheme:getInstance	()Lkawa/standard/Scheme;
    //   3: invokestatic 298	gnu/expr/Language:setDefaults	(Lgnu/expr/Language;)V
    //   6: aload_0
    //   7: invokevirtual 301	appinventor/ai_dnchibi/virtual_tabletop/Personajes:run	()V
    //   10: aload_0
    //   11: putstatic 303	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Personajes	Lappinventor/ai_dnchibi/virtual_tabletop/Personajes;
    //   14: aload_0
    //   15: getstatic 138	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Lit0	Lgnu/mapping/SimpleSymbol;
    //   18: aload_0
    //   19: invokevirtual 307	appinventor/ai_dnchibi/virtual_tabletop/Personajes:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   22: aload_0
    //   23: getfield 309	appinventor/ai_dnchibi/virtual_tabletop/Personajes:events$Mnto$Mnregister	Lgnu/lists/LList;
    //   26: astore_1
    //   27: aload_1
    //   28: getstatic 227	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   31: if_acmpne +96 -> 127
    //   34: aload_0
    //   35: getstatic 131	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Lit2	Lgnu/mapping/SimpleSymbol;
    //   38: getstatic 198	appinventor/ai_dnchibi/virtual_tabletop/Personajes:lambda$Fn1	Lgnu/expr/ModuleMethod;
    //   41: invokevirtual 312	appinventor/ai_dnchibi/virtual_tabletop/Personajes:addToGlobalVars	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   44: aload_0
    //   45: getfield 314	appinventor/ai_dnchibi/virtual_tabletop/Personajes:global$Mnvars$Mnto$Mncreate	Lgnu/lists/LList;
    //   48: invokestatic 320	kawa/lib/lists:reverse	(Lgnu/lists/LList;)Lgnu/lists/LList;
    //   51: astore_1
    //   52: aload_1
    //   53: getstatic 227	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   56: if_acmpne +139 -> 195
    //   59: aload_0
    //   60: getfield 322	appinventor/ai_dnchibi/virtual_tabletop/Personajes:form$Mndo$Mnafter$Mncreation	Lgnu/lists/LList;
    //   63: invokestatic 320	kawa/lib/lists:reverse	(Lgnu/lists/LList;)Lgnu/lists/LList;
    //   66: astore_1
    //   67: aload_1
    //   68: getstatic 227	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   71: if_acmpne +214 -> 285
    //   74: aload_0
    //   75: getfield 324	appinventor/ai_dnchibi/virtual_tabletop/Personajes:components$Mnto$Mncreate	Lgnu/lists/LList;
    //   78: invokestatic 320	kawa/lib/lists:reverse	(Lgnu/lists/LList;)Lgnu/lists/LList;
    //   81: astore_1
    //   82: aload_1
    //   83: astore_2
    //   84: aload_2
    //   85: getstatic 227	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   88: if_acmpne +234 -> 322
    //   91: aload_1
    //   92: astore_2
    //   93: aload_2
    //   94: getstatic 227	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   97: if_acmpne +379 -> 476
    //   100: getstatic 227	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   103: astore_2
    //   104: aload_1
    //   105: aload_2
    //   106: if_acmpne +435 -> 541
    //   109: return
    //   110: astore_1
    //   111: aload_0
    //   112: aload_1
    //   113: invokevirtual 327	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   116: invokevirtual 330	appinventor/ai_dnchibi/virtual_tabletop/Personajes:androidLogForm	(Ljava/lang/Object;)V
    //   119: aload_0
    //   120: aload_1
    //   121: invokevirtual 333	appinventor/ai_dnchibi/virtual_tabletop/Personajes:processException	(Ljava/lang/Object;)V
    //   124: goto -114 -> 10
    //   127: aload_1
    //   128: checkcast 247	gnu/lists/Pair
    //   131: astore_3
    //   132: aload_3
    //   133: invokevirtual 253	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   136: astore_2
    //   137: getstatic 337	kawa/lib/lists:car	Lgnu/expr/GenericProc;
    //   140: aload_2
    //   141: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   144: astore_1
    //   145: aload_1
    //   146: ifnonnull +33 -> 179
    //   149: aconst_null
    //   150: astore_1
    //   151: getstatic 344	kawa/lib/lists:cdr	Lgnu/expr/GenericProc;
    //   154: aload_2
    //   155: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   158: astore_2
    //   159: aload_2
    //   160: ifnonnull +27 -> 187
    //   163: aconst_null
    //   164: astore_2
    //   165: aload_0
    //   166: aload_1
    //   167: aload_2
    //   168: invokestatic 350	com/google/appinventor/components/runtime/EventDispatcher:registerEventForDelegation	(Lcom/google/appinventor/components/runtime/HandlesEventDispatching;Ljava/lang/String;Ljava/lang/String;)V
    //   171: aload_3
    //   172: invokevirtual 250	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   175: astore_1
    //   176: goto -149 -> 27
    //   179: aload_1
    //   180: invokevirtual 355	java/lang/Object:toString	()Ljava/lang/String;
    //   183: astore_1
    //   184: goto -33 -> 151
    //   187: aload_2
    //   188: invokevirtual 355	java/lang/Object:toString	()Ljava/lang/String;
    //   191: astore_2
    //   192: goto -27 -> 165
    //   195: aload_1
    //   196: checkcast 247	gnu/lists/Pair
    //   199: astore_2
    //   200: aload_2
    //   201: invokevirtual 253	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   204: astore_3
    //   205: getstatic 337	kawa/lib/lists:car	Lgnu/expr/GenericProc;
    //   208: aload_3
    //   209: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   212: astore_1
    //   213: getstatic 358	kawa/lib/lists:cadr	Lgnu/expr/GenericProc;
    //   216: aload_3
    //   217: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   220: astore_3
    //   221: aload_1
    //   222: checkcast 255	gnu/mapping/Symbol
    //   225: astore 4
    //   227: aload_0
    //   228: aload 4
    //   230: getstatic 362	kawa/standard/Scheme:applyToArgs	Lgnu/kawa/functions/ApplyToArgs;
    //   233: aload_3
    //   234: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   237: invokevirtual 365	appinventor/ai_dnchibi/virtual_tabletop/Personajes:addToGlobalVarEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   240: aload_2
    //   241: invokevirtual 250	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   244: astore_1
    //   245: goto -193 -> 52
    //   248: astore_2
    //   249: new 265	gnu/mapping/WrongType
    //   252: dup
    //   253: aload_2
    //   254: ldc_w 267
    //   257: bipush -2
    //   259: aload_1
    //   260: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   263: athrow
    //   264: astore_1
    //   265: aload_0
    //   266: aload_1
    //   267: invokevirtual 333	appinventor/ai_dnchibi/virtual_tabletop/Personajes:processException	(Ljava/lang/Object;)V
    //   270: return
    //   271: astore_2
    //   272: new 265	gnu/mapping/WrongType
    //   275: dup
    //   276: aload_2
    //   277: ldc 97
    //   279: iconst_0
    //   280: aload_1
    //   281: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   284: athrow
    //   285: aload_1
    //   286: checkcast 247	gnu/lists/Pair
    //   289: astore_2
    //   290: aload_2
    //   291: invokevirtual 253	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   294: invokestatic 368	kawa/lib/misc:force	(Ljava/lang/Object;)Ljava/lang/Object;
    //   297: pop
    //   298: aload_2
    //   299: invokevirtual 250	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   302: astore_1
    //   303: goto -236 -> 67
    //   306: astore_2
    //   307: new 265	gnu/mapping/WrongType
    //   310: dup
    //   311: aload_2
    //   312: ldc_w 267
    //   315: bipush -2
    //   317: aload_1
    //   318: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   321: athrow
    //   322: aload_2
    //   323: checkcast 247	gnu/lists/Pair
    //   326: astore_3
    //   327: aload_3
    //   328: invokevirtual 253	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   331: astore 5
    //   333: getstatic 371	kawa/lib/lists:caddr	Lgnu/expr/GenericProc;
    //   336: aload 5
    //   338: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   341: astore_2
    //   342: getstatic 374	kawa/lib/lists:cadddr	Lgnu/expr/GenericProc;
    //   345: aload 5
    //   347: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   350: pop
    //   351: getstatic 358	kawa/lib/lists:cadr	Lgnu/expr/GenericProc;
    //   354: aload 5
    //   356: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   359: astore 4
    //   361: getstatic 337	kawa/lib/lists:car	Lgnu/expr/GenericProc;
    //   364: aload 5
    //   366: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   369: astore 5
    //   371: aload 5
    //   373: checkcast 255	gnu/mapping/Symbol
    //   376: astore 6
    //   378: aload_0
    //   379: aload 6
    //   381: invokevirtual 378	appinventor/ai_dnchibi/virtual_tabletop/Personajes:lookupInFormEnvironment	(Lgnu/mapping/Symbol;)Ljava/lang/Object;
    //   384: astore 5
    //   386: getstatic 383	gnu/kawa/reflect/Invoke:make	Lgnu/kawa/reflect/Invoke;
    //   389: aload 4
    //   391: aload 5
    //   393: invokevirtual 237	gnu/mapping/Procedure:apply2	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   396: astore 4
    //   398: getstatic 389	gnu/kawa/reflect/SlotSet:set$Mnfield$Ex	Lgnu/kawa/reflect/SlotSet;
    //   401: aload_0
    //   402: aload_2
    //   403: aload 4
    //   405: invokevirtual 393	gnu/mapping/Procedure:apply3	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   408: pop
    //   409: aload_2
    //   410: checkcast 255	gnu/mapping/Symbol
    //   413: astore 5
    //   415: aload_0
    //   416: aload 5
    //   418: aload 4
    //   420: invokevirtual 307	appinventor/ai_dnchibi/virtual_tabletop/Personajes:addToFormEnvironment	(Lgnu/mapping/Symbol;Ljava/lang/Object;)V
    //   423: aload_3
    //   424: invokevirtual 250	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   427: astore_2
    //   428: goto -344 -> 84
    //   431: astore_1
    //   432: new 265	gnu/mapping/WrongType
    //   435: dup
    //   436: aload_1
    //   437: ldc_w 267
    //   440: bipush -2
    //   442: aload_2
    //   443: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   446: athrow
    //   447: astore_1
    //   448: new 265	gnu/mapping/WrongType
    //   451: dup
    //   452: aload_1
    //   453: ldc 105
    //   455: iconst_0
    //   456: aload 5
    //   458: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   461: athrow
    //   462: astore_1
    //   463: new 265	gnu/mapping/WrongType
    //   466: dup
    //   467: aload_1
    //   468: ldc 109
    //   470: iconst_0
    //   471: aload_2
    //   472: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   475: athrow
    //   476: aload_2
    //   477: checkcast 247	gnu/lists/Pair
    //   480: astore_3
    //   481: aload_3
    //   482: invokevirtual 253	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   485: astore_2
    //   486: getstatic 371	kawa/lib/lists:caddr	Lgnu/expr/GenericProc;
    //   489: aload_2
    //   490: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   493: pop
    //   494: getstatic 374	kawa/lib/lists:cadddr	Lgnu/expr/GenericProc;
    //   497: aload_2
    //   498: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   501: astore_2
    //   502: aload_2
    //   503: getstatic 398	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   506: if_acmpeq +11 -> 517
    //   509: getstatic 362	kawa/standard/Scheme:applyToArgs	Lgnu/kawa/functions/ApplyToArgs;
    //   512: aload_2
    //   513: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   516: pop
    //   517: aload_3
    //   518: invokevirtual 250	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   521: astore_2
    //   522: goto -429 -> 93
    //   525: astore_1
    //   526: new 265	gnu/mapping/WrongType
    //   529: dup
    //   530: aload_1
    //   531: ldc_w 267
    //   534: bipush -2
    //   536: aload_2
    //   537: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   540: athrow
    //   541: aload_1
    //   542: checkcast 247	gnu/lists/Pair
    //   545: astore_2
    //   546: aload_2
    //   547: invokevirtual 253	gnu/lists/Pair:getCar	()Ljava/lang/Object;
    //   550: astore_1
    //   551: getstatic 371	kawa/lib/lists:caddr	Lgnu/expr/GenericProc;
    //   554: aload_1
    //   555: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   558: astore_3
    //   559: getstatic 374	kawa/lib/lists:cadddr	Lgnu/expr/GenericProc;
    //   562: aload_1
    //   563: invokevirtual 341	gnu/mapping/Procedure:apply1	(Ljava/lang/Object;)Ljava/lang/Object;
    //   566: pop
    //   567: aload_0
    //   568: getstatic 404	gnu/kawa/reflect/SlotGet:field	Lgnu/kawa/reflect/SlotGet;
    //   571: aload_0
    //   572: aload_3
    //   573: invokevirtual 237	gnu/mapping/Procedure:apply2	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   576: invokevirtual 407	appinventor/ai_dnchibi/virtual_tabletop/Personajes:callInitialize	(Ljava/lang/Object;)V
    //   579: aload_2
    //   580: invokevirtual 250	gnu/lists/Pair:getCdr	()Ljava/lang/Object;
    //   583: astore_1
    //   584: goto -484 -> 100
    //   587: astore_2
    //   588: new 265	gnu/mapping/WrongType
    //   591: dup
    //   592: aload_2
    //   593: ldc_w 267
    //   596: bipush -2
    //   598: aload_1
    //   599: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   602: athrow
    //   603: astore_2
    //   604: new 265	gnu/mapping/WrongType
    //   607: dup
    //   608: aload_2
    //   609: ldc_w 267
    //   612: bipush -2
    //   614: aload_1
    //   615: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   618: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	619	0	this	Personajes
    //   26	79	1	localLList	LList
    //   110	18	1	localException	Exception
    //   144	116	1	localObject1	Object
    //   264	22	1	localYailRuntimeError	YailRuntimeError
    //   302	16	1	localObject2	Object
    //   431	6	1	localClassCastException1	ClassCastException
    //   447	6	1	localClassCastException2	ClassCastException
    //   462	6	1	localClassCastException3	ClassCastException
    //   525	17	1	localClassCastException4	ClassCastException
    //   550	65	1	localObject3	Object
    //   83	158	2	localObject4	Object
    //   248	6	2	localClassCastException5	ClassCastException
    //   271	6	2	localClassCastException6	ClassCastException
    //   289	10	2	localPair	gnu.lists.Pair
    //   306	17	2	localClassCastException7	ClassCastException
    //   341	239	2	localObject5	Object
    //   587	6	2	localClassCastException8	ClassCastException
    //   603	6	2	localClassCastException9	ClassCastException
    //   131	442	3	localObject6	Object
    //   225	194	4	localObject7	Object
    //   331	126	5	localObject8	Object
    //   376	4	6	localSymbol	Symbol
    // Exception table:
    //   from	to	target	type
    //   6	10	110	java/lang/Exception
    //   195	200	248	java/lang/ClassCastException
    //   34	52	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   52	67	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   67	82	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   84	91	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   93	100	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   100	104	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   195	200	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   200	221	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   221	227	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   227	245	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   249	264	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   272	285	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   285	290	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   290	303	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   307	322	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   322	327	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   327	371	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   371	378	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   378	409	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   409	415	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   415	428	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   432	447	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   448	462	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   463	476	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   476	481	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   481	517	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   517	522	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   526	541	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   541	546	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   546	584	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   588	603	264	com/google/appinventor/components/runtime/errors/YailRuntimeError
    //   221	227	271	java/lang/ClassCastException
    //   285	290	306	java/lang/ClassCastException
    //   322	327	431	java/lang/ClassCastException
    //   371	378	447	java/lang/ClassCastException
    //   409	415	462	java/lang/ClassCastException
    //   476	481	525	java/lang/ClassCastException
    //   541	546	587	java/lang/ClassCastException
    //   127	132	603	java/lang/ClassCastException
  }
  
  public void addToComponents(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    this.components$Mnto$Mncreate = lists.cons(LList.list4(paramObject1, paramObject2, paramObject3, paramObject4), this.components$Mnto$Mncreate);
  }
  
  public void addToEvents(Object paramObject1, Object paramObject2)
  {
    this.events$Mnto$Mnregister = lists.cons(lists.cons(paramObject1, paramObject2), this.events$Mnto$Mnregister);
  }
  
  public void addToFormDoAfterCreation(Object paramObject)
  {
    this.form$Mndo$Mnafter$Mncreation = lists.cons(paramObject, this.form$Mndo$Mnafter$Mncreation);
  }
  
  public void addToFormEnvironment(Symbol paramSymbol, Object paramObject)
  {
    androidLogForm(Format.formatToString(0, new Object[] { "Adding ~A to env ~A with value ~A", paramSymbol, this.form$Mnenvironment, paramObject }));
    this.form$Mnenvironment.put(paramSymbol, paramObject);
  }
  
  public void addToGlobalVarEnvironment(Symbol paramSymbol, Object paramObject)
  {
    androidLogForm(Format.formatToString(0, new Object[] { "Adding ~A to env ~A with value ~A", paramSymbol, this.global$Mnvar$Mnenvironment, paramObject }));
    this.global$Mnvar$Mnenvironment.put(paramSymbol, paramObject);
  }
  
  public void addToGlobalVars(Object paramObject1, Object paramObject2)
  {
    this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(paramObject1, paramObject2), this.global$Mnvars$Mnto$Mncreate);
  }
  
  public void androidLogForm(Object paramObject) {}
  
  public boolean dispatchEvent(Component paramComponent, String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    boolean bool = false;
    SimpleSymbol localSimpleSymbol = misc.string$To$Symbol(paramString1);
    if (isBoundInFormEnvironment(localSimpleSymbol))
    {
      if (lookupInFormEnvironment(localSimpleSymbol) == paramComponent) {
        paramComponent = lookupHandler(paramString1, paramString2);
      }
      try
      {
        Scheme.apply.apply2(paramComponent, LList.makeList(paramArrayOfObject, 0));
        bool = true;
        return bool;
      }
      catch (Throwable paramComponent)
      {
        androidLogForm(paramComponent.getMessage());
        paramComponent.printStackTrace();
        processException(paramComponent);
        return false;
      }
    }
    EventDispatcher.unregisterEventForDelegation(this, paramString1, paramString2);
    return false;
  }
  
  public boolean isBoundInFormEnvironment(Symbol paramSymbol)
  {
    return this.form$Mnenvironment.isBound(paramSymbol);
  }
  
  public Object lookupHandler(Object paramObject1, Object paramObject2)
  {
    Object localObject = null;
    if (paramObject1 == null)
    {
      paramObject1 = null;
      if (paramObject2 != null) {
        break label35;
      }
    }
    label35:
    for (paramObject2 = localObject;; paramObject2 = paramObject2.toString())
    {
      return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName((String)paramObject1, (String)paramObject2)));
      paramObject1 = paramObject1.toString();
      break;
    }
  }
  
  public Object lookupInFormEnvironment(Symbol paramSymbol)
  {
    return lookupInFormEnvironment(paramSymbol, Boolean.FALSE);
  }
  
  public Object lookupInFormEnvironment(Symbol paramSymbol, Object paramObject)
  {
    int i;
    if (this.form$Mnenvironment == null)
    {
      i = 1;
      i = i + 1 & 0x1;
      if (i == 0) {
        break label46;
      }
      if (!this.form$Mnenvironment.isBound(paramSymbol)) {}
    }
    for (;;)
    {
      paramObject = this.form$Mnenvironment.get(paramSymbol);
      label46:
      do
      {
        return paramObject;
        i = 0;
        break;
      } while (i == 0);
    }
  }
  
  public void processException(Object paramObject)
  {
    Object localObject = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(paramObject, Lit1));
    if (localObject == null)
    {
      localObject = null;
      if (!(paramObject instanceof YailRuntimeError)) {
        break label56;
      }
    }
    label56:
    for (paramObject = ((YailRuntimeError)paramObject).getErrorType();; paramObject = "Runtime Error")
    {
      RuntimeErrorAlert.alert(this, (String)localObject, (String)paramObject, "End Application");
      return;
      localObject = localObject.toString();
      break;
    }
  }
  
  public void run()
  {
    CallContext localCallContext = CallContext.getInstance();
    Consumer localConsumer = localCallContext.consumer;
    localCallContext.consumer = VoidConsumer.instance;
    try
    {
      run(localCallContext);
      localThrowable1 = null;
    }
    catch (Throwable localThrowable2)
    {
      Throwable localThrowable1;
      for (;;) {}
    }
    ModuleBody.runCleanup(localCallContext, localThrowable1, localConsumer);
  }
  
  /* Error */
  public final void run(CallContext paramCallContext)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 496	gnu/mapping/CallContext:consumer	Lgnu/lists/Consumer;
    //   4: astore_2
    //   5: ldc_w 513
    //   8: invokestatic 519	kawa/standard/require:find	(Ljava/lang/String;)Ljava/lang/Object;
    //   11: astore_1
    //   12: aload_1
    //   13: checkcast 6	java/lang/Runnable
    //   16: astore_3
    //   17: aload_3
    //   18: invokeinterface 520 1 0
    //   23: aload_0
    //   24: getstatic 398	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   27: putfield 522	appinventor/ai_dnchibi/virtual_tabletop/Personajes:$Stdebug$Mnform$St	Ljava/lang/Boolean;
    //   30: aload_0
    //   31: getstatic 138	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Lit0	Lgnu/mapping/SimpleSymbol;
    //   34: invokestatic 259	kawa/lib/misc:symbol$To$String	(Lgnu/mapping/Symbol;)Ljava/lang/String;
    //   37: invokestatic 525	gnu/mapping/Environment:make	(Ljava/lang/String;)Lgnu/mapping/SimpleEnvironment;
    //   40: putfield 422	appinventor/ai_dnchibi/virtual_tabletop/Personajes:form$Mnenvironment	Lgnu/mapping/Environment;
    //   43: iconst_2
    //   44: anewarray 352	java/lang/Object
    //   47: dup
    //   48: iconst_0
    //   49: getstatic 138	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Lit0	Lgnu/mapping/SimpleSymbol;
    //   52: invokestatic 259	kawa/lib/misc:symbol$To$String	(Lgnu/mapping/Symbol;)Ljava/lang/String;
    //   55: aastore
    //   56: dup
    //   57: iconst_1
    //   58: ldc_w 527
    //   61: aastore
    //   62: invokestatic 531	kawa/lib/strings:stringAppend	([Ljava/lang/Object;)Lgnu/lists/FString;
    //   65: astore_1
    //   66: aload_1
    //   67: ifnonnull +117 -> 184
    //   70: aconst_null
    //   71: astore_1
    //   72: aload_0
    //   73: aload_1
    //   74: invokestatic 525	gnu/mapping/Environment:make	(Ljava/lang/String;)Lgnu/mapping/SimpleEnvironment;
    //   77: putfield 435	appinventor/ai_dnchibi/virtual_tabletop/Personajes:global$Mnvar$Mnenvironment	Lgnu/mapping/Environment;
    //   80: aconst_null
    //   81: putstatic 303	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Personajes	Lappinventor/ai_dnchibi/virtual_tabletop/Personajes;
    //   84: aload_0
    //   85: getstatic 138	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Lit0	Lgnu/mapping/SimpleSymbol;
    //   88: putfield 533	appinventor/ai_dnchibi/virtual_tabletop/Personajes:form$Mnname$Mnsymbol	Lgnu/mapping/Symbol;
    //   91: aload_0
    //   92: getstatic 227	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   95: putfield 309	appinventor/ai_dnchibi/virtual_tabletop/Personajes:events$Mnto$Mnregister	Lgnu/lists/LList;
    //   98: aload_0
    //   99: getstatic 227	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   102: putfield 324	appinventor/ai_dnchibi/virtual_tabletop/Personajes:components$Mnto$Mncreate	Lgnu/lists/LList;
    //   105: aload_0
    //   106: getstatic 227	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   109: putfield 314	appinventor/ai_dnchibi/virtual_tabletop/Personajes:global$Mnvars$Mnto$Mncreate	Lgnu/lists/LList;
    //   112: aload_0
    //   113: getstatic 227	gnu/lists/LList:Empty	Lgnu/lists/LList;
    //   116: putfield 322	appinventor/ai_dnchibi/virtual_tabletop/Personajes:form$Mndo$Mnafter$Mncreation	Lgnu/lists/LList;
    //   119: ldc_w 513
    //   122: invokestatic 519	kawa/standard/require:find	(Ljava/lang/String;)Ljava/lang/Object;
    //   125: astore_1
    //   126: aload_1
    //   127: checkcast 6	java/lang/Runnable
    //   130: astore_3
    //   131: aload_3
    //   132: invokeinterface 520 1 0
    //   137: getstatic 537	com/google/youngandroid/runtime:$Stthis$Mnis$Mnthe$Mnrepl$St	Ljava/lang/Object;
    //   140: getstatic 398	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   143: if_acmpeq +49 -> 192
    //   146: getstatic 138	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Lit0	Lgnu/mapping/SimpleSymbol;
    //   149: getstatic 127	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Lit3	Lgnu/mapping/SimpleSymbol;
    //   152: ldc_w 278
    //   155: getstatic 123	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Lit4	Lgnu/mapping/SimpleSymbol;
    //   158: invokestatic 284	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   161: pop
    //   162: getstatic 138	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Lit0	Lgnu/mapping/SimpleSymbol;
    //   165: getstatic 119	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Lit5	Lgnu/mapping/SimpleSymbol;
    //   168: ldc -120
    //   170: getstatic 123	appinventor/ai_dnchibi/virtual_tabletop/Personajes:Lit4	Lgnu/mapping/SimpleSymbol;
    //   173: invokestatic 284	com/google/youngandroid/runtime:setAndCoerceProperty$Ex	(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   176: aload_2
    //   177: invokestatic 543	gnu/mapping/Values:writeValues	(Ljava/lang/Object;Lgnu/lists/Consumer;)V
    //   180: invokestatic 546	com/google/youngandroid/runtime:initRuntime	()V
    //   183: return
    //   184: aload_1
    //   185: invokevirtual 355	java/lang/Object:toString	()Ljava/lang/String;
    //   188: astore_1
    //   189: goto -117 -> 72
    //   192: aload_0
    //   193: new 548	kawa/lang/Promise
    //   196: dup
    //   197: getstatic 203	appinventor/ai_dnchibi/virtual_tabletop/Personajes:lambda$Fn2	Lgnu/expr/ModuleMethod;
    //   200: invokespecial 551	kawa/lang/Promise:<init>	(Lgnu/mapping/Procedure;)V
    //   203: invokevirtual 553	appinventor/ai_dnchibi/virtual_tabletop/Personajes:addToFormDoAfterCreation	(Ljava/lang/Object;)V
    //   206: goto -26 -> 180
    //   209: astore_2
    //   210: new 265	gnu/mapping/WrongType
    //   213: dup
    //   214: aload_2
    //   215: ldc_w 555
    //   218: iconst_1
    //   219: aload_1
    //   220: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   223: athrow
    //   224: astore_2
    //   225: new 265	gnu/mapping/WrongType
    //   228: dup
    //   229: aload_2
    //   230: ldc_w 555
    //   233: iconst_1
    //   234: aload_1
    //   235: invokespecial 270	gnu/mapping/WrongType:<init>	(Ljava/lang/ClassCastException;Ljava/lang/String;ILjava/lang/Object;)V
    //   238: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	this	Personajes
    //   0	239	1	paramCallContext	CallContext
    //   4	173	2	localConsumer	Consumer
    //   209	6	2	localClassCastException1	ClassCastException
    //   224	6	2	localClassCastException2	ClassCastException
    //   16	116	3	localRunnable	Runnable
    // Exception table:
    //   from	to	target	type
    //   12	17	209	java/lang/ClassCastException
    //   126	131	224	java/lang/ClassCastException
  }
  
  public void sendError(Object paramObject)
  {
    if (paramObject == null) {}
    for (paramObject = null;; paramObject = paramObject.toString())
    {
      RetValManager.sendError((String)paramObject);
      return;
    }
  }
}
