package data.entity
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.jdbc.MySQLProfile
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import com.github.tototoshi.slick.MySQLJodaSupport._
  import org.joda.time._
  import slick.model.ForeignKeyAction
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(Agent.schema, AllianceUsers.schema, ArInternalMetadata.schema, ArticleCategories.schema, ArticleHistories.schema, ArticleImages.schema, ArticleRelatedPromotions.schema, Articles.schema, ArticlesArticleSeries.schema, ArticleSeries.schema, ArticleTags.schema, Banners.schema, ChatMessages.schema, CheerMessages.schema, Companies.schema, CompanyAdminNotes.schema, CompanyBags.schema, CompanyBagTargets.schema, CompanyEntry.schema, CompanyHistories.schema, CompanyIndustry.schema, CompanyMaster.schema, CompanyPremium.schema, CompanyRelationshipPksha.schema, CompanyUpdateRejectReason.schema, CompanyUpdateRequest.schema, CompanyUserEntries.schema, CompanyUsers.schema, ContactCategories.schema, ContactMessages.schema, Contacts.schema, ContactTemporaries.schema, ContactTickets.schema, DelayedJobs.schema, Enquete.schema, Event.schema, Example.schema, FacebookUsers.schema, Favorites.schema, FreePrUpdateRequest.schema, Interviews.schema, Jgoodtech.schema, Jobs.schema, KeyPersonRejectReason.schema, KeyPersonUpdateRequest.schema, Laboratories.schema, LaboratoryGroups.schema, LaboratoryLaboratoryTags.schema, LaboratoryLinks.schema, LaboratoryTags.schema, LargeTags.schema, MailActivates.schema, MailmagUsers.schema, MailNotifications.schema, MailParams.schema, MailTargets.schema, MArea.schema, MCapital.schema, MediumTags.schema, MIndustryLarge.schema, MIndustrySmall.schema, MJobTypeLarge.schema, MJobTypeMiddle.schema, MJobTypeSmall.schema, MPrefecture.schema, NgCompanies.schema, NotificationImages.schema, Notifications.schema, NotificationTemplates.schema, OfferableResource.schema, OfferableResourceUpdateRequest.schema, OpenInnovationPortals.schema, OpenInnovatorHistories.schema, OpenInnovators.schema, PickupPromotions.schema, PkshaCompanyRecommendHistories.schema, PkshaCompanyRecommendHistoryDetails.schema, PrivateInformations.schema, ProjectDescriptions.schema, ProjectNeedsSmallTags.schema, ProjectPrSmallTags.schema, ProjectRecommends.schema, ProjectRoles.schema, Projects.schema, ProjectTags.schema, ProjectUsers.schema, PromotionHistories.schema, PromotionImages.schema, PromotionResourceHistories.schema, PromotionResources.schema, Promotions.schema, PrRejectReason.schema, PublicinfoInputCounts.schema, PushNotifications.schema, Questions.schema, ReceivePermissions.schema, RecommendedSearches.schema, RecommendTemplates.schema, RegisterTracking.schema, Roles.schema, Sales.schema, SchemaHistory.schema, SchemaMigrations.schema, Scrapes.schema, SecretInfos.schema, SiteAdmin.schema, Sitemaps.schema, SmallTags.schema, Specials.schema, SpecialTargets.schema, StaffPasswordReset.schema, SucceededCases.schema, Taggings.schema, TagOrders.schema, Tags.schema, TPreEntryCorp.schema, TPreEntryUser.schema, UserMailNotifications.schema, Users.schema, UsersRoles.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Row type of table Agent */
  type AgentRow = HCons[Option[Int],HCons[String,HCons[String,HCons[String,HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[String,HCons[String,HCons[String,HCons[Option[DateTime],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Long],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[Boolean],HCons[Option[Boolean],HCons[Option[Int],HCons[Option[String],HCons[Option[LocalDate],HCons[Option[Int],HCons[Boolean,HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[Int],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for AgentRow providing default values if available in the database schema. */
  def AgentRow(id: Option[Int] = None, name: String, nameKana: String, url: String, businessDescription: Option[String], goal: Option[String], message: Option[String], title: Option[String], resource1: Option[String], resource2: Option[String], resource3: Option[String], staffMailAddress: String, staffName: String, hashKey: String, expired: Option[DateTime], logo: Option[String], image1: Option[String], image2: Option[String], image3: Option[String], businessOverview: Option[String], sales: Option[Long], averageAge: Option[String], genderRatio: Option[String], numberOfEmployeeId: Option[Int], listingType: Option[Boolean], foreignCapitalType: Option[Boolean], industryLargeId: Option[Int], majorCustomers: Option[String], establishment: Option[LocalDate], ribbonId: Option[Int], sent: Boolean, address: Option[String], logoUrl: Option[String], image1Url: Option[String], image2Url: Option[String], image3Url: Option[String], capitalId: Option[Int], establishmentYear: Option[Int]): AgentRow = {
    id :: name :: nameKana :: url :: businessDescription :: goal :: message :: title :: resource1 :: resource2 :: resource3 :: staffMailAddress :: staffName :: hashKey :: expired :: logo :: image1 :: image2 :: image3 :: businessOverview :: sales :: averageAge :: genderRatio :: numberOfEmployeeId :: listingType :: foreignCapitalType :: industryLargeId :: majorCustomers :: establishment :: ribbonId :: sent :: address :: logoUrl :: image1Url :: image2Url :: image3Url :: capitalId :: establishmentYear :: HNil
  }
  /** GetResult implicit for fetching AgentRow objects using plain SQL queries */
  implicit def GetResultAgentRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[DateTime]], e4: GR[Option[Long]], e5: GR[Option[Boolean]], e6: GR[Option[LocalDate]], e7: GR[Boolean]): GR[AgentRow] = GR{
    prs => import prs._
    <<?[Int] :: <<[String] :: <<[String] :: <<[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<[String] :: <<[String] :: <<[String] :: <<[Option[DateTime]] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Long] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[Boolean] :: <<?[Boolean] :: <<?[Int] :: <<?[String] :: <<?[LocalDate] :: <<?[Int] :: <<[Boolean] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[Int] :: HNil
  }
  /** Table description of table agent. Objects of this class serve as prototypes for rows in queries. */
  class Agent(_tableTag: Tag) extends profile.api.Table[AgentRow](_tableTag, "agent") {
    def * = Rep.Some(id) :: name :: nameKana :: url :: businessDescription :: goal :: message :: title :: resource1 :: resource2 :: resource3 :: staffMailAddress :: staffName :: hashKey :: expired :: logo :: image1 :: image2 :: image3 :: businessOverview :: sales :: averageAge :: genderRatio :: numberOfEmployeeId :: listingType :: foreignCapitalType :: industryLargeId :: majorCustomers :: establishment :: ribbonId :: sent :: address :: logoUrl :: image1Url :: image2Url :: image3Url :: capitalId :: establishmentYear :: HNil

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column name_kana SqlType(VARCHAR), Length(255,true) */
    val nameKana: Rep[String] = column[String]("name_kana", O.Length(255,varying=true))
    /** Database column url SqlType(VARCHAR), Length(1023,true) */
    val url: Rep[String] = column[String]("url", O.Length(1023,varying=true))
    /** Database column business_description SqlType(TEXT), Length(65535,true) */
    val businessDescription: Rep[Option[String]] = column[Option[String]]("business_description", O.Length(65535,varying=true))
    /** Database column goal SqlType(TEXT), Length(65535,true) */
    val goal: Rep[Option[String]] = column[Option[String]]("goal", O.Length(65535,varying=true))
    /** Database column message SqlType(TEXT), Length(65535,true) */
    val message: Rep[Option[String]] = column[Option[String]]("message", O.Length(65535,varying=true))
    /** Database column title SqlType(TEXT), Length(65535,true) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Length(65535,varying=true))
    /** Database column resource1 SqlType(TEXT), Length(65535,true) */
    val resource1: Rep[Option[String]] = column[Option[String]]("resource1", O.Length(65535,varying=true))
    /** Database column resource2 SqlType(TEXT), Length(65535,true) */
    val resource2: Rep[Option[String]] = column[Option[String]]("resource2", O.Length(65535,varying=true))
    /** Database column resource3 SqlType(TEXT), Length(65535,true) */
    val resource3: Rep[Option[String]] = column[Option[String]]("resource3", O.Length(65535,varying=true))
    /** Database column staff_mail_address SqlType(VARCHAR), Length(100,true) */
    val staffMailAddress: Rep[String] = column[String]("staff_mail_address", O.Length(100,varying=true))
    /** Database column staff_name SqlType(VARCHAR), Length(100,true) */
    val staffName: Rep[String] = column[String]("staff_name", O.Length(100,varying=true))
    /** Database column hash_key SqlType(VARCHAR), Length(100,true) */
    val hashKey: Rep[String] = column[String]("hash_key", O.Length(100,varying=true))
    /** Database column expired SqlType(TIMESTAMP) */
    val expired: Rep[Option[DateTime]] = column[Option[DateTime]]("expired")
    /** Database column logo SqlType(VARCHAR), Length(100,true) */
    val logo: Rep[Option[String]] = column[Option[String]]("logo", O.Length(100,varying=true))
    /** Database column image1 SqlType(VARCHAR), Length(100,true) */
    val image1: Rep[Option[String]] = column[Option[String]]("image1", O.Length(100,varying=true))
    /** Database column image2 SqlType(VARCHAR), Length(100,true) */
    val image2: Rep[Option[String]] = column[Option[String]]("image2", O.Length(100,varying=true))
    /** Database column image3 SqlType(VARCHAR), Length(100,true) */
    val image3: Rep[Option[String]] = column[Option[String]]("image3", O.Length(100,varying=true))
    /** Database column business_overview SqlType(TEXT), Length(65535,true) */
    val businessOverview: Rep[Option[String]] = column[Option[String]]("business_overview", O.Length(65535,varying=true))
    /** Database column sales SqlType(BIGINT) */
    val sales: Rep[Option[Long]] = column[Option[Long]]("sales")
    /** Database column average_age SqlType(VARCHAR), Length(50,true) */
    val averageAge: Rep[Option[String]] = column[Option[String]]("average_age", O.Length(50,varying=true))
    /** Database column gender_ratio SqlType(VARCHAR), Length(50,true) */
    val genderRatio: Rep[Option[String]] = column[Option[String]]("gender_ratio", O.Length(50,varying=true))
    /** Database column number_of_employee_id SqlType(INT) */
    val numberOfEmployeeId: Rep[Option[Int]] = column[Option[Int]]("number_of_employee_id")
    /** Database column listing_type SqlType(BIT) */
    val listingType: Rep[Option[Boolean]] = column[Option[Boolean]]("listing_type")
    /** Database column foreign_capital_type SqlType(BIT) */
    val foreignCapitalType: Rep[Option[Boolean]] = column[Option[Boolean]]("foreign_capital_type")
    /** Database column industry_large_id SqlType(INT) */
    val industryLargeId: Rep[Option[Int]] = column[Option[Int]]("industry_large_id")
    /** Database column major_customers SqlType(TEXT), Length(65535,true) */
    val majorCustomers: Rep[Option[String]] = column[Option[String]]("major_customers", O.Length(65535,varying=true))
    /** Database column establishment SqlType(DATE) */
    val establishment: Rep[Option[LocalDate]] = column[Option[LocalDate]]("establishment")
    /** Database column ribbon_id SqlType(INT) */
    val ribbonId: Rep[Option[Int]] = column[Option[Int]]("ribbon_id")
    /** Database column sent SqlType(BIT) */
    val sent: Rep[Boolean] = column[Boolean]("sent")
    /** Database column address SqlType(VARCHAR), Length(300,true) */
    val address: Rep[Option[String]] = column[Option[String]]("address", O.Length(300,varying=true))
    /** Database column logo_url SqlType(VARCHAR), Length(200,true) */
    val logoUrl: Rep[Option[String]] = column[Option[String]]("logo_url", O.Length(200,varying=true))
    /** Database column image1_url SqlType(VARCHAR), Length(200,true) */
    val image1Url: Rep[Option[String]] = column[Option[String]]("image1_url", O.Length(200,varying=true))
    /** Database column image2_url SqlType(VARCHAR), Length(200,true) */
    val image2Url: Rep[Option[String]] = column[Option[String]]("image2_url", O.Length(200,varying=true))
    /** Database column image3_url SqlType(VARCHAR), Length(200,true) */
    val image3Url: Rep[Option[String]] = column[Option[String]]("image3_url", O.Length(200,varying=true))
    /** Database column capital_id SqlType(INT) */
    val capitalId: Rep[Option[Int]] = column[Option[Int]]("capital_id")
    /** Database column establishment_year SqlType(INT) */
    val establishmentYear: Rep[Option[Int]] = column[Option[Int]]("establishment_year")
  }
  /** Collection-like TableQuery object for table Agent */
  lazy val Agent = new TableQuery(tag => new Agent(tag))

  /** Entity class storing rows of table AllianceUsers
   *  @param companyUserId Database column company_user_id SqlType(INT) */
  final case class AllianceUsersRow(companyUserId: Int)
  /** GetResult implicit for fetching AllianceUsersRow objects using plain SQL queries */
  implicit def GetResultAllianceUsersRow(implicit e0: GR[Int]): GR[AllianceUsersRow] = GR{
    prs => import prs._
    AllianceUsersRow(<<[Int])
  }
  /** Table description of table alliance_users. Objects of this class serve as prototypes for rows in queries. */
  class AllianceUsers(_tableTag: Tag) extends profile.api.Table[AllianceUsersRow](_tableTag, "alliance_users") {
    def * = companyUserId <> (AllianceUsersRow, AllianceUsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = Rep.Some(companyUserId).shaped.<>(r => r.map(_=> AllianceUsersRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_user_id SqlType(INT) */
    val companyUserId: Rep[Int] = column[Int]("company_user_id")

    /** Foreign key referencing CompanyUsers (database name alliance_users_fk_1) */
    lazy val companyUsersFk = foreignKey("alliance_users_fk_1", companyUserId, CompanyUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (companyUserId) (database name company_user_id) */
    val index1 = index("company_user_id", companyUserId, unique=true)
  }
  /** Collection-like TableQuery object for table AllianceUsers */
  lazy val AllianceUsers = new TableQuery(tag => new AllianceUsers(tag))

  /** Entity class storing rows of table ArInternalMetadata
   *  @param key Database column key SqlType(VARCHAR), PrimaryKey, Length(255,true)
   *  @param value Database column value SqlType(VARCHAR), Length(255,true)
   *  @param createdAt Database column created_at SqlType(DATETIME)
   *  @param updatedAt Database column updated_at SqlType(DATETIME) */
  final case class ArInternalMetadataRow(key: String, value: Option[String], createdAt: DateTime, updatedAt: DateTime)
  /** GetResult implicit for fetching ArInternalMetadataRow objects using plain SQL queries */
  implicit def GetResultArInternalMetadataRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[DateTime]): GR[ArInternalMetadataRow] = GR{
    prs => import prs._
    ArInternalMetadataRow.tupled((<<[String], <<?[String], <<[DateTime], <<[DateTime]))
  }
  /** Table description of table ar_internal_metadata. Objects of this class serve as prototypes for rows in queries. */
  class ArInternalMetadata(_tableTag: Tag) extends profile.api.Table[ArInternalMetadataRow](_tableTag, "ar_internal_metadata") {
    def * = (key, value, createdAt, updatedAt) <> (ArInternalMetadataRow.tupled, ArInternalMetadataRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(key), value, Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> ArInternalMetadataRow.tupled((_1.get, _2, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column key SqlType(VARCHAR), PrimaryKey, Length(255,true) */
    val key: Rep[String] = column[String]("key", O.PrimaryKey, O.Length(255,varying=true))
    /** Database column value SqlType(VARCHAR), Length(255,true) */
    val value: Rep[Option[String]] = column[Option[String]]("value", O.Length(255,varying=true))
    /** Database column created_at SqlType(DATETIME) */
    val createdAt: Rep[DateTime] = column[DateTime]("created_at")
    /** Database column updated_at SqlType(DATETIME) */
    val updatedAt: Rep[DateTime] = column[DateTime]("updated_at")
  }
  /** Collection-like TableQuery object for table ArInternalMetadata */
  lazy val ArInternalMetadata = new TableQuery(tag => new ArInternalMetadata(tag))

  /** Entity class storing rows of table ArticleCategories
   *  @param articleId Database column article_id SqlType(INT)
   *  @param categoryId Database column category_id SqlType(INT) */
  final case class ArticleCategoriesRow(articleId: Int, categoryId: Int)
  /** GetResult implicit for fetching ArticleCategoriesRow objects using plain SQL queries */
  implicit def GetResultArticleCategoriesRow(implicit e0: GR[Int]): GR[ArticleCategoriesRow] = GR{
    prs => import prs._
    ArticleCategoriesRow.tupled((<<[Int], <<[Int]))
  }
  /** Table description of table article_categories. Objects of this class serve as prototypes for rows in queries. */
  class ArticleCategories(_tableTag: Tag) extends profile.api.Table[ArticleCategoriesRow](_tableTag, "article_categories") {
    def * = (articleId, categoryId) <> (ArticleCategoriesRow.tupled, ArticleCategoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(articleId), Rep.Some(categoryId)).shaped.<>({r=>import r._; _1.map(_=> ArticleCategoriesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column article_id SqlType(INT) */
    val articleId: Rep[Int] = column[Int]("article_id")
    /** Database column category_id SqlType(INT) */
    val categoryId: Rep[Int] = column[Int]("category_id")

    /** Foreign key referencing Articles (database name article_categories_fk_1) */
    lazy val articlesFk = foreignKey("article_categories_fk_1", articleId, Articles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ArticleCategories */
  lazy val ArticleCategories = new TableQuery(tag => new ArticleCategories(tag))

  /** Entity class storing rows of table ArticleHistories
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param articleId Database column article_id SqlType(INT)
   *  @param version Database column version SqlType(INT)
   *  @param title Database column title SqlType(VARCHAR), Length(255,true)
   *  @param content Database column content SqlType(TEXT), Length(65535,true)
   *  @param comment Database column comment SqlType(TEXT), Length(65535,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class ArticleHistoriesRow(id: Option[Int] = None, articleId: Option[Int], version: Option[Int], title: Option[String], content: Option[String], comment: Option[String], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching ArticleHistoriesRow objects using plain SQL queries */
  implicit def GetResultArticleHistoriesRow(implicit e0: GR[Option[Int]], e1: GR[Option[String]], e2: GR[Option[DateTime]]): GR[ArticleHistoriesRow] = GR{
    prs => import prs._
    ArticleHistoriesRow.tupled((<<?[Int], <<?[Int], <<?[Int], <<?[String], <<?[String], <<?[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table article_histories. Objects of this class serve as prototypes for rows in queries. */
  class ArticleHistories(_tableTag: Tag) extends profile.api.Table[ArticleHistoriesRow](_tableTag, "article_histories") {
    def * = (Rep.Some(id), articleId, version, title, content, comment, createdAt, updatedAt) <> (ArticleHistoriesRow.tupled, ArticleHistoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), articleId, version, title, content, comment, Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> ArticleHistoriesRow.tupled((_1, _2, _3, _4, _5, _6, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column article_id SqlType(INT) */
    val articleId: Rep[Option[Int]] = column[Option[Int]]("article_id")
    /** Database column version SqlType(INT) */
    val version: Rep[Option[Int]] = column[Option[Int]]("version")
    /** Database column title SqlType(VARCHAR), Length(255,true) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Length(255,varying=true))
    /** Database column content SqlType(TEXT), Length(65535,true) */
    val content: Rep[Option[String]] = column[Option[String]]("content", O.Length(65535,varying=true))
    /** Database column comment SqlType(TEXT), Length(65535,true) */
    val comment: Rep[Option[String]] = column[Option[String]]("comment", O.Length(65535,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table ArticleHistories */
  lazy val ArticleHistories = new TableQuery(tag => new ArticleHistories(tag))

  /** Entity class storing rows of table ArticleImages
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param articleId Database column article_id SqlType(INT)
   *  @param image Database column image SqlType(TEXT), Length(65535,true)
   *  @param alt Database column alt SqlType(VARCHAR), Length(255,true)
   *  @param rowOrder Database column row_order SqlType(INT)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class ArticleImagesRow(id: Option[Int] = None, articleId: Int, image: String, alt: Option[String], rowOrder: Option[Int], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching ArticleImagesRow objects using plain SQL queries */
  implicit def GetResultArticleImagesRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[DateTime]]): GR[ArticleImagesRow] = GR{
    prs => import prs._
    ArticleImagesRow.tupled((<<?[Int], <<[Int], <<[String], <<?[String], <<?[Int], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table article_images. Objects of this class serve as prototypes for rows in queries. */
  class ArticleImages(_tableTag: Tag) extends profile.api.Table[ArticleImagesRow](_tableTag, "article_images") {
    def * = (Rep.Some(id), articleId, image, alt, rowOrder, createdAt, updatedAt) <> (ArticleImagesRow.tupled, ArticleImagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(articleId), Rep.Some(image), alt, rowOrder, Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> ArticleImagesRow.tupled((_1, _2.get, _3.get, _4, _5, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column article_id SqlType(INT) */
    val articleId: Rep[Int] = column[Int]("article_id")
    /** Database column image SqlType(TEXT), Length(65535,true) */
    val image: Rep[String] = column[String]("image", O.Length(65535,varying=true))
    /** Database column alt SqlType(VARCHAR), Length(255,true) */
    val alt: Rep[Option[String]] = column[Option[String]]("alt", O.Length(255,varying=true))
    /** Database column row_order SqlType(INT) */
    val rowOrder: Rep[Option[Int]] = column[Option[Int]]("row_order")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Index over (articleId) (database name index_article_images_on_article_id) */
    val index1 = index("index_article_images_on_article_id", articleId)
  }
  /** Collection-like TableQuery object for table ArticleImages */
  lazy val ArticleImages = new TableQuery(tag => new ArticleImages(tag))

  /** Entity class storing rows of table ArticleRelatedPromotions
   *  @param articleId Database column article_id SqlType(INT)
   *  @param promotionId Database column promotion_id SqlType(INT) */
  final case class ArticleRelatedPromotionsRow(articleId: Int, promotionId: Int)
  /** GetResult implicit for fetching ArticleRelatedPromotionsRow objects using plain SQL queries */
  implicit def GetResultArticleRelatedPromotionsRow(implicit e0: GR[Int]): GR[ArticleRelatedPromotionsRow] = GR{
    prs => import prs._
    ArticleRelatedPromotionsRow.tupled((<<[Int], <<[Int]))
  }
  /** Table description of table article_related_promotions. Objects of this class serve as prototypes for rows in queries. */
  class ArticleRelatedPromotions(_tableTag: Tag) extends profile.api.Table[ArticleRelatedPromotionsRow](_tableTag, "article_related_promotions") {
    def * = (articleId, promotionId) <> (ArticleRelatedPromotionsRow.tupled, ArticleRelatedPromotionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(articleId), Rep.Some(promotionId)).shaped.<>({r=>import r._; _1.map(_=> ArticleRelatedPromotionsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column article_id SqlType(INT) */
    val articleId: Rep[Int] = column[Int]("article_id")
    /** Database column promotion_id SqlType(INT) */
    val promotionId: Rep[Int] = column[Int]("promotion_id")

    /** Foreign key referencing Articles (database name article_related_promotions_ibfk_1) */
    lazy val articlesFk = foreignKey("article_related_promotions_ibfk_1", articleId, Articles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Promotions (database name article_related_promotions_ibfk_2) */
    lazy val promotionsFk = foreignKey("article_related_promotions_ibfk_2", promotionId, Promotions)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ArticleRelatedPromotions */
  lazy val ArticleRelatedPromotions = new TableQuery(tag => new ArticleRelatedPromotions(tag))

  /** Entity class storing rows of table Articles
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param currentVersion Database column current_version SqlType(INT)
   *  @param publishVersion Database column publish_version SqlType(INT)
   *  @param thumbnail Database column thumbnail SqlType(VARCHAR), Length(255,true)
   *  @param status Database column status SqlType(VARCHAR), Length(255,true)
   *  @param publishDatetime Database column publish_datetime SqlType(DATETIME)
   *  @param userId Database column user_id SqlType(INT)
   *  @param updateUserId Database column update_user_id SqlType(INT)
   *  @param publishAt Database column publish_at SqlType(DATETIME)
   *  @param publishUntil Database column publish_until SqlType(DATETIME)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class ArticlesRow(id: Option[Int] = None, currentVersion: Option[Int], publishVersion: Option[Int], thumbnail: Option[String], status: Option[String], publishDatetime: Option[DateTime], userId: Option[Int], updateUserId: Option[Int], publishAt: Option[DateTime], publishUntil: Option[DateTime], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching ArticlesRow objects using plain SQL queries */
  implicit def GetResultArticlesRow(implicit e0: GR[Option[Int]], e1: GR[Option[String]], e2: GR[Option[DateTime]]): GR[ArticlesRow] = GR{
    prs => import prs._
    ArticlesRow.tupled((<<?[Int], <<?[Int], <<?[Int], <<?[String], <<?[String], <<?[DateTime], <<?[Int], <<?[Int], <<?[DateTime], <<?[DateTime], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table articles. Objects of this class serve as prototypes for rows in queries. */
  class Articles(_tableTag: Tag) extends profile.api.Table[ArticlesRow](_tableTag, "articles") {
    def * = (Rep.Some(id), currentVersion, publishVersion, thumbnail, status, publishDatetime, userId, updateUserId, publishAt, publishUntil, createdAt, updatedAt) <> (ArticlesRow.tupled, ArticlesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), currentVersion, publishVersion, thumbnail, status, publishDatetime, userId, updateUserId, publishAt, publishUntil, Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> ArticlesRow.tupled((_1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11.get, _12.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column current_version SqlType(INT) */
    val currentVersion: Rep[Option[Int]] = column[Option[Int]]("current_version")
    /** Database column publish_version SqlType(INT) */
    val publishVersion: Rep[Option[Int]] = column[Option[Int]]("publish_version")
    /** Database column thumbnail SqlType(VARCHAR), Length(255,true) */
    val thumbnail: Rep[Option[String]] = column[Option[String]]("thumbnail", O.Length(255,varying=true))
    /** Database column status SqlType(VARCHAR), Length(255,true) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Length(255,varying=true))
    /** Database column publish_datetime SqlType(DATETIME) */
    val publishDatetime: Rep[Option[DateTime]] = column[Option[DateTime]]("publish_datetime")
    /** Database column user_id SqlType(INT) */
    val userId: Rep[Option[Int]] = column[Option[Int]]("user_id")
    /** Database column update_user_id SqlType(INT) */
    val updateUserId: Rep[Option[Int]] = column[Option[Int]]("update_user_id")
    /** Database column publish_at SqlType(DATETIME) */
    val publishAt: Rep[Option[DateTime]] = column[Option[DateTime]]("publish_at")
    /** Database column publish_until SqlType(DATETIME) */
    val publishUntil: Rep[Option[DateTime]] = column[Option[DateTime]]("publish_until")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table Articles */
  lazy val Articles = new TableQuery(tag => new Articles(tag))

  /** Entity class storing rows of table ArticlesArticleSeries
   *  @param articleId Database column article_id SqlType(INT)
   *  @param seriesId Database column series_id SqlType(INT)
   *  @param num Database column num SqlType(INT) */
  final case class ArticlesArticleSeriesRow(articleId: Int, seriesId: Int, num: Int)
  /** GetResult implicit for fetching ArticlesArticleSeriesRow objects using plain SQL queries */
  implicit def GetResultArticlesArticleSeriesRow(implicit e0: GR[Int]): GR[ArticlesArticleSeriesRow] = GR{
    prs => import prs._
    ArticlesArticleSeriesRow.tupled((<<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table articles_article_series. Objects of this class serve as prototypes for rows in queries. */
  class ArticlesArticleSeries(_tableTag: Tag) extends profile.api.Table[ArticlesArticleSeriesRow](_tableTag, "articles_article_series") {
    def * = (articleId, seriesId, num) <> (ArticlesArticleSeriesRow.tupled, ArticlesArticleSeriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(articleId), Rep.Some(seriesId), Rep.Some(num)).shaped.<>({r=>import r._; _1.map(_=> ArticlesArticleSeriesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column article_id SqlType(INT) */
    val articleId: Rep[Int] = column[Int]("article_id")
    /** Database column series_id SqlType(INT) */
    val seriesId: Rep[Int] = column[Int]("series_id")
    /** Database column num SqlType(INT) */
    val num: Rep[Int] = column[Int]("num")

    /** Foreign key referencing ArticleSeries (database name articles_article_series_ibfk_2) */
    lazy val articleSeriesFk = foreignKey("articles_article_series_ibfk_2", seriesId, ArticleSeries)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Articles (database name articles_article_series_ibfk_1) */
    lazy val articlesFk = foreignKey("articles_article_series_ibfk_1", articleId, Articles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ArticlesArticleSeries */
  lazy val ArticlesArticleSeries = new TableQuery(tag => new ArticlesArticleSeries(tag))

  /** Entity class storing rows of table ArticleSeries
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(200,true) */
  final case class ArticleSeriesRow(id: Option[Int] = None, name: Option[String])
  /** GetResult implicit for fetching ArticleSeriesRow objects using plain SQL queries */
  implicit def GetResultArticleSeriesRow(implicit e0: GR[Option[Int]], e1: GR[Option[String]]): GR[ArticleSeriesRow] = GR{
    prs => import prs._
    ArticleSeriesRow.tupled((<<?[Int], <<?[String]))
  }
  /** Table description of table article_series. Objects of this class serve as prototypes for rows in queries. */
  class ArticleSeries(_tableTag: Tag) extends profile.api.Table[ArticleSeriesRow](_tableTag, "article_series") {
    def * = (Rep.Some(id), name) <> (ArticleSeriesRow.tupled, ArticleSeriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), name).shaped.<>({r=>import r._; _1.map(_=> ArticleSeriesRow.tupled((_1, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(200,true) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(200,varying=true))
  }
  /** Collection-like TableQuery object for table ArticleSeries */
  lazy val ArticleSeries = new TableQuery(tag => new ArticleSeries(tag))

  /** Entity class storing rows of table ArticleTags
   *  @param articleId Database column article_id SqlType(INT)
   *  @param tagId Database column tag_id SqlType(INT) */
  final case class ArticleTagsRow(articleId: Int, tagId: Int)
  /** GetResult implicit for fetching ArticleTagsRow objects using plain SQL queries */
  implicit def GetResultArticleTagsRow(implicit e0: GR[Int]): GR[ArticleTagsRow] = GR{
    prs => import prs._
    ArticleTagsRow.tupled((<<[Int], <<[Int]))
  }
  /** Table description of table article_tags. Objects of this class serve as prototypes for rows in queries. */
  class ArticleTags(_tableTag: Tag) extends profile.api.Table[ArticleTagsRow](_tableTag, "article_tags") {
    def * = (articleId, tagId) <> (ArticleTagsRow.tupled, ArticleTagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(articleId), Rep.Some(tagId)).shaped.<>({r=>import r._; _1.map(_=> ArticleTagsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column article_id SqlType(INT) */
    val articleId: Rep[Int] = column[Int]("article_id")
    /** Database column tag_id SqlType(INT) */
    val tagId: Rep[Int] = column[Int]("tag_id")

    /** Foreign key referencing Articles (database name article_tags_fk_1) */
    lazy val articlesFk = foreignKey("article_tags_fk_1", articleId, Articles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ArticleTags */
  lazy val ArticleTags = new TableQuery(tag => new ArticleTags(tag))

  /** Entity class storing rows of table Banners
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param imageUrl Database column image_url SqlType(VARCHAR), Length(300,true)
   *  @param href Database column href SqlType(VARCHAR), Length(300,true)
   *  @param displayOrder Database column display_order SqlType(INT)
   *  @param state Database column state SqlType(VARCHAR), Length(64,true) */
  final case class BannersRow(id: Option[Int] = None, imageUrl: String, href: String, displayOrder: Int, state: String)
  /** GetResult implicit for fetching BannersRow objects using plain SQL queries */
  implicit def GetResultBannersRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Int]): GR[BannersRow] = GR{
    prs => import prs._
    BannersRow.tupled((<<?[Int], <<[String], <<[String], <<[Int], <<[String]))
  }
  /** Table description of table banners. Objects of this class serve as prototypes for rows in queries. */
  class Banners(_tableTag: Tag) extends profile.api.Table[BannersRow](_tableTag, "banners") {
    def * = (Rep.Some(id), imageUrl, href, displayOrder, state) <> (BannersRow.tupled, BannersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(imageUrl), Rep.Some(href), Rep.Some(displayOrder), Rep.Some(state)).shaped.<>({r=>import r._; _1.map(_=> BannersRow.tupled((_1, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column image_url SqlType(VARCHAR), Length(300,true) */
    val imageUrl: Rep[String] = column[String]("image_url", O.Length(300,varying=true))
    /** Database column href SqlType(VARCHAR), Length(300,true) */
    val href: Rep[String] = column[String]("href", O.Length(300,varying=true))
    /** Database column display_order SqlType(INT) */
    val displayOrder: Rep[Int] = column[Int]("display_order")
    /** Database column state SqlType(VARCHAR), Length(64,true) */
    val state: Rep[String] = column[String]("state", O.Length(64,varying=true))

    /** Index over (state) (database name index_banners_state) */
    val index1 = index("index_banners_state", state)
  }
  /** Collection-like TableQuery object for table Banners */
  lazy val Banners = new TableQuery(tag => new Banners(tag))

  /** Entity class storing rows of table ChatMessages
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param userId Database column user_id SqlType(INT)
   *  @param adminAnswer Database column admin_answer SqlType(BIT)
   *  @param questionId Database column question_id SqlType(INT)
   *  @param message Database column message SqlType(TEXT), Length(65535,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP) */
  final case class ChatMessagesRow(id: Option[Int] = None, userId: Int, adminAnswer: Boolean, questionId: Option[Int], message: String, createdAt: Option[DateTime])
  /** GetResult implicit for fetching ChatMessagesRow objects using plain SQL queries */
  implicit def GetResultChatMessagesRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[Boolean], e3: GR[String], e4: GR[Option[DateTime]]): GR[ChatMessagesRow] = GR{
    prs => import prs._
    ChatMessagesRow.tupled((<<?[Int], <<[Int], <<[Boolean], <<?[Int], <<[String], <<[Option[DateTime]]))
  }
  /** Table description of table chat_messages. Objects of this class serve as prototypes for rows in queries. */
  class ChatMessages(_tableTag: Tag) extends profile.api.Table[ChatMessagesRow](_tableTag, "chat_messages") {
    def * = (Rep.Some(id), userId, adminAnswer, questionId, message, createdAt) <> (ChatMessagesRow.tupled, ChatMessagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(userId), Rep.Some(adminAnswer), questionId, Rep.Some(message), Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> ChatMessagesRow.tupled((_1, _2.get, _3.get, _4, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column user_id SqlType(INT) */
    val userId: Rep[Int] = column[Int]("user_id")
    /** Database column admin_answer SqlType(BIT) */
    val adminAnswer: Rep[Boolean] = column[Boolean]("admin_answer")
    /** Database column question_id SqlType(INT) */
    val questionId: Rep[Option[Int]] = column[Option[Int]]("question_id")
    /** Database column message SqlType(TEXT), Length(65535,true) */
    val message: Rep[String] = column[String]("message", O.Length(65535,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")

    /** Foreign key referencing CompanyUsers (database name chat_messages_idfk_1) */
    lazy val companyUsersFk = foreignKey("chat_messages_idfk_1", userId, CompanyUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Questions (database name chat_messages_idfk_2) */
    lazy val questionsFk = foreignKey("chat_messages_idfk_2", questionId, Questions)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ChatMessages */
  lazy val ChatMessages = new TableQuery(tag => new ChatMessages(tag))

  /** Entity class storing rows of table CheerMessages
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param facebookId Database column facebook_id SqlType(BIGINT)
   *  @param projectId Database column project_id SqlType(INT)
   *  @param message Database column message SqlType(TEXT), Length(65535,true)
   *  @param createdAt Database column created_at SqlType(DATETIME) */
  final case class CheerMessagesRow(id: Option[Int] = None, facebookId: Option[Long], projectId: Int, message: Option[String], createdAt: DateTime)
  /** GetResult implicit for fetching CheerMessagesRow objects using plain SQL queries */
  implicit def GetResultCheerMessagesRow(implicit e0: GR[Option[Int]], e1: GR[Option[Long]], e2: GR[Int], e3: GR[Option[String]], e4: GR[DateTime]): GR[CheerMessagesRow] = GR{
    prs => import prs._
    CheerMessagesRow.tupled((<<?[Int], <<?[Long], <<[Int], <<?[String], <<[DateTime]))
  }
  /** Table description of table cheer_messages. Objects of this class serve as prototypes for rows in queries. */
  class CheerMessages(_tableTag: Tag) extends profile.api.Table[CheerMessagesRow](_tableTag, "cheer_messages") {
    def * = (Rep.Some(id), facebookId, projectId, message, createdAt) <> (CheerMessagesRow.tupled, CheerMessagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), facebookId, Rep.Some(projectId), message, Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> CheerMessagesRow.tupled((_1, _2, _3.get, _4, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column facebook_id SqlType(BIGINT) */
    val facebookId: Rep[Option[Long]] = column[Option[Long]]("facebook_id")
    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column message SqlType(TEXT), Length(65535,true) */
    val message: Rep[Option[String]] = column[Option[String]]("message", O.Length(65535,varying=true))
    /** Database column created_at SqlType(DATETIME) */
    val createdAt: Rep[DateTime] = column[DateTime]("created_at")

    /** Foreign key referencing FacebookUsers (database name cheer_messages_idfk_2) */
    lazy val facebookUsersFk = foreignKey("cheer_messages_idfk_2", facebookId, FacebookUsers)(r => Rep.Some(r.facebookId), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Projects (database name cheer_messages_idfk_1) */
    lazy val projectsFk = foreignKey("cheer_messages_idfk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CheerMessages */
  lazy val CheerMessages = new TableQuery(tag => new CheerMessages(tag))

  /** Row type of table Companies */
  type CompaniesRow = HCons[Option[Int],HCons[String,HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[Int],HCons[Option[Boolean],HCons[Option[Boolean],HCons[Option[Int],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[DateTime],HCons[Option[DateTime],HCons[Option[Int],HCons[String,HCons[Option[String],HCons[Option[String],HCons[Int,HCons[Option[Int],HCons[Boolean,HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for CompaniesRow providing default values if available in the database schema. */
  def CompaniesRow(id: Option[Int] = None, name: String, nameKana: Option[String], url: Option[String], capitalId: Option[Int], numberOfEmployeeId: Option[Int], listingType: Option[Boolean], foreignCapitalType: Option[Boolean], industryLargeId: Option[Int], averageAge: Option[String], majorCustomers: Option[String], businessOverview: Option[String], shareholders: Option[String], createdAt: Option[DateTime], modifiedAt: Option[DateTime], ribbonId: Option[Int], premiumStatus: String, ownerName: Option[String], address: Option[String], contactCount: Int = 0, establishmentYear: Option[Int], isAuthenticated: Boolean, recommendationText: Option[String]): CompaniesRow = {
    id :: name :: nameKana :: url :: capitalId :: numberOfEmployeeId :: listingType :: foreignCapitalType :: industryLargeId :: averageAge :: majorCustomers :: businessOverview :: shareholders :: createdAt :: modifiedAt :: ribbonId :: premiumStatus :: ownerName :: address :: contactCount :: establishmentYear :: isAuthenticated :: recommendationText :: HNil
  }
  /** GetResult implicit for fetching CompaniesRow objects using plain SQL queries */
  implicit def GetResultCompaniesRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Boolean]], e4: GR[Option[DateTime]], e5: GR[Int], e6: GR[Boolean]): GR[CompaniesRow] = GR{
    prs => import prs._
    <<?[Int] :: <<[String] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[Int] :: <<?[Boolean] :: <<?[Boolean] :: <<?[Int] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<[Option[DateTime]] :: <<[Option[DateTime]] :: <<?[Int] :: <<[String] :: <<?[String] :: <<?[String] :: <<[Int] :: <<?[Int] :: <<[Boolean] :: <<?[String] :: HNil
  }
  /** Table description of table companies. Objects of this class serve as prototypes for rows in queries. */
  class Companies(_tableTag: Tag) extends profile.api.Table[CompaniesRow](_tableTag, "companies") {
    def * = Rep.Some(id) :: name :: nameKana :: url :: capitalId :: numberOfEmployeeId :: listingType :: foreignCapitalType :: industryLargeId :: averageAge :: majorCustomers :: businessOverview :: shareholders :: createdAt :: modifiedAt :: ribbonId :: premiumStatus :: ownerName :: address :: contactCount :: establishmentYear :: isAuthenticated :: recommendationText :: HNil

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column name_kana SqlType(VARCHAR), Length(255,true) */
    val nameKana: Rep[Option[String]] = column[Option[String]]("name_kana", O.Length(255,varying=true))
    /** Database column url SqlType(VARCHAR), Length(1023,true) */
    val url: Rep[Option[String]] = column[Option[String]]("url", O.Length(1023,varying=true))
    /** Database column capital_id SqlType(INT) */
    val capitalId: Rep[Option[Int]] = column[Option[Int]]("capital_id")
    /** Database column number_of_employee_id SqlType(INT) */
    val numberOfEmployeeId: Rep[Option[Int]] = column[Option[Int]]("number_of_employee_id")
    /** Database column listing_type SqlType(BIT) */
    val listingType: Rep[Option[Boolean]] = column[Option[Boolean]]("listing_type")
    /** Database column foreign_capital_type SqlType(BIT) */
    val foreignCapitalType: Rep[Option[Boolean]] = column[Option[Boolean]]("foreign_capital_type")
    /** Database column industry_large_id SqlType(INT) */
    val industryLargeId: Rep[Option[Int]] = column[Option[Int]]("industry_large_id")
    /** Database column average_age SqlType(VARCHAR), Length(50,true) */
    val averageAge: Rep[Option[String]] = column[Option[String]]("average_age", O.Length(50,varying=true))
    /** Database column major_customers SqlType(TEXT), Length(65535,true) */
    val majorCustomers: Rep[Option[String]] = column[Option[String]]("major_customers", O.Length(65535,varying=true))
    /** Database column business_overview SqlType(TEXT), Length(65535,true) */
    val businessOverview: Rep[Option[String]] = column[Option[String]]("business_overview", O.Length(65535,varying=true))
    /** Database column shareholders SqlType(TEXT), Length(65535,true) */
    val shareholders: Rep[Option[String]] = column[Option[String]]("shareholders", O.Length(65535,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column modified_at SqlType(TIMESTAMP) */
    val modifiedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("modified_at")
    /** Database column ribbon_id SqlType(INT) */
    val ribbonId: Rep[Option[Int]] = column[Option[Int]]("ribbon_id")
    /** Database column premium_status SqlType(VARCHAR), Length(10,true) */
    val premiumStatus: Rep[String] = column[String]("premium_status", O.Length(10,varying=true))
    /** Database column owner_name SqlType(VARCHAR), Length(100,true) */
    val ownerName: Rep[Option[String]] = column[Option[String]]("owner_name", O.Length(100,varying=true))
    /** Database column address SqlType(VARCHAR), Length(300,true) */
    val address: Rep[Option[String]] = column[Option[String]]("address", O.Length(300,varying=true))
    /** Database column contact_count SqlType(INT), Default(0) */
    val contactCount: Rep[Int] = column[Int]("contact_count", O.Default(0))
    /** Database column establishment_year SqlType(INT) */
    val establishmentYear: Rep[Option[Int]] = column[Option[Int]]("establishment_year")
    /** Database column is_authenticated SqlType(BIT) */
    val isAuthenticated: Rep[Boolean] = column[Boolean]("is_authenticated")
    /** Database column recommendation_text SqlType(TEXT), Length(65535,true) */
    val recommendationText: Rep[Option[String]] = column[Option[String]]("recommendation_text", O.Length(65535,varying=true))

    /** Uniqueness Index over (ribbonId) (database name ribbon_id) */
    val index1 = index("ribbon_id", ribbonId :: HNil, unique=true)
  }
  /** Collection-like TableQuery object for table Companies */
  lazy val Companies = new TableQuery(tag => new Companies(tag))

  /** Entity class storing rows of table CompanyAdminNotes
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param companyId Database column company_id SqlType(INT)
   *  @param userId Database column user_id SqlType(INT)
   *  @param note Database column note SqlType(TEXT), Length(65535,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class CompanyAdminNotesRow(id: Option[Int] = None, companyId: Int, userId: Int, note: String, createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching CompanyAdminNotesRow objects using plain SQL queries */
  implicit def GetResultCompanyAdminNotesRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[String], e3: GR[Option[DateTime]]): GR[CompanyAdminNotesRow] = GR{
    prs => import prs._
    CompanyAdminNotesRow.tupled((<<?[Int], <<[Int], <<[Int], <<[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table company_admin_notes. Objects of this class serve as prototypes for rows in queries. */
  class CompanyAdminNotes(_tableTag: Tag) extends profile.api.Table[CompanyAdminNotesRow](_tableTag, "company_admin_notes") {
    def * = (Rep.Some(id), companyId, userId, note, createdAt, updatedAt) <> (CompanyAdminNotesRow.tupled, CompanyAdminNotesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(companyId), Rep.Some(userId), Rep.Some(note), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> CompanyAdminNotesRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column company_id SqlType(INT) */
    val companyId: Rep[Int] = column[Int]("company_id")
    /** Database column user_id SqlType(INT) */
    val userId: Rep[Int] = column[Int]("user_id")
    /** Database column note SqlType(TEXT), Length(65535,true) */
    val note: Rep[String] = column[String]("note", O.Length(65535,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Foreign key referencing Companies (database name company_admin_note_fk) */
    lazy val companiesFk = foreignKey("company_admin_note_fk", companyId, Companies)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CompanyAdminNotes */
  lazy val CompanyAdminNotes = new TableQuery(tag => new CompanyAdminNotes(tag))

  /** Entity class storing rows of table CompanyBags
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param label Database column label SqlType(VARCHAR), Length(100,true)
   *  @param banner Database column banner SqlType(VARCHAR), Length(300,true)
   *  @param title Database column title SqlType(VARCHAR), Length(300,true)
   *  @param description Database column description SqlType(TEXT), Length(65535,true)
   *  @param htmlDescription Database column html_description SqlType(VARCHAR), Length(300,true)
   *  @param htmlKeyword Database column html_keyword SqlType(VARCHAR), Length(300,true) */
  final case class CompanyBagsRow(id: Option[Int] = None, label: String, banner: Option[String], title: Option[String], description: Option[String], htmlDescription: Option[String], htmlKeyword: Option[String])
  /** GetResult implicit for fetching CompanyBagsRow objects using plain SQL queries */
  implicit def GetResultCompanyBagsRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[String]]): GR[CompanyBagsRow] = GR{
    prs => import prs._
    CompanyBagsRow.tupled((<<?[Int], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table company_bags. Objects of this class serve as prototypes for rows in queries. */
  class CompanyBags(_tableTag: Tag) extends profile.api.Table[CompanyBagsRow](_tableTag, "company_bags") {
    def * = (Rep.Some(id), label, banner, title, description, htmlDescription, htmlKeyword) <> (CompanyBagsRow.tupled, CompanyBagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(label), banner, title, description, htmlDescription, htmlKeyword).shaped.<>({r=>import r._; _1.map(_=> CompanyBagsRow.tupled((_1, _2.get, _3, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column label SqlType(VARCHAR), Length(100,true) */
    val label: Rep[String] = column[String]("label", O.Length(100,varying=true))
    /** Database column banner SqlType(VARCHAR), Length(300,true) */
    val banner: Rep[Option[String]] = column[Option[String]]("banner", O.Length(300,varying=true))
    /** Database column title SqlType(VARCHAR), Length(300,true) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Length(300,varying=true))
    /** Database column description SqlType(TEXT), Length(65535,true) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(65535,varying=true))
    /** Database column html_description SqlType(VARCHAR), Length(300,true) */
    val htmlDescription: Rep[Option[String]] = column[Option[String]]("html_description", O.Length(300,varying=true))
    /** Database column html_keyword SqlType(VARCHAR), Length(300,true) */
    val htmlKeyword: Rep[Option[String]] = column[Option[String]]("html_keyword", O.Length(300,varying=true))
  }
  /** Collection-like TableQuery object for table CompanyBags */
  lazy val CompanyBags = new TableQuery(tag => new CompanyBags(tag))

  /** Entity class storing rows of table CompanyBagTargets
   *  @param companyBagId Database column company_bag_id SqlType(INT)
   *  @param projectId Database column project_id SqlType(INT)
   *  @param displayOrder Database column display_order SqlType(INT) */
  final case class CompanyBagTargetsRow(companyBagId: Int, projectId: Int, displayOrder: Int)
  /** GetResult implicit for fetching CompanyBagTargetsRow objects using plain SQL queries */
  implicit def GetResultCompanyBagTargetsRow(implicit e0: GR[Int]): GR[CompanyBagTargetsRow] = GR{
    prs => import prs._
    CompanyBagTargetsRow.tupled((<<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table company_bag_targets. Objects of this class serve as prototypes for rows in queries. */
  class CompanyBagTargets(_tableTag: Tag) extends profile.api.Table[CompanyBagTargetsRow](_tableTag, "company_bag_targets") {
    def * = (companyBagId, projectId, displayOrder) <> (CompanyBagTargetsRow.tupled, CompanyBagTargetsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(companyBagId), Rep.Some(projectId), Rep.Some(displayOrder)).shaped.<>({r=>import r._; _1.map(_=> CompanyBagTargetsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_bag_id SqlType(INT) */
    val companyBagId: Rep[Int] = column[Int]("company_bag_id")
    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column display_order SqlType(INT) */
    val displayOrder: Rep[Int] = column[Int]("display_order")

    /** Primary key of CompanyBagTargets (database name PRIMARY) */
    val pk = primaryKey("PRIMARY", (companyBagId, projectId))

    /** Foreign key referencing CompanyBags (database name fk_bag_targets_bag) */
    lazy val companyBagsFk = foreignKey("fk_bag_targets_bag", companyBagId, CompanyBags)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Projects (database name fk_bag_targets_company) */
    lazy val projectsFk = foreignKey("fk_bag_targets_company", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CompanyBagTargets */
  lazy val CompanyBagTargets = new TableQuery(tag => new CompanyBagTargets(tag))

  /** Entity class storing rows of table CompanyEntry
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param nameKana Database column name_kana SqlType(VARCHAR), Length(255,true)
   *  @param prefectureId Database column prefecture_id SqlType(INT)
   *  @param url Database column url SqlType(VARCHAR), Length(1023,true)
   *  @param staffName Database column staff_name SqlType(VARCHAR), Length(100,true)
   *  @param staffMailAddress Database column staff_mail_address SqlType(VARCHAR), Length(100,true)
   *  @param status Database column status SqlType(VARCHAR), Length(20,true)
   *  @param memo Database column memo SqlType(TEXT), Length(65535,true)
   *  @param created Database column created SqlType(TIMESTAMP)
   *  @param address Database column address SqlType(VARCHAR), Length(300,true) */
  final case class CompanyEntryRow(id: Option[Int] = None, name: String, nameKana: String, prefectureId: Int, url: String, staffName: String, staffMailAddress: String, status: String, memo: Option[String], created: Option[DateTime], address: Option[String])
  /** GetResult implicit for fetching CompanyEntryRow objects using plain SQL queries */
  implicit def GetResultCompanyEntryRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Int], e3: GR[Option[String]], e4: GR[Option[DateTime]]): GR[CompanyEntryRow] = GR{
    prs => import prs._
    CompanyEntryRow.tupled((<<?[Int], <<[String], <<[String], <<[Int], <<[String], <<[String], <<[String], <<[String], <<?[String], <<[Option[DateTime]], <<?[String]))
  }
  /** Table description of table company_entry. Objects of this class serve as prototypes for rows in queries. */
  class CompanyEntry(_tableTag: Tag) extends profile.api.Table[CompanyEntryRow](_tableTag, "company_entry") {
    def * = (Rep.Some(id), name, nameKana, prefectureId, url, staffName, staffMailAddress, status, memo, created, address) <> (CompanyEntryRow.tupled, CompanyEntryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name), Rep.Some(nameKana), Rep.Some(prefectureId), Rep.Some(url), Rep.Some(staffName), Rep.Some(staffMailAddress), Rep.Some(status), memo, Rep.Some(created), address).shaped.<>({r=>import r._; _1.map(_=> CompanyEntryRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9, _10.get, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column name_kana SqlType(VARCHAR), Length(255,true) */
    val nameKana: Rep[String] = column[String]("name_kana", O.Length(255,varying=true))
    /** Database column prefecture_id SqlType(INT) */
    val prefectureId: Rep[Int] = column[Int]("prefecture_id")
    /** Database column url SqlType(VARCHAR), Length(1023,true) */
    val url: Rep[String] = column[String]("url", O.Length(1023,varying=true))
    /** Database column staff_name SqlType(VARCHAR), Length(100,true) */
    val staffName: Rep[String] = column[String]("staff_name", O.Length(100,varying=true))
    /** Database column staff_mail_address SqlType(VARCHAR), Length(100,true) */
    val staffMailAddress: Rep[String] = column[String]("staff_mail_address", O.Length(100,varying=true))
    /** Database column status SqlType(VARCHAR), Length(20,true) */
    val status: Rep[String] = column[String]("status", O.Length(20,varying=true))
    /** Database column memo SqlType(TEXT), Length(65535,true) */
    val memo: Rep[Option[String]] = column[Option[String]]("memo", O.Length(65535,varying=true))
    /** Database column created SqlType(TIMESTAMP) */
    val created: Rep[Option[DateTime]] = column[Option[DateTime]]("created")
    /** Database column address SqlType(VARCHAR), Length(300,true) */
    val address: Rep[Option[String]] = column[Option[String]]("address", O.Length(300,varying=true))
  }
  /** Collection-like TableQuery object for table CompanyEntry */
  lazy val CompanyEntry = new TableQuery(tag => new CompanyEntry(tag))

  /** Entity class storing rows of table CompanyHistories
   *  @param id Database column id SqlType(INT)
   *  @param name Database column name SqlType(VARCHAR), Length(200,true)
   *  @param nameKana Database column name_kana SqlType(VARCHAR), Length(200,true)
   *  @param url Database column url SqlType(VARCHAR), Length(1000,true)
   *  @param establishmentYear Database column establishment_year SqlType(INT)
   *  @param capitalId Database column capital_id SqlType(INT)
   *  @param numberOfEmployeeId Database column number_of_employee_id SqlType(INT)
   *  @param listingType Database column listing_type SqlType(BIT)
   *  @param foreignCapitalType Database column foreign_capital_type SqlType(BIT)
   *  @param industryLargeId Database column industry_large_id SqlType(INT)
   *  @param averageAge Database column average_age SqlType(VARCHAR), Length(50,true)
   *  @param majorCustomers Database column major_customers SqlType(TEXT), Length(65535,true)
   *  @param businessOverview Database column business_overview SqlType(TEXT), Length(65535,true)
   *  @param shareholders Database column shareholders SqlType(TEXT), Length(65535,true)
   *  @param ribbonId Database column ribbon_id SqlType(INT)
   *  @param ownerName Database column owner_name SqlType(VARCHAR), Length(100,true)
   *  @param address Database column address SqlType(VARCHAR), Length(300,true)
   *  @param isAuthenticated Database column is_authenticated SqlType(BIT)
   *  @param premiumStatus Database column premium_status SqlType(VARCHAR), Length(10,true)
   *  @param modifiedAt Database column modified_at SqlType(TIMESTAMP)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP) */
  final case class CompanyHistoriesRow(id: Int, name: String, nameKana: Option[String], url: Option[String], establishmentYear: Option[Int], capitalId: Option[Int], numberOfEmployeeId: Option[Int], listingType: Option[Boolean], foreignCapitalType: Option[Boolean], industryLargeId: Option[Int], averageAge: Option[String], majorCustomers: Option[String], businessOverview: Option[String], shareholders: Option[String], ribbonId: Option[Int], ownerName: Option[String], address: Option[String], isAuthenticated: Option[Boolean], premiumStatus: String, modifiedAt: Option[DateTime], createdAt: Option[DateTime])
  /** GetResult implicit for fetching CompanyHistoriesRow objects using plain SQL queries */
  implicit def GetResultCompanyHistoriesRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[Int]], e4: GR[Option[Boolean]], e5: GR[Option[DateTime]]): GR[CompanyHistoriesRow] = GR{
    prs => import prs._
    CompanyHistoriesRow.tupled((<<[Int], <<[String], <<?[String], <<?[String], <<?[Int], <<?[Int], <<?[Int], <<?[Boolean], <<?[Boolean], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int], <<?[String], <<?[String], <<?[Boolean], <<[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table company_histories. Objects of this class serve as prototypes for rows in queries. */
  class CompanyHistories(_tableTag: Tag) extends profile.api.Table[CompanyHistoriesRow](_tableTag, "company_histories") {
    def * = (id, name, nameKana, url, establishmentYear, capitalId, numberOfEmployeeId, listingType, foreignCapitalType, industryLargeId, averageAge, majorCustomers, businessOverview, shareholders, ribbonId, ownerName, address, isAuthenticated, premiumStatus, modifiedAt, createdAt) <> (CompanyHistoriesRow.tupled, CompanyHistoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name), nameKana, url, establishmentYear, capitalId, numberOfEmployeeId, listingType, foreignCapitalType, industryLargeId, averageAge, majorCustomers, businessOverview, shareholders, ribbonId, ownerName, address, isAuthenticated, Rep.Some(premiumStatus), Rep.Some(modifiedAt), Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> CompanyHistoriesRow.tupled((_1.get, _2.get, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19.get, _20.get, _21.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT) */
    val id: Rep[Int] = column[Int]("id")
    /** Database column name SqlType(VARCHAR), Length(200,true) */
    val name: Rep[String] = column[String]("name", O.Length(200,varying=true))
    /** Database column name_kana SqlType(VARCHAR), Length(200,true) */
    val nameKana: Rep[Option[String]] = column[Option[String]]("name_kana", O.Length(200,varying=true))
    /** Database column url SqlType(VARCHAR), Length(1000,true) */
    val url: Rep[Option[String]] = column[Option[String]]("url", O.Length(1000,varying=true))
    /** Database column establishment_year SqlType(INT) */
    val establishmentYear: Rep[Option[Int]] = column[Option[Int]]("establishment_year")
    /** Database column capital_id SqlType(INT) */
    val capitalId: Rep[Option[Int]] = column[Option[Int]]("capital_id")
    /** Database column number_of_employee_id SqlType(INT) */
    val numberOfEmployeeId: Rep[Option[Int]] = column[Option[Int]]("number_of_employee_id")
    /** Database column listing_type SqlType(BIT) */
    val listingType: Rep[Option[Boolean]] = column[Option[Boolean]]("listing_type")
    /** Database column foreign_capital_type SqlType(BIT) */
    val foreignCapitalType: Rep[Option[Boolean]] = column[Option[Boolean]]("foreign_capital_type")
    /** Database column industry_large_id SqlType(INT) */
    val industryLargeId: Rep[Option[Int]] = column[Option[Int]]("industry_large_id")
    /** Database column average_age SqlType(VARCHAR), Length(50,true) */
    val averageAge: Rep[Option[String]] = column[Option[String]]("average_age", O.Length(50,varying=true))
    /** Database column major_customers SqlType(TEXT), Length(65535,true) */
    val majorCustomers: Rep[Option[String]] = column[Option[String]]("major_customers", O.Length(65535,varying=true))
    /** Database column business_overview SqlType(TEXT), Length(65535,true) */
    val businessOverview: Rep[Option[String]] = column[Option[String]]("business_overview", O.Length(65535,varying=true))
    /** Database column shareholders SqlType(TEXT), Length(65535,true) */
    val shareholders: Rep[Option[String]] = column[Option[String]]("shareholders", O.Length(65535,varying=true))
    /** Database column ribbon_id SqlType(INT) */
    val ribbonId: Rep[Option[Int]] = column[Option[Int]]("ribbon_id")
    /** Database column owner_name SqlType(VARCHAR), Length(100,true) */
    val ownerName: Rep[Option[String]] = column[Option[String]]("owner_name", O.Length(100,varying=true))
    /** Database column address SqlType(VARCHAR), Length(300,true) */
    val address: Rep[Option[String]] = column[Option[String]]("address", O.Length(300,varying=true))
    /** Database column is_authenticated SqlType(BIT) */
    val isAuthenticated: Rep[Option[Boolean]] = column[Option[Boolean]]("is_authenticated")
    /** Database column premium_status SqlType(VARCHAR), Length(10,true) */
    val premiumStatus: Rep[String] = column[String]("premium_status", O.Length(10,varying=true))
    /** Database column modified_at SqlType(TIMESTAMP) */
    val modifiedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("modified_at")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
  }
  /** Collection-like TableQuery object for table CompanyHistories */
  lazy val CompanyHistories = new TableQuery(tag => new CompanyHistories(tag))

  /** Entity class storing rows of table CompanyIndustry
   *  @param id Database column id SqlType(INT), AutoInc
   *  @param aclid Database column ACLID SqlType(INT)
   *  @param agsyulid Database column AGSYULID SqlType(TINYINT) */
  final case class CompanyIndustryRow(id: Option[Int] = None, aclid: Int, agsyulid: Option[Byte])
  /** GetResult implicit for fetching CompanyIndustryRow objects using plain SQL queries */
  implicit def GetResultCompanyIndustryRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[Option[Byte]]): GR[CompanyIndustryRow] = GR{
    prs => import prs._
    CompanyIndustryRow.tupled((<<?[Int], <<[Int], <<?[Byte]))
  }
  /** Table description of table company_industry. Objects of this class serve as prototypes for rows in queries. */
  class CompanyIndustry(_tableTag: Tag) extends profile.api.Table[CompanyIndustryRow](_tableTag, "company_industry") {
    def * = (Rep.Some(id), aclid, agsyulid) <> (CompanyIndustryRow.tupled, CompanyIndustryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(aclid), agsyulid).shaped.<>({r=>import r._; _1.map(_=> CompanyIndustryRow.tupled((_1, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc */
    val id: Rep[Int] = column[Int]("id", O.AutoInc)
    /** Database column ACLID SqlType(INT) */
    val aclid: Rep[Int] = column[Int]("ACLID")
    /** Database column AGSYULID SqlType(TINYINT) */
    val agsyulid: Rep[Option[Byte]] = column[Option[Byte]]("AGSYULID")

    /** Primary key of CompanyIndustry (database name PRIMARY) */
    val pk = primaryKey("PRIMARY", (id, aclid))
  }
  /** Collection-like TableQuery object for table CompanyIndustry */
  lazy val CompanyIndustry = new TableQuery(tag => new CompanyIndustry(tag))

  /** Row type of table CompanyMaster */
  type CompanyMasterRow = HCons[Int,HCons[Option[String],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[String],HCons[Option[String],HCons[Option[LocalDate],HCons[Option[Long],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[String],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Long],HCons[Option[Int],HCons[Option[Long],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[String],HCons[Option[Int],HCons[Option[String],HCons[Option[Int],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[String],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[String],HCons[Option[Int],HCons[Option[String],HCons[Option[Int],HCons[Option[String],HCons[Option[Int],HCons[Option[String],HCons[Option[Int],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[String],HCons[Option[Int],HCons[Option[Int],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[String],HCons[Option[Int],HCons[Option[LocalDate],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[LocalDate],HCons[Option[LocalDate],HCons[Option[LocalDate],HCons[Option[LocalDate],HCons[Option[String],HCons[Option[LocalDate],HCons[Option[String],HCons[Option[LocalDate],HCons[Option[String],HCons[Option[Char],HCons[Option[Int],HCons[Option[Int],HCons[Option[String],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for CompanyMasterRow providing default values if available in the database schema. */
  def CompanyMasterRow(aclid: Int, aclno: Option[String], acldlfl: Option[Int], astsfl: Option[Int], ajituprsid: Option[Int], atokuprsid: Option[Int], acomnm: Option[String], acomkn: Option[String], aodrcomnm: Option[String], acomryak: Option[String], askyucomnm: Option[Int], ackeitaifl: Option[Int], ackeiicifl: Option[Int], aurl1: Option[String], aownyshok: Option[String], aebdy: Option[LocalDate], asihon: Option[Long], asihongtyr: Option[Int], asihongtmt: Option[Int], aslcncfl: Option[Int], akesanfl: Option[Int], asl1: Option[Int], aslyr1: Option[Int], aslmt1: Option[Int], asl2: Option[Int], aslyr2: Option[Int], aslmt2: Option[Int], asl3: Option[Int], aslyr3: Option[Int], aslmt3: Option[Int], aslspl: Option[String], akjorv1: Option[Int], akjorvyr1: Option[Int], akjorvmt1: Option[Int], akjorv2: Option[Int], akjorvyr2: Option[Int], akjorvmt2: Option[Int], akjorv3: Option[Int], akjorvyr3: Option[Int], akjorvmt3: Option[Int], aempcnt: Option[Long], aempcntyr: Option[Int], aempcntmt: Option[Long], aaveage: Option[Int], aaveageyr: Option[Int], aaveagemt: Option[Int], amrate: Option[Int], awrate: Option[Int], asijoid: Option[Int], agaishifl: Option[Int], asykrcom: Option[String], aprdnm1: Option[String], aprdrate1: Option[Int], aprdnm2: Option[String], aprdrate2: Option[Int], aprdnm3: Option[String], aprdrate3: Option[Int], absct: Option[String], actrcom: Option[String], aryokl: Option[Int], aryoklcmt: Option[String], aknkofl: Option[Int], akosefl: Option[Int], akoyofl: Option[Int], arohofl: Option[Int], asyahocmt: Option[String], akiknfl: Option[Int], akikncmt: Option[String], afmlytfl: Option[Int], afmlytcmt: Option[String], atkintfl: Option[Int], atkintcmt: Option[String], ajutktfl: Option[Int], ajutktcmt: Option[String], avctn: Option[String], aysbf: Option[Int], aysbt: Option[Int], ayhoc: Option[Int], afkrksfl: Option[Int], afkrkscmt: Option[String], atsyksdfl: Option[Int], artrage: Option[Int], atsyksdcmt: Option[String], abizkyogo: Option[String], acsryofl: Option[Int], acsryocmt: Option[String], arctwy: Option[String], ajgyol: Option[String], ansyacmt: Option[String], aevlsys: Option[String], atntoraid: Option[Int], atcskflgrt: Option[Int], atcskflstb: Option[Int], atcskflfrk: Option[Int], atcskflord: Option[Int], atcskflots: Option[Int], atcskflrst: Option[Int], atcskfl: Option[Int], aordaddr: Option[String], areconfl: Option[Int], acltaprvdy: Option[LocalDate], asopid: Option[Int], asbtntoid: Option[Int], arcid: Option[Int], acomtsydy: Option[LocalDate], arevapprsdy: Option[LocalDate], abtdt: Option[LocalDate], acrdt: Option[LocalDate], acrid: Option[String], aupdt: Option[LocalDate], aupid: Option[String], adldt: Option[LocalDate], adlid: Option[String], adlfl: Option[Char], adrctsndfl: Option[Int], awebpbngfl: Option[Int], awebpbngbko: Option[String], atntora2id: Option[Int], atntora3id: Option[Int], atntora4id: Option[Int], atntora5id: Option[Int], atntobcid: Option[Int], atntopaid: Option[Int], atntoiesid: Option[Int], aicmnapvfl: Option[Int]): CompanyMasterRow = {
    aclid :: aclno :: acldlfl :: astsfl :: ajituprsid :: atokuprsid :: acomnm :: acomkn :: aodrcomnm :: acomryak :: askyucomnm :: ackeitaifl :: ackeiicifl :: aurl1 :: aownyshok :: aebdy :: asihon :: asihongtyr :: asihongtmt :: aslcncfl :: akesanfl :: asl1 :: aslyr1 :: aslmt1 :: asl2 :: aslyr2 :: aslmt2 :: asl3 :: aslyr3 :: aslmt3 :: aslspl :: akjorv1 :: akjorvyr1 :: akjorvmt1 :: akjorv2 :: akjorvyr2 :: akjorvmt2 :: akjorv3 :: akjorvyr3 :: akjorvmt3 :: aempcnt :: aempcntyr :: aempcntmt :: aaveage :: aaveageyr :: aaveagemt :: amrate :: awrate :: asijoid :: agaishifl :: asykrcom :: aprdnm1 :: aprdrate1 :: aprdnm2 :: aprdrate2 :: aprdnm3 :: aprdrate3 :: absct :: actrcom :: aryokl :: aryoklcmt :: aknkofl :: akosefl :: akoyofl :: arohofl :: asyahocmt :: akiknfl :: akikncmt :: afmlytfl :: afmlytcmt :: atkintfl :: atkintcmt :: ajutktfl :: ajutktcmt :: avctn :: aysbf :: aysbt :: ayhoc :: afkrksfl :: afkrkscmt :: atsyksdfl :: artrage :: atsyksdcmt :: abizkyogo :: acsryofl :: acsryocmt :: arctwy :: ajgyol :: ansyacmt :: aevlsys :: atntoraid :: atcskflgrt :: atcskflstb :: atcskflfrk :: atcskflord :: atcskflots :: atcskflrst :: atcskfl :: aordaddr :: areconfl :: acltaprvdy :: asopid :: asbtntoid :: arcid :: acomtsydy :: arevapprsdy :: abtdt :: acrdt :: acrid :: aupdt :: aupid :: adldt :: adlid :: adlfl :: adrctsndfl :: awebpbngfl :: awebpbngbko :: atntora2id :: atntora3id :: atntora4id :: atntora5id :: atntobcid :: atntopaid :: atntoiesid :: aicmnapvfl :: HNil
  }
  /** GetResult implicit for fetching CompanyMasterRow objects using plain SQL queries */
  implicit def GetResultCompanyMasterRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[Int]], e3: GR[Option[LocalDate]], e4: GR[Option[Long]], e5: GR[Option[Char]]): GR[CompanyMasterRow] = GR{
    prs => import prs._
    <<[Int] :: <<?[String] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[String] :: <<?[String] :: <<?[LocalDate] :: <<?[Long] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[String] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Long] :: <<?[Int] :: <<?[Long] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[String] :: <<?[Int] :: <<?[String] :: <<?[Int] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[String] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[String] :: <<?[Int] :: <<?[String] :: <<?[Int] :: <<?[String] :: <<?[Int] :: <<?[String] :: <<?[Int] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[String] :: <<?[Int] :: <<?[Int] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[String] :: <<?[Int] :: <<?[LocalDate] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[LocalDate] :: <<?[LocalDate] :: <<?[LocalDate] :: <<?[LocalDate] :: <<?[String] :: <<?[LocalDate] :: <<?[String] :: <<?[LocalDate] :: <<?[String] :: <<?[Char] :: <<?[Int] :: <<?[Int] :: <<?[String] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: HNil
  }
  /** Table description of table company_master. Objects of this class serve as prototypes for rows in queries. */
  class CompanyMaster(_tableTag: Tag) extends profile.api.Table[CompanyMasterRow](_tableTag, "company_master") {
    def * = aclid :: aclno :: acldlfl :: astsfl :: ajituprsid :: atokuprsid :: acomnm :: acomkn :: aodrcomnm :: acomryak :: askyucomnm :: ackeitaifl :: ackeiicifl :: aurl1 :: aownyshok :: aebdy :: asihon :: asihongtyr :: asihongtmt :: aslcncfl :: akesanfl :: asl1 :: aslyr1 :: aslmt1 :: asl2 :: aslyr2 :: aslmt2 :: asl3 :: aslyr3 :: aslmt3 :: aslspl :: akjorv1 :: akjorvyr1 :: akjorvmt1 :: akjorv2 :: akjorvyr2 :: akjorvmt2 :: akjorv3 :: akjorvyr3 :: akjorvmt3 :: aempcnt :: aempcntyr :: aempcntmt :: aaveage :: aaveageyr :: aaveagemt :: amrate :: awrate :: asijoid :: agaishifl :: asykrcom :: aprdnm1 :: aprdrate1 :: aprdnm2 :: aprdrate2 :: aprdnm3 :: aprdrate3 :: absct :: actrcom :: aryokl :: aryoklcmt :: aknkofl :: akosefl :: akoyofl :: arohofl :: asyahocmt :: akiknfl :: akikncmt :: afmlytfl :: afmlytcmt :: atkintfl :: atkintcmt :: ajutktfl :: ajutktcmt :: avctn :: aysbf :: aysbt :: ayhoc :: afkrksfl :: afkrkscmt :: atsyksdfl :: artrage :: atsyksdcmt :: abizkyogo :: acsryofl :: acsryocmt :: arctwy :: ajgyol :: ansyacmt :: aevlsys :: atntoraid :: atcskflgrt :: atcskflstb :: atcskflfrk :: atcskflord :: atcskflots :: atcskflrst :: atcskfl :: aordaddr :: areconfl :: acltaprvdy :: asopid :: asbtntoid :: arcid :: acomtsydy :: arevapprsdy :: abtdt :: acrdt :: acrid :: aupdt :: aupid :: adldt :: adlid :: adlfl :: adrctsndfl :: awebpbngfl :: awebpbngbko :: atntora2id :: atntora3id :: atntora4id :: atntora5id :: atntobcid :: atntopaid :: atntoiesid :: aicmnapvfl :: HNil

    /** Database column ACLID SqlType(INT), PrimaryKey */
    val aclid: Rep[Int] = column[Int]("ACLID", O.PrimaryKey)
    /** Database column ACLNO SqlType(VARCHAR), Length(7,true) */
    val aclno: Rep[Option[String]] = column[Option[String]]("ACLNO", O.Length(7,varying=true))
    /** Database column ACLDLFL SqlType(INT) */
    val acldlfl: Rep[Option[Int]] = column[Option[Int]]("ACLDLFL")
    /** Database column ASTSFL SqlType(INT) */
    val astsfl: Rep[Option[Int]] = column[Option[Int]]("ASTSFL")
    /** Database column AJITUPRSID SqlType(INT) */
    val ajituprsid: Rep[Option[Int]] = column[Option[Int]]("AJITUPRSID")
    /** Database column ATOKUPRSID SqlType(INT) */
    val atokuprsid: Rep[Option[Int]] = column[Option[Int]]("ATOKUPRSID")
    /** Database column ACOMNM SqlType(VARCHAR), Length(160,true) */
    val acomnm: Rep[Option[String]] = column[Option[String]]("ACOMNM", O.Length(160,varying=true))
    /** Database column ACOMKN SqlType(VARCHAR), Length(160,true) */
    val acomkn: Rep[Option[String]] = column[Option[String]]("ACOMKN", O.Length(160,varying=true))
    /** Database column AODRCOMNM SqlType(VARCHAR), Length(80,true) */
    val aodrcomnm: Rep[Option[String]] = column[Option[String]]("AODRCOMNM", O.Length(80,varying=true))
    /** Database column ACOMRYAK SqlType(VARCHAR), Length(80,true) */
    val acomryak: Rep[Option[String]] = column[Option[String]]("ACOMRYAK", O.Length(80,varying=true))
    /** Database column ASKYUCOMNM SqlType(INT) */
    val askyucomnm: Rep[Option[Int]] = column[Option[Int]]("ASKYUCOMNM")
    /** Database column ACKEITAIFL SqlType(INT) */
    val ackeitaifl: Rep[Option[Int]] = column[Option[Int]]("ACKEITAIFL")
    /** Database column ACKEIICIFL SqlType(INT) */
    val ackeiicifl: Rep[Option[Int]] = column[Option[Int]]("ACKEIICIFL")
    /** Database column AURL1 SqlType(VARCHAR), Length(200,true) */
    val aurl1: Rep[Option[String]] = column[Option[String]]("AURL1", O.Length(200,varying=true))
    /** Database column AOWNYSHOK SqlType(VARCHAR), Length(256,true) */
    val aownyshok: Rep[Option[String]] = column[Option[String]]("AOWNYSHOK", O.Length(256,varying=true))
    /** Database column AEBDY SqlType(DATE) */
    val aebdy: Rep[Option[LocalDate]] = column[Option[LocalDate]]("AEBDY")
    /** Database column ASIHON SqlType(BIGINT) */
    val asihon: Rep[Option[Long]] = column[Option[Long]]("ASIHON")
    /** Database column ASIHONGTYR SqlType(INT) */
    val asihongtyr: Rep[Option[Int]] = column[Option[Int]]("ASIHONGTYR")
    /** Database column ASIHONGTMT SqlType(INT) */
    val asihongtmt: Rep[Option[Int]] = column[Option[Int]]("ASIHONGTMT")
    /** Database column ASLCNCFL SqlType(INT) */
    val aslcncfl: Rep[Option[Int]] = column[Option[Int]]("ASLCNCFL")
    /** Database column AKESANFL SqlType(INT) */
    val akesanfl: Rep[Option[Int]] = column[Option[Int]]("AKESANFL")
    /** Database column ASL1 SqlType(INT) */
    val asl1: Rep[Option[Int]] = column[Option[Int]]("ASL1")
    /** Database column ASLYR1 SqlType(INT) */
    val aslyr1: Rep[Option[Int]] = column[Option[Int]]("ASLYR1")
    /** Database column ASLMT1 SqlType(INT) */
    val aslmt1: Rep[Option[Int]] = column[Option[Int]]("ASLMT1")
    /** Database column ASL2 SqlType(INT) */
    val asl2: Rep[Option[Int]] = column[Option[Int]]("ASL2")
    /** Database column ASLYR2 SqlType(INT) */
    val aslyr2: Rep[Option[Int]] = column[Option[Int]]("ASLYR2")
    /** Database column ASLMT2 SqlType(INT) */
    val aslmt2: Rep[Option[Int]] = column[Option[Int]]("ASLMT2")
    /** Database column ASL3 SqlType(INT) */
    val asl3: Rep[Option[Int]] = column[Option[Int]]("ASL3")
    /** Database column ASLYR3 SqlType(INT) */
    val aslyr3: Rep[Option[Int]] = column[Option[Int]]("ASLYR3")
    /** Database column ASLMT3 SqlType(INT) */
    val aslmt3: Rep[Option[Int]] = column[Option[Int]]("ASLMT3")
    /** Database column ASLSPL SqlType(VARCHAR), Length(500,true) */
    val aslspl: Rep[Option[String]] = column[Option[String]]("ASLSPL", O.Length(500,varying=true))
    /** Database column AKJORV1 SqlType(INT) */
    val akjorv1: Rep[Option[Int]] = column[Option[Int]]("AKJORV1")
    /** Database column AKJORVYR1 SqlType(INT) */
    val akjorvyr1: Rep[Option[Int]] = column[Option[Int]]("AKJORVYR1")
    /** Database column AKJORVMT1 SqlType(INT) */
    val akjorvmt1: Rep[Option[Int]] = column[Option[Int]]("AKJORVMT1")
    /** Database column AKJORV2 SqlType(INT) */
    val akjorv2: Rep[Option[Int]] = column[Option[Int]]("AKJORV2")
    /** Database column AKJORVYR2 SqlType(INT) */
    val akjorvyr2: Rep[Option[Int]] = column[Option[Int]]("AKJORVYR2")
    /** Database column AKJORVMT2 SqlType(INT) */
    val akjorvmt2: Rep[Option[Int]] = column[Option[Int]]("AKJORVMT2")
    /** Database column AKJORV3 SqlType(INT) */
    val akjorv3: Rep[Option[Int]] = column[Option[Int]]("AKJORV3")
    /** Database column AKJORVYR3 SqlType(INT) */
    val akjorvyr3: Rep[Option[Int]] = column[Option[Int]]("AKJORVYR3")
    /** Database column AKJORVMT3 SqlType(INT) */
    val akjorvmt3: Rep[Option[Int]] = column[Option[Int]]("AKJORVMT3")
    /** Database column AEMPCNT SqlType(BIGINT) */
    val aempcnt: Rep[Option[Long]] = column[Option[Long]]("AEMPCNT")
    /** Database column AEMPCNTYR SqlType(INT) */
    val aempcntyr: Rep[Option[Int]] = column[Option[Int]]("AEMPCNTYR")
    /** Database column AEMPCNTMT SqlType(BIGINT) */
    val aempcntmt: Rep[Option[Long]] = column[Option[Long]]("AEMPCNTMT")
    /** Database column AAVEAGE SqlType(INT) */
    val aaveage: Rep[Option[Int]] = column[Option[Int]]("AAVEAGE")
    /** Database column AAVEAGEYR SqlType(INT) */
    val aaveageyr: Rep[Option[Int]] = column[Option[Int]]("AAVEAGEYR")
    /** Database column AAVEAGEMT SqlType(INT) */
    val aaveagemt: Rep[Option[Int]] = column[Option[Int]]("AAVEAGEMT")
    /** Database column AMRATE SqlType(INT) */
    val amrate: Rep[Option[Int]] = column[Option[Int]]("AMRATE")
    /** Database column AWRATE SqlType(INT) */
    val awrate: Rep[Option[Int]] = column[Option[Int]]("AWRATE")
    /** Database column ASIJOID SqlType(INT) */
    val asijoid: Rep[Option[Int]] = column[Option[Int]]("ASIJOID")
    /** Database column AGAISHIFL SqlType(INT) */
    val agaishifl: Rep[Option[Int]] = column[Option[Int]]("AGAISHIFL")
    /** Database column ASYKRCOM SqlType(VARCHAR), Length(500,true) */
    val asykrcom: Rep[Option[String]] = column[Option[String]]("ASYKRCOM", O.Length(500,varying=true))
    /** Database column APRDNM1 SqlType(VARCHAR), Length(500,true) */
    val aprdnm1: Rep[Option[String]] = column[Option[String]]("APRDNM1", O.Length(500,varying=true))
    /** Database column APRDRATE1 SqlType(INT) */
    val aprdrate1: Rep[Option[Int]] = column[Option[Int]]("APRDRATE1")
    /** Database column APRDNM2 SqlType(VARCHAR), Length(500,true) */
    val aprdnm2: Rep[Option[String]] = column[Option[String]]("APRDNM2", O.Length(500,varying=true))
    /** Database column APRDRATE2 SqlType(INT) */
    val aprdrate2: Rep[Option[Int]] = column[Option[Int]]("APRDRATE2")
    /** Database column APRDNM3 SqlType(VARCHAR), Length(500,true) */
    val aprdnm3: Rep[Option[String]] = column[Option[String]]("APRDNM3", O.Length(500,varying=true))
    /** Database column APRDRATE3 SqlType(INT) */
    val aprdrate3: Rep[Option[Int]] = column[Option[Int]]("APRDRATE3")
    /** Database column ABSCT SqlType(VARCHAR), Length(2000,true) */
    val absct: Rep[Option[String]] = column[Option[String]]("ABSCT", O.Length(2000,varying=true))
    /** Database column ACTRCOM SqlType(VARCHAR), Length(500,true) */
    val actrcom: Rep[Option[String]] = column[Option[String]]("ACTRCOM", O.Length(500,varying=true))
    /** Database column ARYOKL SqlType(INT) */
    val aryokl: Rep[Option[Int]] = column[Option[Int]]("ARYOKL")
    /** Database column ARYOKLCMT SqlType(VARCHAR), Length(50,true) */
    val aryoklcmt: Rep[Option[String]] = column[Option[String]]("ARYOKLCMT", O.Length(50,varying=true))
    /** Database column AKNKOFL SqlType(INT) */
    val aknkofl: Rep[Option[Int]] = column[Option[Int]]("AKNKOFL")
    /** Database column AKOSEFL SqlType(INT) */
    val akosefl: Rep[Option[Int]] = column[Option[Int]]("AKOSEFL")
    /** Database column AKOYOFL SqlType(INT) */
    val akoyofl: Rep[Option[Int]] = column[Option[Int]]("AKOYOFL")
    /** Database column AROHOFL SqlType(INT) */
    val arohofl: Rep[Option[Int]] = column[Option[Int]]("AROHOFL")
    /** Database column ASYAHOCMT SqlType(VARCHAR), Length(200,true) */
    val asyahocmt: Rep[Option[String]] = column[Option[String]]("ASYAHOCMT", O.Length(200,varying=true))
    /** Database column AKIKNFL SqlType(INT) */
    val akiknfl: Rep[Option[Int]] = column[Option[Int]]("AKIKNFL")
    /** Database column AKIKNCMT SqlType(VARCHAR), Length(50,true) */
    val akikncmt: Rep[Option[String]] = column[Option[String]]("AKIKNCMT", O.Length(50,varying=true))
    /** Database column AFMLYTFL SqlType(INT) */
    val afmlytfl: Rep[Option[Int]] = column[Option[Int]]("AFMLYTFL")
    /** Database column AFMLYTCMT SqlType(VARCHAR), Length(50,true) */
    val afmlytcmt: Rep[Option[String]] = column[Option[String]]("AFMLYTCMT", O.Length(50,varying=true))
    /** Database column ATKINTFL SqlType(INT) */
    val atkintfl: Rep[Option[Int]] = column[Option[Int]]("ATKINTFL")
    /** Database column ATKINTCMT SqlType(VARCHAR), Length(50,true) */
    val atkintcmt: Rep[Option[String]] = column[Option[String]]("ATKINTCMT", O.Length(50,varying=true))
    /** Database column AJUTKTFL SqlType(INT) */
    val ajutktfl: Rep[Option[Int]] = column[Option[Int]]("AJUTKTFL")
    /** Database column AJUTKTCMT SqlType(VARCHAR), Length(50,true) */
    val ajutktcmt: Rep[Option[String]] = column[Option[String]]("AJUTKTCMT", O.Length(50,varying=true))
    /** Database column AVCTN SqlType(VARCHAR), Length(200,true) */
    val avctn: Rep[Option[String]] = column[Option[String]]("AVCTN", O.Length(200,varying=true))
    /** Database column AYSBF SqlType(INT) */
    val aysbf: Rep[Option[Int]] = column[Option[Int]]("AYSBF")
    /** Database column AYSBT SqlType(INT) */
    val aysbt: Rep[Option[Int]] = column[Option[Int]]("AYSBT")
    /** Database column AYHOC SqlType(INT) */
    val ayhoc: Rep[Option[Int]] = column[Option[Int]]("AYHOC")
    /** Database column AFKRKSFL SqlType(INT) */
    val afkrksfl: Rep[Option[Int]] = column[Option[Int]]("AFKRKSFL")
    /** Database column AFKRKSCMT SqlType(VARCHAR), Length(500,true) */
    val afkrkscmt: Rep[Option[String]] = column[Option[String]]("AFKRKSCMT", O.Length(500,varying=true))
    /** Database column ATSYKSDFL SqlType(INT) */
    val atsyksdfl: Rep[Option[Int]] = column[Option[Int]]("ATSYKSDFL")
    /** Database column ARTRAGE SqlType(INT) */
    val artrage: Rep[Option[Int]] = column[Option[Int]]("ARTRAGE")
    /** Database column ATSYKSDCMT SqlType(VARCHAR), Length(50,true) */
    val atsyksdcmt: Rep[Option[String]] = column[Option[String]]("ATSYKSDCMT", O.Length(50,varying=true))
    /** Database column ABIZKYOGO SqlType(VARCHAR), Length(500,true) */
    val abizkyogo: Rep[Option[String]] = column[Option[String]]("ABIZKYOGO", O.Length(500,varying=true))
    /** Database column ACSRYOFL SqlType(INT) */
    val acsryofl: Rep[Option[Int]] = column[Option[Int]]("ACSRYOFL")
    /** Database column ACSRYOCMT SqlType(VARCHAR), Length(500,true) */
    val acsryocmt: Rep[Option[String]] = column[Option[String]]("ACSRYOCMT", O.Length(500,varying=true))
    /** Database column ARCTWY SqlType(VARCHAR), Length(1100,true) */
    val arctwy: Rep[Option[String]] = column[Option[String]]("ARCTWY", O.Length(1100,varying=true))
    /** Database column AJGYOL SqlType(VARCHAR), Length(2000,true) */
    val ajgyol: Rep[Option[String]] = column[Option[String]]("AJGYOL", O.Length(2000,varying=true))
    /** Database column ANSYACMT SqlType(VARCHAR), Length(1000,true) */
    val ansyacmt: Rep[Option[String]] = column[Option[String]]("ANSYACMT", O.Length(1000,varying=true))
    /** Database column AEVLSYS SqlType(VARCHAR), Length(1000,true) */
    val aevlsys: Rep[Option[String]] = column[Option[String]]("AEVLSYS", O.Length(1000,varying=true))
    /** Database column ATNTORAID SqlType(INT) */
    val atntoraid: Rep[Option[Int]] = column[Option[Int]]("ATNTORAID")
    /** Database column ATCSKFLGRT SqlType(INT) */
    val atcskflgrt: Rep[Option[Int]] = column[Option[Int]]("ATCSKFLGRT")
    /** Database column ATCSKFLSTB SqlType(INT) */
    val atcskflstb: Rep[Option[Int]] = column[Option[Int]]("ATCSKFLSTB")
    /** Database column ATCSKFLFRK SqlType(INT) */
    val atcskflfrk: Rep[Option[Int]] = column[Option[Int]]("ATCSKFLFRK")
    /** Database column ATCSKFLORD SqlType(INT) */
    val atcskflord: Rep[Option[Int]] = column[Option[Int]]("ATCSKFLORD")
    /** Database column ATCSKFLOTS SqlType(INT) */
    val atcskflots: Rep[Option[Int]] = column[Option[Int]]("ATCSKFLOTS")
    /** Database column ATCSKFLRST SqlType(INT) */
    val atcskflrst: Rep[Option[Int]] = column[Option[Int]]("ATCSKFLRST")
    /** Database column ATCSKFL SqlType(INT) */
    val atcskfl: Rep[Option[Int]] = column[Option[Int]]("ATCSKFL")
    /** Database column AORDADDR SqlType(VARCHAR), Length(200,true) */
    val aordaddr: Rep[Option[String]] = column[Option[String]]("AORDADDR", O.Length(200,varying=true))
    /** Database column ARECONFL SqlType(INT) */
    val areconfl: Rep[Option[Int]] = column[Option[Int]]("ARECONFL")
    /** Database column ACLTAPRVDY SqlType(DATE) */
    val acltaprvdy: Rep[Option[LocalDate]] = column[Option[LocalDate]]("ACLTAPRVDY")
    /** Database column ASOPID SqlType(INT) */
    val asopid: Rep[Option[Int]] = column[Option[Int]]("ASOPID")
    /** Database column ASBTNTOID SqlType(INT) */
    val asbtntoid: Rep[Option[Int]] = column[Option[Int]]("ASBTNTOID")
    /** Database column ARCID SqlType(INT) */
    val arcid: Rep[Option[Int]] = column[Option[Int]]("ARCID")
    /** Database column ACOMTSYDY SqlType(DATE) */
    val acomtsydy: Rep[Option[LocalDate]] = column[Option[LocalDate]]("ACOMTSYDY")
    /** Database column AREVAPPRSDY SqlType(DATE) */
    val arevapprsdy: Rep[Option[LocalDate]] = column[Option[LocalDate]]("AREVAPPRSDY")
    /** Database column ABTDT SqlType(DATE) */
    val abtdt: Rep[Option[LocalDate]] = column[Option[LocalDate]]("ABTDT")
    /** Database column ACRDT SqlType(DATE) */
    val acrdt: Rep[Option[LocalDate]] = column[Option[LocalDate]]("ACRDT")
    /** Database column ACRID SqlType(VARCHAR), Length(10,true) */
    val acrid: Rep[Option[String]] = column[Option[String]]("ACRID", O.Length(10,varying=true))
    /** Database column AUPDT SqlType(DATE) */
    val aupdt: Rep[Option[LocalDate]] = column[Option[LocalDate]]("AUPDT")
    /** Database column AUPID SqlType(VARCHAR), Length(10,true) */
    val aupid: Rep[Option[String]] = column[Option[String]]("AUPID", O.Length(10,varying=true))
    /** Database column ADLDT SqlType(DATE) */
    val adldt: Rep[Option[LocalDate]] = column[Option[LocalDate]]("ADLDT")
    /** Database column ADLID SqlType(VARCHAR), Length(10,true) */
    val adlid: Rep[Option[String]] = column[Option[String]]("ADLID", O.Length(10,varying=true))
    /** Database column ADLFL SqlType(VARCHAR) */
    val adlfl: Rep[Option[Char]] = column[Option[Char]]("ADLFL")
    /** Database column ADRCTSNDFL SqlType(INT) */
    val adrctsndfl: Rep[Option[Int]] = column[Option[Int]]("ADRCTSNDFL")
    /** Database column AWEBPBNGFL SqlType(INT) */
    val awebpbngfl: Rep[Option[Int]] = column[Option[Int]]("AWEBPBNGFL")
    /** Database column AWEBPBNGBKO SqlType(VARCHAR), Length(200,true) */
    val awebpbngbko: Rep[Option[String]] = column[Option[String]]("AWEBPBNGBKO", O.Length(200,varying=true))
    /** Database column ATNTORA2ID SqlType(INT) */
    val atntora2id: Rep[Option[Int]] = column[Option[Int]]("ATNTORA2ID")
    /** Database column ATNTORA3ID SqlType(INT) */
    val atntora3id: Rep[Option[Int]] = column[Option[Int]]("ATNTORA3ID")
    /** Database column ATNTORA4ID SqlType(INT) */
    val atntora4id: Rep[Option[Int]] = column[Option[Int]]("ATNTORA4ID")
    /** Database column ATNTORA5ID SqlType(INT) */
    val atntora5id: Rep[Option[Int]] = column[Option[Int]]("ATNTORA5ID")
    /** Database column ATNTOBCID SqlType(INT) */
    val atntobcid: Rep[Option[Int]] = column[Option[Int]]("ATNTOBCID")
    /** Database column ATNTOPAID SqlType(INT) */
    val atntopaid: Rep[Option[Int]] = column[Option[Int]]("ATNTOPAID")
    /** Database column ATNTOIESID SqlType(INT) */
    val atntoiesid: Rep[Option[Int]] = column[Option[Int]]("ATNTOIESID")
    /** Database column AICMNAPVFL SqlType(INT) */
    val aicmnapvfl: Rep[Option[Int]] = column[Option[Int]]("AICMNAPVFL")
  }
  /** Collection-like TableQuery object for table CompanyMaster */
  lazy val CompanyMaster = new TableQuery(tag => new CompanyMaster(tag))

  /** Entity class storing rows of table CompanyPremium
   *  @param companyId Database column company_id SqlType(INT), PrimaryKey
   *  @param premiumImage Database column premium_image SqlType(VARCHAR), Length(200,true)
   *  @param requirements Database column requirements SqlType(TEXT), Length(65535,true)
   *  @param premiumImageSp Database column premium_image_sp SqlType(VARCHAR), Length(200,true)
   *  @param weight Database column weight SqlType(INT), Default(10) */
  final case class CompanyPremiumRow(companyId: Int, premiumImage: Option[String], requirements: Option[String], premiumImageSp: Option[String], weight: Int = 10)
  /** GetResult implicit for fetching CompanyPremiumRow objects using plain SQL queries */
  implicit def GetResultCompanyPremiumRow(implicit e0: GR[Int], e1: GR[Option[String]]): GR[CompanyPremiumRow] = GR{
    prs => import prs._
    CompanyPremiumRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<[Int]))
  }
  /** Table description of table company_premium. Objects of this class serve as prototypes for rows in queries. */
  class CompanyPremium(_tableTag: Tag) extends profile.api.Table[CompanyPremiumRow](_tableTag, "company_premium") {
    def * = (companyId, premiumImage, requirements, premiumImageSp, weight) <> (CompanyPremiumRow.tupled, CompanyPremiumRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(companyId), premiumImage, requirements, premiumImageSp, Rep.Some(weight)).shaped.<>({r=>import r._; _1.map(_=> CompanyPremiumRow.tupled((_1.get, _2, _3, _4, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_id SqlType(INT), PrimaryKey */
    val companyId: Rep[Int] = column[Int]("company_id", O.PrimaryKey)
    /** Database column premium_image SqlType(VARCHAR), Length(200,true) */
    val premiumImage: Rep[Option[String]] = column[Option[String]]("premium_image", O.Length(200,varying=true))
    /** Database column requirements SqlType(TEXT), Length(65535,true) */
    val requirements: Rep[Option[String]] = column[Option[String]]("requirements", O.Length(65535,varying=true))
    /** Database column premium_image_sp SqlType(VARCHAR), Length(200,true) */
    val premiumImageSp: Rep[Option[String]] = column[Option[String]]("premium_image_sp", O.Length(200,varying=true))
    /** Database column weight SqlType(INT), Default(10) */
    val weight: Rep[Int] = column[Int]("weight", O.Default(10))
  }
  /** Collection-like TableQuery object for table CompanyPremium */
  lazy val CompanyPremium = new TableQuery(tag => new CompanyPremium(tag))

  /** Entity class storing rows of table CompanyRelationshipPksha
   *  @param companyId Database column company_id SqlType(INT), AutoInc, PrimaryKey
   *  @param pkshaCompanyId Database column pksha_company_id SqlType(VARCHAR), Length(255,true)
   *  @param companyType Database column company_type SqlType(CHAR) */
  final case class CompanyRelationshipPkshaRow(companyId: Option[Int] = None, pkshaCompanyId: String, companyType: Option[Char])
  /** GetResult implicit for fetching CompanyRelationshipPkshaRow objects using plain SQL queries */
  implicit def GetResultCompanyRelationshipPkshaRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[Char]]): GR[CompanyRelationshipPkshaRow] = GR{
    prs => import prs._
    CompanyRelationshipPkshaRow.tupled((<<?[Int], <<[String], <<?[Char]))
  }
  /** Table description of table company_relationship_pksha. Objects of this class serve as prototypes for rows in queries. */
  class CompanyRelationshipPksha(_tableTag: Tag) extends profile.api.Table[CompanyRelationshipPkshaRow](_tableTag, "company_relationship_pksha") {
    def * = (Rep.Some(companyId), pkshaCompanyId, companyType) <> (CompanyRelationshipPkshaRow.tupled, CompanyRelationshipPkshaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(companyId), Rep.Some(pkshaCompanyId), companyType).shaped.<>({r=>import r._; _1.map(_=> CompanyRelationshipPkshaRow.tupled((_1, _2.get, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_id SqlType(INT), AutoInc, PrimaryKey */
    val companyId: Rep[Int] = column[Int]("company_id", O.AutoInc, O.PrimaryKey)
    /** Database column pksha_company_id SqlType(VARCHAR), Length(255,true) */
    val pkshaCompanyId: Rep[String] = column[String]("pksha_company_id", O.Length(255,varying=true))
    /** Database column company_type SqlType(CHAR) */
    val companyType: Rep[Option[Char]] = column[Option[Char]]("company_type")

    /** Foreign key referencing Companies (database name company_relationship_pksha_ibfk_1) */
    lazy val companiesFk = foreignKey("company_relationship_pksha_ibfk_1", companyId, Companies)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CompanyRelationshipPksha */
  lazy val CompanyRelationshipPksha = new TableQuery(tag => new CompanyRelationshipPksha(tag))

  /** Entity class storing rows of table CompanyUpdateRejectReason
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param companyId Database column company_id SqlType(INT)
   *  @param memo Database column memo SqlType(TEXT), Length(65535,true)
   *  @param created Database column created SqlType(TIMESTAMP) */
  final case class CompanyUpdateRejectReasonRow(id: Option[Int] = None, companyId: Int, memo: Option[String], created: Option[DateTime])
  /** GetResult implicit for fetching CompanyUpdateRejectReasonRow objects using plain SQL queries */
  implicit def GetResultCompanyUpdateRejectReasonRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[Option[String]], e3: GR[Option[DateTime]]): GR[CompanyUpdateRejectReasonRow] = GR{
    prs => import prs._
    CompanyUpdateRejectReasonRow.tupled((<<?[Int], <<[Int], <<?[String], <<[Option[DateTime]]))
  }
  /** Table description of table company_update_reject_reason. Objects of this class serve as prototypes for rows in queries. */
  class CompanyUpdateRejectReason(_tableTag: Tag) extends profile.api.Table[CompanyUpdateRejectReasonRow](_tableTag, "company_update_reject_reason") {
    def * = (Rep.Some(id), companyId, memo, created) <> (CompanyUpdateRejectReasonRow.tupled, CompanyUpdateRejectReasonRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(companyId), memo, Rep.Some(created)).shaped.<>({r=>import r._; _1.map(_=> CompanyUpdateRejectReasonRow.tupled((_1, _2.get, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column company_id SqlType(INT) */
    val companyId: Rep[Int] = column[Int]("company_id")
    /** Database column memo SqlType(TEXT), Length(65535,true) */
    val memo: Rep[Option[String]] = column[Option[String]]("memo", O.Length(65535,varying=true))
    /** Database column created SqlType(TIMESTAMP) */
    val created: Rep[Option[DateTime]] = column[Option[DateTime]]("created")

    /** Foreign key referencing Companies (database name company_update_reject_reason_ibfk_1) */
    lazy val companiesFk = foreignKey("company_update_reject_reason_ibfk_1", companyId, Companies)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table CompanyUpdateRejectReason */
  lazy val CompanyUpdateRejectReason = new TableQuery(tag => new CompanyUpdateRejectReason(tag))

  /** Entity class storing rows of table CompanyUpdateRequest
   *  @param companyId Database column company_id SqlType(INT), PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param nameKana Database column name_kana SqlType(VARCHAR), Length(255,true)
   *  @param prefectureId Database column prefecture_id SqlType(INT)
   *  @param url Database column url SqlType(VARCHAR), Length(1023,true)
   *  @param establishment Database column establishment SqlType(DATE)
   *  @param capitalId Database column capital_id SqlType(INT)
   *  @param sales Database column sales SqlType(BIGINT)
   *  @param numberOfEmployeeId Database column number_of_employee_id SqlType(INT)
   *  @param listingType Database column listing_type SqlType(BIT)
   *  @param foreignCapitalType Database column foreign_capital_type SqlType(BIT)
   *  @param industryLargeId Database column industry_large_id SqlType(INT)
   *  @param averageAge Database column average_age SqlType(VARCHAR), Length(50,true)
   *  @param majorCustomers Database column major_customers SqlType(TEXT), Length(65535,true)
   *  @param businessOverview Database column business_overview SqlType(TEXT), Length(65535,true)
   *  @param shareholders Database column shareholders SqlType(TEXT), Length(65535,true)
   *  @param status Database column status SqlType(VARCHAR), Length(10,true)
   *  @param created Database column created SqlType(TIMESTAMP)
   *  @param modified Database column modified SqlType(TIMESTAMP)
   *  @param ownerName Database column owner_name SqlType(VARCHAR), Length(100,true)
   *  @param address Database column address SqlType(VARCHAR), Length(300,true) */
  final case class CompanyUpdateRequestRow(companyId: Int, name: String, nameKana: String, prefectureId: Option[Int], url: Option[String], establishment: Option[LocalDate], capitalId: Option[Int], sales: Option[Long], numberOfEmployeeId: Option[Int], listingType: Option[Boolean], foreignCapitalType: Option[Boolean], industryLargeId: Option[Int], averageAge: Option[String], majorCustomers: Option[String], businessOverview: Option[String], shareholders: Option[String], status: Option[String], created: Option[DateTime], modified: Option[DateTime], ownerName: Option[String], address: Option[String])
  /** GetResult implicit for fetching CompanyUpdateRequestRow objects using plain SQL queries */
  implicit def GetResultCompanyUpdateRequestRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[Int]], e3: GR[Option[String]], e4: GR[Option[LocalDate]], e5: GR[Option[Long]], e6: GR[Option[Boolean]], e7: GR[Option[DateTime]]): GR[CompanyUpdateRequestRow] = GR{
    prs => import prs._
    CompanyUpdateRequestRow.tupled((<<[Int], <<[String], <<[String], <<?[Int], <<?[String], <<?[LocalDate], <<?[Int], <<?[Long], <<?[Int], <<?[Boolean], <<?[Boolean], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[Option[DateTime]], <<[Option[DateTime]], <<?[String], <<?[String]))
  }
  /** Table description of table company_update_request. Objects of this class serve as prototypes for rows in queries. */
  class CompanyUpdateRequest(_tableTag: Tag) extends profile.api.Table[CompanyUpdateRequestRow](_tableTag, "company_update_request") {
    def * = (companyId, name, nameKana, prefectureId, url, establishment, capitalId, sales, numberOfEmployeeId, listingType, foreignCapitalType, industryLargeId, averageAge, majorCustomers, businessOverview, shareholders, status, created, modified, ownerName, address) <> (CompanyUpdateRequestRow.tupled, CompanyUpdateRequestRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(companyId), Rep.Some(name), Rep.Some(nameKana), prefectureId, url, establishment, capitalId, sales, numberOfEmployeeId, listingType, foreignCapitalType, industryLargeId, averageAge, majorCustomers, businessOverview, shareholders, status, Rep.Some(created), Rep.Some(modified), ownerName, address).shaped.<>({r=>import r._; _1.map(_=> CompanyUpdateRequestRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18.get, _19.get, _20, _21)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_id SqlType(INT), PrimaryKey */
    val companyId: Rep[Int] = column[Int]("company_id", O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column name_kana SqlType(VARCHAR), Length(255,true) */
    val nameKana: Rep[String] = column[String]("name_kana", O.Length(255,varying=true))
    /** Database column prefecture_id SqlType(INT) */
    val prefectureId: Rep[Option[Int]] = column[Option[Int]]("prefecture_id")
    /** Database column url SqlType(VARCHAR), Length(1023,true) */
    val url: Rep[Option[String]] = column[Option[String]]("url", O.Length(1023,varying=true))
    /** Database column establishment SqlType(DATE) */
    val establishment: Rep[Option[LocalDate]] = column[Option[LocalDate]]("establishment")
    /** Database column capital_id SqlType(INT) */
    val capitalId: Rep[Option[Int]] = column[Option[Int]]("capital_id")
    /** Database column sales SqlType(BIGINT) */
    val sales: Rep[Option[Long]] = column[Option[Long]]("sales")
    /** Database column number_of_employee_id SqlType(INT) */
    val numberOfEmployeeId: Rep[Option[Int]] = column[Option[Int]]("number_of_employee_id")
    /** Database column listing_type SqlType(BIT) */
    val listingType: Rep[Option[Boolean]] = column[Option[Boolean]]("listing_type")
    /** Database column foreign_capital_type SqlType(BIT) */
    val foreignCapitalType: Rep[Option[Boolean]] = column[Option[Boolean]]("foreign_capital_type")
    /** Database column industry_large_id SqlType(INT) */
    val industryLargeId: Rep[Option[Int]] = column[Option[Int]]("industry_large_id")
    /** Database column average_age SqlType(VARCHAR), Length(50,true) */
    val averageAge: Rep[Option[String]] = column[Option[String]]("average_age", O.Length(50,varying=true))
    /** Database column major_customers SqlType(TEXT), Length(65535,true) */
    val majorCustomers: Rep[Option[String]] = column[Option[String]]("major_customers", O.Length(65535,varying=true))
    /** Database column business_overview SqlType(TEXT), Length(65535,true) */
    val businessOverview: Rep[Option[String]] = column[Option[String]]("business_overview", O.Length(65535,varying=true))
    /** Database column shareholders SqlType(TEXT), Length(65535,true) */
    val shareholders: Rep[Option[String]] = column[Option[String]]("shareholders", O.Length(65535,varying=true))
    /** Database column status SqlType(VARCHAR), Length(10,true) */
    val status: Rep[Option[String]] = column[Option[String]]("status", O.Length(10,varying=true))
    /** Database column created SqlType(TIMESTAMP) */
    val created: Rep[Option[DateTime]] = column[Option[DateTime]]("created")
    /** Database column modified SqlType(TIMESTAMP) */
    val modified: Rep[Option[DateTime]] = column[Option[DateTime]]("modified")
    /** Database column owner_name SqlType(VARCHAR), Length(100,true) */
    val ownerName: Rep[Option[String]] = column[Option[String]]("owner_name", O.Length(100,varying=true))
    /** Database column address SqlType(VARCHAR), Length(300,true) */
    val address: Rep[Option[String]] = column[Option[String]]("address", O.Length(300,varying=true))
  }
  /** Collection-like TableQuery object for table CompanyUpdateRequest */
  lazy val CompanyUpdateRequest = new TableQuery(tag => new CompanyUpdateRequest(tag))

  /** Entity class storing rows of table CompanyUserEntries
   *  @param hashKey Database column hash_key SqlType(VARCHAR), PrimaryKey, Length(100,true)
   *  @param companyId Database column company_id SqlType(INT)
   *  @param mailAddress Database column mail_address SqlType(VARCHAR), Length(100,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param sent Database column sent SqlType(BIT) */
  final case class CompanyUserEntriesRow(hashKey: String, companyId: Int, mailAddress: String, createdAt: Option[DateTime], sent: Boolean)
  /** GetResult implicit for fetching CompanyUserEntriesRow objects using plain SQL queries */
  implicit def GetResultCompanyUserEntriesRow(implicit e0: GR[String], e1: GR[Int], e2: GR[Option[DateTime]], e3: GR[Boolean]): GR[CompanyUserEntriesRow] = GR{
    prs => import prs._
    CompanyUserEntriesRow.tupled((<<[String], <<[Int], <<[String], <<[Option[DateTime]], <<[Boolean]))
  }
  /** Table description of table company_user_entries. Objects of this class serve as prototypes for rows in queries. */
  class CompanyUserEntries(_tableTag: Tag) extends profile.api.Table[CompanyUserEntriesRow](_tableTag, "company_user_entries") {
    def * = (hashKey, companyId, mailAddress, createdAt, sent) <> (CompanyUserEntriesRow.tupled, CompanyUserEntriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(hashKey), Rep.Some(companyId), Rep.Some(mailAddress), Rep.Some(createdAt), Rep.Some(sent)).shaped.<>({r=>import r._; _1.map(_=> CompanyUserEntriesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column hash_key SqlType(VARCHAR), PrimaryKey, Length(100,true) */
    val hashKey: Rep[String] = column[String]("hash_key", O.PrimaryKey, O.Length(100,varying=true))
    /** Database column company_id SqlType(INT) */
    val companyId: Rep[Int] = column[Int]("company_id")
    /** Database column mail_address SqlType(VARCHAR), Length(100,true) */
    val mailAddress: Rep[String] = column[String]("mail_address", O.Length(100,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column sent SqlType(BIT) */
    val sent: Rep[Boolean] = column[Boolean]("sent")

    /** Uniqueness Index over (mailAddress) (database name mail_address) */
    val index1 = index("mail_address", mailAddress, unique=true)
  }
  /** Collection-like TableQuery object for table CompanyUserEntries */
  lazy val CompanyUserEntries = new TableQuery(tag => new CompanyUserEntries(tag))

  /** Entity class storing rows of table CompanyUsers
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param companyId Database column company_id SqlType(INT)
   *  @param mailAddress Database column mail_address SqlType(VARCHAR), Length(100,true)
   *  @param password Database column password SqlType(VARCHAR), Length(100,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param modifiedAt Database column modified_at SqlType(TIMESTAMP)
   *  @param name Database column name SqlType(VARCHAR), Length(100,true) */
  final case class CompanyUsersRow(id: Option[Int] = None, companyId: Int, mailAddress: String, password: String, createdAt: Option[DateTime], modifiedAt: Option[DateTime], name: Option[String])
  /** GetResult implicit for fetching CompanyUsersRow objects using plain SQL queries */
  implicit def GetResultCompanyUsersRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[String], e3: GR[Option[DateTime]], e4: GR[Option[String]]): GR[CompanyUsersRow] = GR{
    prs => import prs._
    CompanyUsersRow.tupled((<<?[Int], <<[Int], <<[String], <<[String], <<[Option[DateTime]], <<[Option[DateTime]], <<?[String]))
  }
  /** Table description of table company_users. Objects of this class serve as prototypes for rows in queries. */
  class CompanyUsers(_tableTag: Tag) extends profile.api.Table[CompanyUsersRow](_tableTag, "company_users") {
    def * = (Rep.Some(id), companyId, mailAddress, password, createdAt, modifiedAt, name) <> (CompanyUsersRow.tupled, CompanyUsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(companyId), Rep.Some(mailAddress), Rep.Some(password), Rep.Some(createdAt), Rep.Some(modifiedAt), name).shaped.<>({r=>import r._; _1.map(_=> CompanyUsersRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column company_id SqlType(INT) */
    val companyId: Rep[Int] = column[Int]("company_id")
    /** Database column mail_address SqlType(VARCHAR), Length(100,true) */
    val mailAddress: Rep[String] = column[String]("mail_address", O.Length(100,varying=true))
    /** Database column password SqlType(VARCHAR), Length(100,true) */
    val password: Rep[String] = column[String]("password", O.Length(100,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column modified_at SqlType(TIMESTAMP) */
    val modifiedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("modified_at")
    /** Database column name SqlType(VARCHAR), Length(100,true) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(100,varying=true))

    /** Foreign key referencing Companies (database name company_users_ibfk_1) */
    lazy val companiesFk = foreignKey("company_users_ibfk_1", companyId, Companies)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (mailAddress) (database name mail_address) */
    val index1 = index("mail_address", mailAddress, unique=true)
  }
  /** Collection-like TableQuery object for table CompanyUsers */
  lazy val CompanyUsers = new TableQuery(tag => new CompanyUsers(tag))

  /** Entity class storing rows of table ContactCategories
   *  @param contactId Database column contact_id SqlType(INT)
   *  @param categoryId Database column category_id SqlType(INT) */
  final case class ContactCategoriesRow(contactId: Int, categoryId: Int)
  /** GetResult implicit for fetching ContactCategoriesRow objects using plain SQL queries */
  implicit def GetResultContactCategoriesRow(implicit e0: GR[Int]): GR[ContactCategoriesRow] = GR{
    prs => import prs._
    ContactCategoriesRow.tupled((<<[Int], <<[Int]))
  }
  /** Table description of table contact_categories. Objects of this class serve as prototypes for rows in queries. */
  class ContactCategories(_tableTag: Tag) extends profile.api.Table[ContactCategoriesRow](_tableTag, "contact_categories") {
    def * = (contactId, categoryId) <> (ContactCategoriesRow.tupled, ContactCategoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(contactId), Rep.Some(categoryId)).shaped.<>({r=>import r._; _1.map(_=> ContactCategoriesRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column contact_id SqlType(INT) */
    val contactId: Rep[Int] = column[Int]("contact_id")
    /** Database column category_id SqlType(INT) */
    val categoryId: Rep[Int] = column[Int]("category_id")

    /** Foreign key referencing Contacts (database name contact_categories_ibfk_1) */
    lazy val contactsFk = foreignKey("contact_categories_ibfk_1", contactId, Contacts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ContactCategories */
  lazy val ContactCategories = new TableQuery(tag => new ContactCategories(tag))

  /** Entity class storing rows of table ContactMessages
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param contactId Database column contact_id SqlType(INT)
   *  @param projectId Database column project_id SqlType(INT)
   *  @param content Database column content SqlType(TEXT), Length(65535,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP) */
  final case class ContactMessagesRow(id: Option[Int] = None, contactId: Int, projectId: Option[Int], content: String, createdAt: Option[DateTime])
  /** GetResult implicit for fetching ContactMessagesRow objects using plain SQL queries */
  implicit def GetResultContactMessagesRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[String], e3: GR[Option[DateTime]]): GR[ContactMessagesRow] = GR{
    prs => import prs._
    ContactMessagesRow.tupled((<<?[Int], <<[Int], <<?[Int], <<[String], <<[Option[DateTime]]))
  }
  /** Table description of table contact_messages. Objects of this class serve as prototypes for rows in queries. */
  class ContactMessages(_tableTag: Tag) extends profile.api.Table[ContactMessagesRow](_tableTag, "contact_messages") {
    def * = (Rep.Some(id), contactId, projectId, content, createdAt) <> (ContactMessagesRow.tupled, ContactMessagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(contactId), projectId, Rep.Some(content), Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> ContactMessagesRow.tupled((_1, _2.get, _3, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column contact_id SqlType(INT) */
    val contactId: Rep[Int] = column[Int]("contact_id")
    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Option[Int]] = column[Option[Int]]("project_id")
    /** Database column content SqlType(TEXT), Length(65535,true) */
    val content: Rep[String] = column[String]("content", O.Length(65535,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")

    /** Foreign key referencing Contacts (database name contact_messages_ibfk_1) */
    lazy val contactsFk = foreignKey("contact_messages_ibfk_1", contactId, Contacts)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ContactMessages */
  lazy val ContactMessages = new TableQuery(tag => new ContactMessages(tag))

  /** Entity class storing rows of table Contacts
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param senderProjectId Database column sender_project_id SqlType(INT)
   *  @param senderUserId Database column sender_user_id SqlType(INT)
   *  @param receiverProjectId Database column receiver_project_id SqlType(INT)
   *  @param senderUnread Database column sender_unread SqlType(BIT)
   *  @param receiverUnread Database column receiver_unread SqlType(BIT)
   *  @param lastPostedAt Database column last_posted_at SqlType(TIMESTAMP)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param modifiedAt Database column modified_at SqlType(TIMESTAMP) */
  final case class ContactsRow(id: Option[Int] = None, senderProjectId: Int, senderUserId: Int, receiverProjectId: Int, senderUnread: Boolean, receiverUnread: Boolean, lastPostedAt: Option[DateTime], createdAt: Option[DateTime], modifiedAt: Option[DateTime])
  /** GetResult implicit for fetching ContactsRow objects using plain SQL queries */
  implicit def GetResultContactsRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[Boolean], e3: GR[Option[DateTime]]): GR[ContactsRow] = GR{
    prs => import prs._
    ContactsRow.tupled((<<?[Int], <<[Int], <<[Int], <<[Int], <<[Boolean], <<[Boolean], <<[Option[DateTime]], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table contacts. Objects of this class serve as prototypes for rows in queries. */
  class Contacts(_tableTag: Tag) extends profile.api.Table[ContactsRow](_tableTag, "contacts") {
    def * = (Rep.Some(id), senderProjectId, senderUserId, receiverProjectId, senderUnread, receiverUnread, lastPostedAt, createdAt, modifiedAt) <> (ContactsRow.tupled, ContactsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(senderProjectId), Rep.Some(senderUserId), Rep.Some(receiverProjectId), Rep.Some(senderUnread), Rep.Some(receiverUnread), Rep.Some(lastPostedAt), Rep.Some(createdAt), Rep.Some(modifiedAt)).shaped.<>({r=>import r._; _1.map(_=> ContactsRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column sender_project_id SqlType(INT) */
    val senderProjectId: Rep[Int] = column[Int]("sender_project_id")
    /** Database column sender_user_id SqlType(INT) */
    val senderUserId: Rep[Int] = column[Int]("sender_user_id")
    /** Database column receiver_project_id SqlType(INT) */
    val receiverProjectId: Rep[Int] = column[Int]("receiver_project_id")
    /** Database column sender_unread SqlType(BIT) */
    val senderUnread: Rep[Boolean] = column[Boolean]("sender_unread")
    /** Database column receiver_unread SqlType(BIT) */
    val receiverUnread: Rep[Boolean] = column[Boolean]("receiver_unread")
    /** Database column last_posted_at SqlType(TIMESTAMP) */
    val lastPostedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("last_posted_at")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column modified_at SqlType(TIMESTAMP) */
    val modifiedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("modified_at")

    /** Foreign key referencing CompanyUsers (database name contacts_fk_3) */
    lazy val companyUsersFk = foreignKey("contacts_fk_3", senderUserId, CompanyUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Projects (database name contacts_fk_1) */
    lazy val projectsFk2 = foreignKey("contacts_fk_1", senderProjectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Projects (database name contacts_fk_2) */
    lazy val projectsFk3 = foreignKey("contacts_fk_2", receiverProjectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Contacts */
  lazy val Contacts = new TableQuery(tag => new Contacts(tag))

  /** Entity class storing rows of table ContactTemporaries
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param senderProjectId Database column sender_project_id SqlType(INT)
   *  @param senderUserId Database column sender_user_id SqlType(INT)
   *  @param receiverProjectId Database column receiver_project_id SqlType(INT)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param message Database column message SqlType(TEXT), Length(65535,true)
   *  @param categories Database column categories SqlType(VARCHAR), Length(100,true) */
  final case class ContactTemporariesRow(id: Option[Int] = None, senderProjectId: Int, senderUserId: Int, receiverProjectId: Int, createdAt: Option[DateTime], message: String, categories: Option[String])
  /** GetResult implicit for fetching ContactTemporariesRow objects using plain SQL queries */
  implicit def GetResultContactTemporariesRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[Option[DateTime]], e3: GR[String], e4: GR[Option[String]]): GR[ContactTemporariesRow] = GR{
    prs => import prs._
    ContactTemporariesRow.tupled((<<?[Int], <<[Int], <<[Int], <<[Int], <<[Option[DateTime]], <<[String], <<?[String]))
  }
  /** Table description of table contact_temporaries. Objects of this class serve as prototypes for rows in queries. */
  class ContactTemporaries(_tableTag: Tag) extends profile.api.Table[ContactTemporariesRow](_tableTag, "contact_temporaries") {
    def * = (Rep.Some(id), senderProjectId, senderUserId, receiverProjectId, createdAt, message, categories) <> (ContactTemporariesRow.tupled, ContactTemporariesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(senderProjectId), Rep.Some(senderUserId), Rep.Some(receiverProjectId), Rep.Some(createdAt), Rep.Some(message), categories).shaped.<>({r=>import r._; _1.map(_=> ContactTemporariesRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column sender_project_id SqlType(INT) */
    val senderProjectId: Rep[Int] = column[Int]("sender_project_id")
    /** Database column sender_user_id SqlType(INT) */
    val senderUserId: Rep[Int] = column[Int]("sender_user_id")
    /** Database column receiver_project_id SqlType(INT) */
    val receiverProjectId: Rep[Int] = column[Int]("receiver_project_id")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column message SqlType(TEXT), Length(65535,true) */
    val message: Rep[String] = column[String]("message", O.Length(65535,varying=true))
    /** Database column categories SqlType(VARCHAR), Length(100,true) */
    val categories: Rep[Option[String]] = column[Option[String]]("categories", O.Length(100,varying=true))

    /** Foreign key referencing CompanyUsers (database name contact_temporaries_ibfk_2) */
    lazy val companyUsersFk = foreignKey("contact_temporaries_ibfk_2", senderUserId, CompanyUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Projects (database name contact_temporaries_ibfk_1) */
    lazy val projectsFk2 = foreignKey("contact_temporaries_ibfk_1", senderProjectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Projects (database name contact_temporaries_ibfk_3) */
    lazy val projectsFk3 = foreignKey("contact_temporaries_ibfk_3", receiverProjectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ContactTemporaries */
  lazy val ContactTemporaries = new TableQuery(tag => new ContactTemporaries(tag))

  /** Entity class storing rows of table ContactTickets
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param projectId Database column project_id SqlType(INT)
   *  @param startOn Database column start_on SqlType(DATE)
   *  @param endOn Database column end_on SqlType(DATE) */
  final case class ContactTicketsRow(id: Option[Int] = None, projectId: Int, startOn: LocalDate, endOn: LocalDate)
  /** GetResult implicit for fetching ContactTicketsRow objects using plain SQL queries */
  implicit def GetResultContactTicketsRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[LocalDate]): GR[ContactTicketsRow] = GR{
    prs => import prs._
    ContactTicketsRow.tupled((<<?[Int], <<[Int], <<[LocalDate], <<[LocalDate]))
  }
  /** Table description of table contact_tickets. Objects of this class serve as prototypes for rows in queries. */
  class ContactTickets(_tableTag: Tag) extends profile.api.Table[ContactTicketsRow](_tableTag, "contact_tickets") {
    def * = (Rep.Some(id), projectId, startOn, endOn) <> (ContactTicketsRow.tupled, ContactTicketsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(projectId), Rep.Some(startOn), Rep.Some(endOn)).shaped.<>({r=>import r._; _1.map(_=> ContactTicketsRow.tupled((_1, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column start_on SqlType(DATE) */
    val startOn: Rep[LocalDate] = column[LocalDate]("start_on")
    /** Database column end_on SqlType(DATE) */
    val endOn: Rep[LocalDate] = column[LocalDate]("end_on")

    /** Foreign key referencing Projects (database name contact_tickets_ibfk_1) */
    lazy val projectsFk = foreignKey("contact_tickets_ibfk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ContactTickets */
  lazy val ContactTickets = new TableQuery(tag => new ContactTickets(tag))

  /** Entity class storing rows of table DelayedJobs
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param priority Database column priority SqlType(INT), Default(0)
   *  @param attempts Database column attempts SqlType(INT), Default(0)
   *  @param handler Database column handler SqlType(TEXT), Length(65535,true)
   *  @param lastError Database column last_error SqlType(TEXT), Length(65535,true)
   *  @param runAt Database column run_at SqlType(DATETIME)
   *  @param lockedAt Database column locked_at SqlType(DATETIME)
   *  @param failedAt Database column failed_at SqlType(DATETIME)
   *  @param lockedBy Database column locked_by SqlType(VARCHAR), Length(255,true)
   *  @param queue Database column queue SqlType(VARCHAR), Length(255,true)
   *  @param createdAt Database column created_at SqlType(DATETIME)
   *  @param updatedAt Database column updated_at SqlType(DATETIME) */
  final case class DelayedJobsRow(id: Option[Int] = None, priority: Int = 0, attempts: Int = 0, handler: String, lastError: Option[String], runAt: Option[DateTime], lockedAt: Option[DateTime], failedAt: Option[DateTime], lockedBy: Option[String], queue: Option[String], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching DelayedJobsRow objects using plain SQL queries */
  implicit def GetResultDelayedJobsRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[DateTime]]): GR[DelayedJobsRow] = GR{
    prs => import prs._
    DelayedJobsRow.tupled((<<?[Int], <<[Int], <<[Int], <<[String], <<?[String], <<?[DateTime], <<?[DateTime], <<?[DateTime], <<?[String], <<?[String], <<?[DateTime], <<?[DateTime]))
  }
  /** Table description of table delayed_jobs. Objects of this class serve as prototypes for rows in queries. */
  class DelayedJobs(_tableTag: Tag) extends profile.api.Table[DelayedJobsRow](_tableTag, "delayed_jobs") {
    def * = (Rep.Some(id), priority, attempts, handler, lastError, runAt, lockedAt, failedAt, lockedBy, queue, createdAt, updatedAt) <> (DelayedJobsRow.tupled, DelayedJobsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(priority), Rep.Some(attempts), Rep.Some(handler), lastError, runAt, lockedAt, failedAt, lockedBy, queue, createdAt, updatedAt).shaped.<>({r=>import r._; _1.map(_=> DelayedJobsRow.tupled((_1, _2.get, _3.get, _4.get, _5, _6, _7, _8, _9, _10, _11, _12)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column priority SqlType(INT), Default(0) */
    val priority: Rep[Int] = column[Int]("priority", O.Default(0))
    /** Database column attempts SqlType(INT), Default(0) */
    val attempts: Rep[Int] = column[Int]("attempts", O.Default(0))
    /** Database column handler SqlType(TEXT), Length(65535,true) */
    val handler: Rep[String] = column[String]("handler", O.Length(65535,varying=true))
    /** Database column last_error SqlType(TEXT), Length(65535,true) */
    val lastError: Rep[Option[String]] = column[Option[String]]("last_error", O.Length(65535,varying=true))
    /** Database column run_at SqlType(DATETIME) */
    val runAt: Rep[Option[DateTime]] = column[Option[DateTime]]("run_at")
    /** Database column locked_at SqlType(DATETIME) */
    val lockedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("locked_at")
    /** Database column failed_at SqlType(DATETIME) */
    val failedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("failed_at")
    /** Database column locked_by SqlType(VARCHAR), Length(255,true) */
    val lockedBy: Rep[Option[String]] = column[Option[String]]("locked_by", O.Length(255,varying=true))
    /** Database column queue SqlType(VARCHAR), Length(255,true) */
    val queue: Rep[Option[String]] = column[Option[String]]("queue", O.Length(255,varying=true))
    /** Database column created_at SqlType(DATETIME) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(DATETIME) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Index over (priority,runAt) (database name delayed_jobs_priority) */
    val index1 = index("delayed_jobs_priority", (priority, runAt))
  }
  /** Collection-like TableQuery object for table DelayedJobs */
  lazy val DelayedJobs = new TableQuery(tag => new DelayedJobs(tag))

  /** Entity class storing rows of table Enquete
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param companyName Database column company_name SqlType(VARCHAR), Length(200,true)
   *  @param companyType Database column company_type SqlType(VARCHAR), Length(10,true)
   *  @param chargeName Database column charge_name SqlType(VARCHAR), Length(100,true)
   *  @param chargeMailAddress Database column charge_mail_address SqlType(VARCHAR), Length(100,true)
   *  @param freeComment Database column free_comment SqlType(TEXT), Length(65535,true)
   *  @param q1 Database column q1 SqlType(VARCHAR), Length(50,true)
   *  @param q2 Database column q2 SqlType(VARCHAR), Length(50,true)
   *  @param q3 Database column q3 SqlType(VARCHAR), Length(50,true)
   *  @param q4 Database column q4 SqlType(VARCHAR), Length(50,true)
   *  @param q5 Database column q5 SqlType(VARCHAR), Length(50,true)
   *  @param tel Database column tel SqlType(VARCHAR), Length(20,true)
   *  @param created Database column created SqlType(DATETIME) */
  final case class EnqueteRow(id: Option[Int] = None, companyName: String, companyType: String, chargeName: String, chargeMailAddress: String, freeComment: Option[String], q1: Option[String], q2: Option[String], q3: Option[String], q4: Option[String], q5: Option[String], tel: Option[String], created: DateTime)
  /** GetResult implicit for fetching EnqueteRow objects using plain SQL queries */
  implicit def GetResultEnqueteRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[String]], e3: GR[DateTime]): GR[EnqueteRow] = GR{
    prs => import prs._
    EnqueteRow.tupled((<<?[Int], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[DateTime]))
  }
  /** Table description of table enquete. Objects of this class serve as prototypes for rows in queries. */
  class Enquete(_tableTag: Tag) extends profile.api.Table[EnqueteRow](_tableTag, "enquete") {
    def * = (Rep.Some(id), companyName, companyType, chargeName, chargeMailAddress, freeComment, q1, q2, q3, q4, q5, tel, created) <> (EnqueteRow.tupled, EnqueteRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(companyName), Rep.Some(companyType), Rep.Some(chargeName), Rep.Some(chargeMailAddress), freeComment, q1, q2, q3, q4, q5, tel, Rep.Some(created)).shaped.<>({r=>import r._; _1.map(_=> EnqueteRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6, _7, _8, _9, _10, _11, _12, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column company_name SqlType(VARCHAR), Length(200,true) */
    val companyName: Rep[String] = column[String]("company_name", O.Length(200,varying=true))
    /** Database column company_type SqlType(VARCHAR), Length(10,true) */
    val companyType: Rep[String] = column[String]("company_type", O.Length(10,varying=true))
    /** Database column charge_name SqlType(VARCHAR), Length(100,true) */
    val chargeName: Rep[String] = column[String]("charge_name", O.Length(100,varying=true))
    /** Database column charge_mail_address SqlType(VARCHAR), Length(100,true) */
    val chargeMailAddress: Rep[String] = column[String]("charge_mail_address", O.Length(100,varying=true))
    /** Database column free_comment SqlType(TEXT), Length(65535,true) */
    val freeComment: Rep[Option[String]] = column[Option[String]]("free_comment", O.Length(65535,varying=true))
    /** Database column q1 SqlType(VARCHAR), Length(50,true) */
    val q1: Rep[Option[String]] = column[Option[String]]("q1", O.Length(50,varying=true))
    /** Database column q2 SqlType(VARCHAR), Length(50,true) */
    val q2: Rep[Option[String]] = column[Option[String]]("q2", O.Length(50,varying=true))
    /** Database column q3 SqlType(VARCHAR), Length(50,true) */
    val q3: Rep[Option[String]] = column[Option[String]]("q3", O.Length(50,varying=true))
    /** Database column q4 SqlType(VARCHAR), Length(50,true) */
    val q4: Rep[Option[String]] = column[Option[String]]("q4", O.Length(50,varying=true))
    /** Database column q5 SqlType(VARCHAR), Length(50,true) */
    val q5: Rep[Option[String]] = column[Option[String]]("q5", O.Length(50,varying=true))
    /** Database column tel SqlType(VARCHAR), Length(20,true) */
    val tel: Rep[Option[String]] = column[Option[String]]("tel", O.Length(20,varying=true))
    /** Database column created SqlType(DATETIME) */
    val created: Rep[DateTime] = column[DateTime]("created")
  }
  /** Collection-like TableQuery object for table Enquete */
  lazy val Enquete = new TableQuery(tag => new Enquete(tag))

  /** Entity class storing rows of table Event
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(100,true)
   *  @param date Database column date SqlType(TIMESTAMP)
   *  @param location Database column location SqlType(VARCHAR), Length(100,true)
   *  @param logo Database column logo SqlType(VARCHAR), Length(300,true)
   *  @param kind Database column kind SqlType(VARCHAR), Length(10,true)
   *  @param priority Database column priority SqlType(INT)
   *  @param created Database column created SqlType(TIMESTAMP)
   *  @param url Database column url SqlType(VARCHAR), Length(200,true)
   *  @param pickup Database column pickup SqlType(BIT) */
  final case class EventRow(id: Option[Int] = None, name: String, date: Option[DateTime], location: String, logo: String, kind: String, priority: Int, created: Option[DateTime], url: String, pickup: Boolean)
  /** GetResult implicit for fetching EventRow objects using plain SQL queries */
  implicit def GetResultEventRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[DateTime]], e3: GR[Int], e4: GR[Boolean]): GR[EventRow] = GR{
    prs => import prs._
    EventRow.tupled((<<?[Int], <<[String], <<[Option[DateTime]], <<[String], <<[String], <<[String], <<[Int], <<[Option[DateTime]], <<[String], <<[Boolean]))
  }
  /** Table description of table event. Objects of this class serve as prototypes for rows in queries. */
  class Event(_tableTag: Tag) extends profile.api.Table[EventRow](_tableTag, "event") {
    def * = (Rep.Some(id), name, date, location, logo, kind, priority, created, url, pickup) <> (EventRow.tupled, EventRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name), Rep.Some(date), Rep.Some(location), Rep.Some(logo), Rep.Some(kind), Rep.Some(priority), Rep.Some(created), Rep.Some(url), Rep.Some(pickup)).shaped.<>({r=>import r._; _1.map(_=> EventRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(100,true) */
    val name: Rep[String] = column[String]("name", O.Length(100,varying=true))
    /** Database column date SqlType(TIMESTAMP) */
    val date: Rep[Option[DateTime]] = column[Option[DateTime]]("date")
    /** Database column location SqlType(VARCHAR), Length(100,true) */
    val location: Rep[String] = column[String]("location", O.Length(100,varying=true))
    /** Database column logo SqlType(VARCHAR), Length(300,true) */
    val logo: Rep[String] = column[String]("logo", O.Length(300,varying=true))
    /** Database column kind SqlType(VARCHAR), Length(10,true) */
    val kind: Rep[String] = column[String]("kind", O.Length(10,varying=true))
    /** Database column priority SqlType(INT) */
    val priority: Rep[Int] = column[Int]("priority")
    /** Database column created SqlType(TIMESTAMP) */
    val created: Rep[Option[DateTime]] = column[Option[DateTime]]("created")
    /** Database column url SqlType(VARCHAR), Length(200,true) */
    val url: Rep[String] = column[String]("url", O.Length(200,varying=true))
    /** Database column pickup SqlType(BIT) */
    val pickup: Rep[Boolean] = column[Boolean]("pickup")
  }
  /** Collection-like TableQuery object for table Event */
  lazy val Event = new TableQuery(tag => new Event(tag))

  /** Row type of table Example */
  type ExampleRow = HCons[Option[Int],HCons[String,HCons[Option[Int],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[Int],HCons[Option[Int],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HCons[Option[String],HNil]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for ExampleRow providing default values if available in the database schema. */
  def ExampleRow(id: Option[Int] = None, createdBy: String, fromRibbonId: Option[Int], fromCompanyName: Option[String], fromUrl: Option[String], fromIndustry: Option[String], fromCountry: Option[String], toRibbonId: Option[Int], toCompanyName: Option[String], toUrl: Option[String], toIndustry: Option[String], toCountry: Option[String], startYear: Option[Int], endYear: Option[Int], period: Option[String], outputType: Option[String], innovationType: Option[String], why: Option[String], how: Option[String], what: Option[String], result: Option[String], scale: Option[String], freeComment: Option[String], url: Option[String]): ExampleRow = {
    id :: createdBy :: fromRibbonId :: fromCompanyName :: fromUrl :: fromIndustry :: fromCountry :: toRibbonId :: toCompanyName :: toUrl :: toIndustry :: toCountry :: startYear :: endYear :: period :: outputType :: innovationType :: why :: how :: what :: result :: scale :: freeComment :: url :: HNil
  }
  /** GetResult implicit for fetching ExampleRow objects using plain SQL queries */
  implicit def GetResultExampleRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[String]]): GR[ExampleRow] = GR{
    prs => import prs._
    <<?[Int] :: <<[String] :: <<?[Int] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[Int] :: <<?[Int] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: <<?[String] :: HNil
  }
  /** Table description of table example. Objects of this class serve as prototypes for rows in queries. */
  class Example(_tableTag: Tag) extends profile.api.Table[ExampleRow](_tableTag, "example") {
    def * = Rep.Some(id) :: createdBy :: fromRibbonId :: fromCompanyName :: fromUrl :: fromIndustry :: fromCountry :: toRibbonId :: toCompanyName :: toUrl :: toIndustry :: toCountry :: startYear :: endYear :: period :: outputType :: innovationType :: why :: how :: what :: result :: scale :: freeComment :: url :: HNil

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column created_by SqlType(VARCHAR), Length(20,true) */
    val createdBy: Rep[String] = column[String]("created_by", O.Length(20,varying=true))
    /** Database column from_ribbon_id SqlType(INT) */
    val fromRibbonId: Rep[Option[Int]] = column[Option[Int]]("from_ribbon_id")
    /** Database column from_company_name SqlType(VARCHAR), Length(100,true) */
    val fromCompanyName: Rep[Option[String]] = column[Option[String]]("from_company_name", O.Length(100,varying=true))
    /** Database column from_url SqlType(VARCHAR), Length(200,true) */
    val fromUrl: Rep[Option[String]] = column[Option[String]]("from_url", O.Length(200,varying=true))
    /** Database column from_industry SqlType(VARCHAR), Length(100,true) */
    val fromIndustry: Rep[Option[String]] = column[Option[String]]("from_industry", O.Length(100,varying=true))
    /** Database column from_country SqlType(VARCHAR), Length(30,true) */
    val fromCountry: Rep[Option[String]] = column[Option[String]]("from_country", O.Length(30,varying=true))
    /** Database column to_ribbon_id SqlType(INT) */
    val toRibbonId: Rep[Option[Int]] = column[Option[Int]]("to_ribbon_id")
    /** Database column to_company_name SqlType(VARCHAR), Length(100,true) */
    val toCompanyName: Rep[Option[String]] = column[Option[String]]("to_company_name", O.Length(100,varying=true))
    /** Database column to_url SqlType(VARCHAR), Length(200,true) */
    val toUrl: Rep[Option[String]] = column[Option[String]]("to_url", O.Length(200,varying=true))
    /** Database column to_industry SqlType(VARCHAR), Length(100,true) */
    val toIndustry: Rep[Option[String]] = column[Option[String]]("to_industry", O.Length(100,varying=true))
    /** Database column to_country SqlType(VARCHAR), Length(30,true) */
    val toCountry: Rep[Option[String]] = column[Option[String]]("to_country", O.Length(30,varying=true))
    /** Database column start_year SqlType(INT) */
    val startYear: Rep[Option[Int]] = column[Option[Int]]("start_year")
    /** Database column end_year SqlType(INT) */
    val endYear: Rep[Option[Int]] = column[Option[Int]]("end_year")
    /** Database column period SqlType(VARCHAR), Length(20,true) */
    val period: Rep[Option[String]] = column[Option[String]]("period", O.Length(20,varying=true))
    /** Database column output_type SqlType(VARCHAR), Length(50,true) */
    val outputType: Rep[Option[String]] = column[Option[String]]("output_type", O.Length(50,varying=true))
    /** Database column innovation_type SqlType(VARCHAR), Length(50,true) */
    val innovationType: Rep[Option[String]] = column[Option[String]]("innovation_type", O.Length(50,varying=true))
    /** Database column why SqlType(VARCHAR), Length(100,true) */
    val why: Rep[Option[String]] = column[Option[String]]("why", O.Length(100,varying=true))
    /** Database column how SqlType(VARCHAR), Length(100,true) */
    val how: Rep[Option[String]] = column[Option[String]]("how", O.Length(100,varying=true))
    /** Database column what SqlType(VARCHAR), Length(100,true) */
    val what: Rep[Option[String]] = column[Option[String]]("what", O.Length(100,varying=true))
    /** Database column result SqlType(VARCHAR), Length(200,true) */
    val result: Rep[Option[String]] = column[Option[String]]("result", O.Length(200,varying=true))
    /** Database column scale SqlType(VARCHAR), Length(100,true) */
    val scale: Rep[Option[String]] = column[Option[String]]("scale", O.Length(100,varying=true))
    /** Database column free_comment SqlType(TEXT), Length(65535,true) */
    val freeComment: Rep[Option[String]] = column[Option[String]]("free_comment", O.Length(65535,varying=true))
    /** Database column url SqlType(VARCHAR), Length(300,true) */
    val url: Rep[Option[String]] = column[Option[String]]("url", O.Length(300,varying=true))
  }
  /** Collection-like TableQuery object for table Example */
  lazy val Example = new TableQuery(tag => new Example(tag))

  /** Entity class storing rows of table FacebookUsers
   *  @param facebookId Database column facebook_id SqlType(BIGINT), PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(50,true)
   *  @param mailAddress Database column mail_address SqlType(VARCHAR), Length(100,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP) */
  final case class FacebookUsersRow(facebookId: Long, name: String, mailAddress: Option[String], createdAt: Option[DateTime])
  /** GetResult implicit for fetching FacebookUsersRow objects using plain SQL queries */
  implicit def GetResultFacebookUsersRow(implicit e0: GR[Long], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[DateTime]]): GR[FacebookUsersRow] = GR{
    prs => import prs._
    FacebookUsersRow.tupled((<<[Long], <<[String], <<?[String], <<[Option[DateTime]]))
  }
  /** Table description of table facebook_users. Objects of this class serve as prototypes for rows in queries. */
  class FacebookUsers(_tableTag: Tag) extends profile.api.Table[FacebookUsersRow](_tableTag, "facebook_users") {
    def * = (facebookId, name, mailAddress, createdAt) <> (FacebookUsersRow.tupled, FacebookUsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(facebookId), Rep.Some(name), mailAddress, Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> FacebookUsersRow.tupled((_1.get, _2.get, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column facebook_id SqlType(BIGINT), PrimaryKey */
    val facebookId: Rep[Long] = column[Long]("facebook_id", O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(50,true) */
    val name: Rep[String] = column[String]("name", O.Length(50,varying=true))
    /** Database column mail_address SqlType(VARCHAR), Length(100,true) */
    val mailAddress: Rep[Option[String]] = column[Option[String]]("mail_address", O.Length(100,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
  }
  /** Collection-like TableQuery object for table FacebookUsers */
  lazy val FacebookUsers = new TableQuery(tag => new FacebookUsers(tag))

  /** Entity class storing rows of table Favorites
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param projectId Database column project_id SqlType(INT)
   *  @param favoriteProjectId Database column favorite_project_id SqlType(INT)
   *  @param memo Database column memo SqlType(TEXT), Length(65535,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP) */
  final case class FavoritesRow(id: Option[Int] = None, projectId: Int, favoriteProjectId: Int, memo: Option[String], createdAt: Option[DateTime])
  /** GetResult implicit for fetching FavoritesRow objects using plain SQL queries */
  implicit def GetResultFavoritesRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[Option[String]], e3: GR[Option[DateTime]]): GR[FavoritesRow] = GR{
    prs => import prs._
    FavoritesRow.tupled((<<?[Int], <<[Int], <<[Int], <<?[String], <<[Option[DateTime]]))
  }
  /** Table description of table favorites. Objects of this class serve as prototypes for rows in queries. */
  class Favorites(_tableTag: Tag) extends profile.api.Table[FavoritesRow](_tableTag, "favorites") {
    def * = (Rep.Some(id), projectId, favoriteProjectId, memo, createdAt) <> (FavoritesRow.tupled, FavoritesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(projectId), Rep.Some(favoriteProjectId), memo, Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> FavoritesRow.tupled((_1, _2.get, _3.get, _4, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column favorite_project_id SqlType(INT) */
    val favoriteProjectId: Rep[Int] = column[Int]("favorite_project_id")
    /** Database column memo SqlType(TEXT), Length(65535,true) */
    val memo: Rep[Option[String]] = column[Option[String]]("memo", O.Length(65535,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
  }
  /** Collection-like TableQuery object for table Favorites */
  lazy val Favorites = new TableQuery(tag => new Favorites(tag))

  /** Entity class storing rows of table FreePrUpdateRequest
   *  @param companyId Database column company_id SqlType(INT), PrimaryKey
   *  @param logo Database column logo SqlType(VARCHAR), Length(200,true)
   *  @param title Database column title SqlType(TEXT), Length(65535,true)
   *  @param businessDescrption Database column business_descrption SqlType(TEXT), Length(65535,true)
   *  @param goal Database column goal SqlType(TEXT), Length(65535,true)
   *  @param message Database column message SqlType(TEXT), Length(65535,true)
   *  @param image1 Database column image1 SqlType(VARCHAR), Length(200,true)
   *  @param imageText1 Database column image_text1 SqlType(VARCHAR), Length(50,true)
   *  @param image2 Database column image2 SqlType(VARCHAR), Length(200,true)
   *  @param imageText2 Database column image_text2 SqlType(VARCHAR), Length(50,true)
   *  @param image3 Database column image3 SqlType(VARCHAR), Length(200,true)
   *  @param imageText3 Database column image_text3 SqlType(VARCHAR), Length(50,true)
   *  @param status Database column status SqlType(VARCHAR), Length(10,true)
   *  @param created Database column created SqlType(TIMESTAMP) */
  final case class FreePrUpdateRequestRow(companyId: Int, logo: Option[String], title: Option[String], businessDescrption: Option[String], goal: Option[String], message: Option[String], image1: Option[String], imageText1: Option[String], image2: Option[String], imageText2: Option[String], image3: Option[String], imageText3: Option[String], status: String, created: Option[DateTime])
  /** GetResult implicit for fetching FreePrUpdateRequestRow objects using plain SQL queries */
  implicit def GetResultFreePrUpdateRequestRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[DateTime]]): GR[FreePrUpdateRequestRow] = GR{
    prs => import prs._
    FreePrUpdateRequestRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[String], <<[Option[DateTime]]))
  }
  /** Table description of table free_pr_update_request. Objects of this class serve as prototypes for rows in queries. */
  class FreePrUpdateRequest(_tableTag: Tag) extends profile.api.Table[FreePrUpdateRequestRow](_tableTag, "free_pr_update_request") {
    def * = (companyId, logo, title, businessDescrption, goal, message, image1, imageText1, image2, imageText2, image3, imageText3, status, created) <> (FreePrUpdateRequestRow.tupled, FreePrUpdateRequestRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(companyId), logo, title, businessDescrption, goal, message, image1, imageText1, image2, imageText2, image3, imageText3, Rep.Some(status), Rep.Some(created)).shaped.<>({r=>import r._; _1.map(_=> FreePrUpdateRequestRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13.get, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_id SqlType(INT), PrimaryKey */
    val companyId: Rep[Int] = column[Int]("company_id", O.PrimaryKey)
    /** Database column logo SqlType(VARCHAR), Length(200,true) */
    val logo: Rep[Option[String]] = column[Option[String]]("logo", O.Length(200,varying=true))
    /** Database column title SqlType(TEXT), Length(65535,true) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Length(65535,varying=true))
    /** Database column business_descrption SqlType(TEXT), Length(65535,true) */
    val businessDescrption: Rep[Option[String]] = column[Option[String]]("business_descrption", O.Length(65535,varying=true))
    /** Database column goal SqlType(TEXT), Length(65535,true) */
    val goal: Rep[Option[String]] = column[Option[String]]("goal", O.Length(65535,varying=true))
    /** Database column message SqlType(TEXT), Length(65535,true) */
    val message: Rep[Option[String]] = column[Option[String]]("message", O.Length(65535,varying=true))
    /** Database column image1 SqlType(VARCHAR), Length(200,true) */
    val image1: Rep[Option[String]] = column[Option[String]]("image1", O.Length(200,varying=true))
    /** Database column image_text1 SqlType(VARCHAR), Length(50,true) */
    val imageText1: Rep[Option[String]] = column[Option[String]]("image_text1", O.Length(50,varying=true))
    /** Database column image2 SqlType(VARCHAR), Length(200,true) */
    val image2: Rep[Option[String]] = column[Option[String]]("image2", O.Length(200,varying=true))
    /** Database column image_text2 SqlType(VARCHAR), Length(50,true) */
    val imageText2: Rep[Option[String]] = column[Option[String]]("image_text2", O.Length(50,varying=true))
    /** Database column image3 SqlType(VARCHAR), Length(200,true) */
    val image3: Rep[Option[String]] = column[Option[String]]("image3", O.Length(200,varying=true))
    /** Database column image_text3 SqlType(VARCHAR), Length(50,true) */
    val imageText3: Rep[Option[String]] = column[Option[String]]("image_text3", O.Length(50,varying=true))
    /** Database column status SqlType(VARCHAR), Length(10,true) */
    val status: Rep[String] = column[String]("status", O.Length(10,varying=true))
    /** Database column created SqlType(TIMESTAMP) */
    val created: Rep[Option[DateTime]] = column[Option[DateTime]]("created")

    /** Foreign key referencing Companies (database name free_pr_update_request_ibfk_1) */
    lazy val companiesFk = foreignKey("free_pr_update_request_ibfk_1", companyId, Companies)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table FreePrUpdateRequest */
  lazy val FreePrUpdateRequest = new TableQuery(tag => new FreePrUpdateRequest(tag))

  /** Entity class storing rows of table Interviews
   *  @param body Database column body SqlType(TEXT), Length(65535,true)
   *  @param projectId Database column project_id SqlType(INT) */
  final case class InterviewsRow(body: String, projectId: Option[Int])
  /** GetResult implicit for fetching InterviewsRow objects using plain SQL queries */
  implicit def GetResultInterviewsRow(implicit e0: GR[String], e1: GR[Option[Int]]): GR[InterviewsRow] = GR{
    prs => import prs._
    InterviewsRow.tupled((<<[String], <<?[Int]))
  }
  /** Table description of table interviews. Objects of this class serve as prototypes for rows in queries. */
  class Interviews(_tableTag: Tag) extends profile.api.Table[InterviewsRow](_tableTag, "interviews") {
    def * = (body, projectId) <> (InterviewsRow.tupled, InterviewsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(body), projectId).shaped.<>({r=>import r._; _1.map(_=> InterviewsRow.tupled((_1.get, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column body SqlType(TEXT), Length(65535,true) */
    val body: Rep[String] = column[String]("body", O.Length(65535,varying=true))
    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Option[Int]] = column[Option[Int]]("project_id")

    /** Foreign key referencing Projects (database name interviews_ibfk_1) */
    lazy val projectsFk = foreignKey("interviews_ibfk_1", projectId, Projects)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Interviews */
  lazy val Interviews = new TableQuery(tag => new Interviews(tag))

  /** Entity class storing rows of table Jgoodtech
   *  @param jgoodtechId Database column jgoodtech_id SqlType(INT), PrimaryKey
   *  @param agentId Database column agent_id SqlType(INT)
   *  @param companyId Database column company_id SqlType(INT) */
  final case class JgoodtechRow(jgoodtechId: Int, agentId: Option[Int], companyId: Option[Int])
  /** GetResult implicit for fetching JgoodtechRow objects using plain SQL queries */
  implicit def GetResultJgoodtechRow(implicit e0: GR[Int], e1: GR[Option[Int]]): GR[JgoodtechRow] = GR{
    prs => import prs._
    JgoodtechRow.tupled((<<[Int], <<?[Int], <<?[Int]))
  }
  /** Table description of table jgoodtech. Objects of this class serve as prototypes for rows in queries. */
  class Jgoodtech(_tableTag: Tag) extends profile.api.Table[JgoodtechRow](_tableTag, "jgoodtech") {
    def * = (jgoodtechId, agentId, companyId) <> (JgoodtechRow.tupled, JgoodtechRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(jgoodtechId), agentId, companyId).shaped.<>({r=>import r._; _1.map(_=> JgoodtechRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column jgoodtech_id SqlType(INT), PrimaryKey */
    val jgoodtechId: Rep[Int] = column[Int]("jgoodtech_id", O.PrimaryKey)
    /** Database column agent_id SqlType(INT) */
    val agentId: Rep[Option[Int]] = column[Option[Int]]("agent_id")
    /** Database column company_id SqlType(INT) */
    val companyId: Rep[Option[Int]] = column[Option[Int]]("company_id")
  }
  /** Collection-like TableQuery object for table Jgoodtech */
  lazy val Jgoodtech = new TableQuery(tag => new Jgoodtech(tag))

  /** Entity class storing rows of table Jobs
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param template Database column template SqlType(TEXT), Length(65535,true)
   *  @param subject Database column subject SqlType(VARCHAR), Length(200,true)
   *  @param status Database column status SqlType(VARCHAR), Length(10,true)
   *  @param successCount Database column success_count SqlType(INT)
   *  @param errorCount Database column error_count SqlType(INT)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class JobsRow(id: Option[Int] = None, template: String, subject: String, status: String, successCount: Int, errorCount: Int, createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching JobsRow objects using plain SQL queries */
  implicit def GetResultJobsRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Int], e3: GR[Option[DateTime]]): GR[JobsRow] = GR{
    prs => import prs._
    JobsRow.tupled((<<?[Int], <<[String], <<[String], <<[String], <<[Int], <<[Int], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table jobs. Objects of this class serve as prototypes for rows in queries. */
  class Jobs(_tableTag: Tag) extends profile.api.Table[JobsRow](_tableTag, "jobs") {
    def * = (Rep.Some(id), template, subject, status, successCount, errorCount, createdAt, updatedAt) <> (JobsRow.tupled, JobsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(template), Rep.Some(subject), Rep.Some(status), Rep.Some(successCount), Rep.Some(errorCount), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> JobsRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column template SqlType(TEXT), Length(65535,true) */
    val template: Rep[String] = column[String]("template", O.Length(65535,varying=true))
    /** Database column subject SqlType(VARCHAR), Length(200,true) */
    val subject: Rep[String] = column[String]("subject", O.Length(200,varying=true))
    /** Database column status SqlType(VARCHAR), Length(10,true) */
    val status: Rep[String] = column[String]("status", O.Length(10,varying=true))
    /** Database column success_count SqlType(INT) */
    val successCount: Rep[Int] = column[Int]("success_count")
    /** Database column error_count SqlType(INT) */
    val errorCount: Rep[Int] = column[Int]("error_count")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table Jobs */
  lazy val Jobs = new TableQuery(tag => new Jobs(tag))

  /** Entity class storing rows of table KeyPersonRejectReason
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param companyId Database column company_id SqlType(INT)
   *  @param memo Database column memo SqlType(TEXT), Length(65535,true)
   *  @param created Database column created SqlType(TIMESTAMP) */
  final case class KeyPersonRejectReasonRow(id: Option[Int] = None, companyId: Int, memo: Option[String], created: Option[DateTime])
  /** GetResult implicit for fetching KeyPersonRejectReasonRow objects using plain SQL queries */
  implicit def GetResultKeyPersonRejectReasonRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[Option[String]], e3: GR[Option[DateTime]]): GR[KeyPersonRejectReasonRow] = GR{
    prs => import prs._
    KeyPersonRejectReasonRow.tupled((<<?[Int], <<[Int], <<?[String], <<[Option[DateTime]]))
  }
  /** Table description of table key_person_reject_reason. Objects of this class serve as prototypes for rows in queries. */
  class KeyPersonRejectReason(_tableTag: Tag) extends profile.api.Table[KeyPersonRejectReasonRow](_tableTag, "key_person_reject_reason") {
    def * = (Rep.Some(id), companyId, memo, created) <> (KeyPersonRejectReasonRow.tupled, KeyPersonRejectReasonRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(companyId), memo, Rep.Some(created)).shaped.<>({r=>import r._; _1.map(_=> KeyPersonRejectReasonRow.tupled((_1, _2.get, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column company_id SqlType(INT) */
    val companyId: Rep[Int] = column[Int]("company_id")
    /** Database column memo SqlType(TEXT), Length(65535,true) */
    val memo: Rep[Option[String]] = column[Option[String]]("memo", O.Length(65535,varying=true))
    /** Database column created SqlType(TIMESTAMP) */
    val created: Rep[Option[DateTime]] = column[Option[DateTime]]("created")

    /** Foreign key referencing Companies (database name key_person_reject_reason_ibfk_1) */
    lazy val companiesFk = foreignKey("key_person_reject_reason_ibfk_1", companyId, Companies)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table KeyPersonRejectReason */
  lazy val KeyPersonRejectReason = new TableQuery(tag => new KeyPersonRejectReason(tag))

  /** Entity class storing rows of table KeyPersonUpdateRequest
   *  @param companyId Database column company_id SqlType(INT), PrimaryKey
   *  @param firstName Database column first_name SqlType(VARCHAR), Length(100,true)
   *  @param lastName Database column last_name SqlType(VARCHAR), Length(100,true)
   *  @param logo Database column logo SqlType(VARCHAR), Length(200,true)
   *  @param position Database column position SqlType(VARCHAR), Length(100,true)
   *  @param message Database column message SqlType(TEXT), Length(65535,true)
   *  @param department Database column department SqlType(VARCHAR), Length(100,true)
   *  @param departmentDescription Database column department_description SqlType(TEXT), Length(65535,true)
   *  @param mission Database column mission SqlType(TEXT), Length(65535,true)
   *  @param career Database column career SqlType(TEXT), Length(65535,true)
   *  @param status Database column status SqlType(VARCHAR), Length(10,true) */
  final case class KeyPersonUpdateRequestRow(companyId: Int, firstName: Option[String], lastName: Option[String], logo: Option[String], position: Option[String], message: Option[String], department: Option[String], departmentDescription: Option[String], mission: Option[String], career: Option[String], status: String)
  /** GetResult implicit for fetching KeyPersonUpdateRequestRow objects using plain SQL queries */
  implicit def GetResultKeyPersonUpdateRequestRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[String]): GR[KeyPersonUpdateRequestRow] = GR{
    prs => import prs._
    KeyPersonUpdateRequestRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[String]))
  }
  /** Table description of table key_person_update_request. Objects of this class serve as prototypes for rows in queries. */
  class KeyPersonUpdateRequest(_tableTag: Tag) extends profile.api.Table[KeyPersonUpdateRequestRow](_tableTag, "key_person_update_request") {
    def * = (companyId, firstName, lastName, logo, position, message, department, departmentDescription, mission, career, status) <> (KeyPersonUpdateRequestRow.tupled, KeyPersonUpdateRequestRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(companyId), firstName, lastName, logo, position, message, department, departmentDescription, mission, career, Rep.Some(status)).shaped.<>({r=>import r._; _1.map(_=> KeyPersonUpdateRequestRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_id SqlType(INT), PrimaryKey */
    val companyId: Rep[Int] = column[Int]("company_id", O.PrimaryKey)
    /** Database column first_name SqlType(VARCHAR), Length(100,true) */
    val firstName: Rep[Option[String]] = column[Option[String]]("first_name", O.Length(100,varying=true))
    /** Database column last_name SqlType(VARCHAR), Length(100,true) */
    val lastName: Rep[Option[String]] = column[Option[String]]("last_name", O.Length(100,varying=true))
    /** Database column logo SqlType(VARCHAR), Length(200,true) */
    val logo: Rep[Option[String]] = column[Option[String]]("logo", O.Length(200,varying=true))
    /** Database column position SqlType(VARCHAR), Length(100,true) */
    val position: Rep[Option[String]] = column[Option[String]]("position", O.Length(100,varying=true))
    /** Database column message SqlType(TEXT), Length(65535,true) */
    val message: Rep[Option[String]] = column[Option[String]]("message", O.Length(65535,varying=true))
    /** Database column department SqlType(VARCHAR), Length(100,true) */
    val department: Rep[Option[String]] = column[Option[String]]("department", O.Length(100,varying=true))
    /** Database column department_description SqlType(TEXT), Length(65535,true) */
    val departmentDescription: Rep[Option[String]] = column[Option[String]]("department_description", O.Length(65535,varying=true))
    /** Database column mission SqlType(TEXT), Length(65535,true) */
    val mission: Rep[Option[String]] = column[Option[String]]("mission", O.Length(65535,varying=true))
    /** Database column career SqlType(TEXT), Length(65535,true) */
    val career: Rep[Option[String]] = column[Option[String]]("career", O.Length(65535,varying=true))
    /** Database column status SqlType(VARCHAR), Length(10,true) */
    val status: Rep[String] = column[String]("status", O.Length(10,varying=true))

    /** Foreign key referencing Companies (database name key_person_update_request_ibfk_1) */
    lazy val companiesFk = foreignKey("key_person_update_request_ibfk_1", companyId, Companies)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table KeyPersonUpdateRequest */
  lazy val KeyPersonUpdateRequest = new TableQuery(tag => new KeyPersonUpdateRequest(tag))

  /** Entity class storing rows of table Laboratories
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param laboratoryGroupId Database column laboratory_group_id SqlType(INT)
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param thumb Database column thumb SqlType(VARCHAR), Length(255,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class LaboratoriesRow(id: Option[Int] = None, laboratoryGroupId: Int, name: String, thumb: Option[String], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching LaboratoriesRow objects using plain SQL queries */
  implicit def GetResultLaboratoriesRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[DateTime]]): GR[LaboratoriesRow] = GR{
    prs => import prs._
    LaboratoriesRow.tupled((<<?[Int], <<[Int], <<[String], <<?[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table laboratories. Objects of this class serve as prototypes for rows in queries. */
  class Laboratories(_tableTag: Tag) extends profile.api.Table[LaboratoriesRow](_tableTag, "laboratories") {
    def * = (Rep.Some(id), laboratoryGroupId, name, thumb, createdAt, updatedAt) <> (LaboratoriesRow.tupled, LaboratoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(laboratoryGroupId), Rep.Some(name), thumb, Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> LaboratoriesRow.tupled((_1, _2.get, _3.get, _4, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column laboratory_group_id SqlType(INT) */
    val laboratoryGroupId: Rep[Int] = column[Int]("laboratory_group_id")
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column thumb SqlType(VARCHAR), Length(255,true) */
    val thumb: Rep[Option[String]] = column[Option[String]]("thumb", O.Length(255,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Index over (laboratoryGroupId) (database name index_laboratories_on_laboratory_group_id) */
    val index1 = index("index_laboratories_on_laboratory_group_id", laboratoryGroupId)
  }
  /** Collection-like TableQuery object for table Laboratories */
  lazy val Laboratories = new TableQuery(tag => new Laboratories(tag))

  /** Entity class storing rows of table LaboratoryGroups
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param path Database column path SqlType(VARCHAR), Length(255,true)
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param shorten Database column shorten SqlType(VARCHAR), Length(255,true)
   *  @param explain Database column explain SqlType(TEXT), Length(65535,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class LaboratoryGroupsRow(id: Option[Int] = None, path: String, name: String, shorten: Option[String], explain: Option[String], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching LaboratoryGroupsRow objects using plain SQL queries */
  implicit def GetResultLaboratoryGroupsRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[DateTime]]): GR[LaboratoryGroupsRow] = GR{
    prs => import prs._
    LaboratoryGroupsRow.tupled((<<?[Int], <<[String], <<[String], <<?[String], <<?[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table laboratory_groups. Objects of this class serve as prototypes for rows in queries. */
  class LaboratoryGroups(_tableTag: Tag) extends profile.api.Table[LaboratoryGroupsRow](_tableTag, "laboratory_groups") {
    def * = (Rep.Some(id), path, name, shorten, explain, createdAt, updatedAt) <> (LaboratoryGroupsRow.tupled, LaboratoryGroupsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(path), Rep.Some(name), shorten, explain, Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> LaboratoryGroupsRow.tupled((_1, _2.get, _3.get, _4, _5, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column path SqlType(VARCHAR), Length(255,true) */
    val path: Rep[String] = column[String]("path", O.Length(255,varying=true))
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column shorten SqlType(VARCHAR), Length(255,true) */
    val shorten: Rep[Option[String]] = column[Option[String]]("shorten", O.Length(255,varying=true))
    /** Database column explain SqlType(TEXT), Length(65535,true) */
    val explain: Rep[Option[String]] = column[Option[String]]("explain", O.Length(65535,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table LaboratoryGroups */
  lazy val LaboratoryGroups = new TableQuery(tag => new LaboratoryGroups(tag))

  /** Entity class storing rows of table LaboratoryLaboratoryTags
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param laboratoryId Database column laboratory_id SqlType(INT)
   *  @param laboratoryTagId Database column laboratory_tag_id SqlType(INT) */
  final case class LaboratoryLaboratoryTagsRow(id: Option[Int] = None, laboratoryId: Option[Int], laboratoryTagId: Option[Int])
  /** GetResult implicit for fetching LaboratoryLaboratoryTagsRow objects using plain SQL queries */
  implicit def GetResultLaboratoryLaboratoryTagsRow(implicit e0: GR[Option[Int]]): GR[LaboratoryLaboratoryTagsRow] = GR{
    prs => import prs._
    LaboratoryLaboratoryTagsRow.tupled((<<?[Int], <<?[Int], <<?[Int]))
  }
  /** Table description of table laboratory_laboratory_tags. Objects of this class serve as prototypes for rows in queries. */
  class LaboratoryLaboratoryTags(_tableTag: Tag) extends profile.api.Table[LaboratoryLaboratoryTagsRow](_tableTag, "laboratory_laboratory_tags") {
    def * = (Rep.Some(id), laboratoryId, laboratoryTagId) <> (LaboratoryLaboratoryTagsRow.tupled, LaboratoryLaboratoryTagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), laboratoryId, laboratoryTagId).shaped.<>({r=>import r._; _1.map(_=> LaboratoryLaboratoryTagsRow.tupled((_1, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column laboratory_id SqlType(INT) */
    val laboratoryId: Rep[Option[Int]] = column[Option[Int]]("laboratory_id")
    /** Database column laboratory_tag_id SqlType(INT) */
    val laboratoryTagId: Rep[Option[Int]] = column[Option[Int]]("laboratory_tag_id")

    /** Uniqueness Index over (laboratoryId,laboratoryTagId) (database name laboratory_tag_m2m_index) */
    val index1 = index("laboratory_tag_m2m_index", (laboratoryId, laboratoryTagId), unique=true)
  }
  /** Collection-like TableQuery object for table LaboratoryLaboratoryTags */
  lazy val LaboratoryLaboratoryTags = new TableQuery(tag => new LaboratoryLaboratoryTags(tag))

  /** Entity class storing rows of table LaboratoryLinks
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param laboratoryId Database column laboratory_id SqlType(INT)
   *  @param link Database column link SqlType(VARCHAR), Length(255,true)
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param explain Database column explain SqlType(TEXT), Length(65535,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class LaboratoryLinksRow(id: Option[Int] = None, laboratoryId: Int, link: String, name: String, explain: Option[String], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching LaboratoryLinksRow objects using plain SQL queries */
  implicit def GetResultLaboratoryLinksRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[DateTime]]): GR[LaboratoryLinksRow] = GR{
    prs => import prs._
    LaboratoryLinksRow.tupled((<<?[Int], <<[Int], <<[String], <<[String], <<?[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table laboratory_links. Objects of this class serve as prototypes for rows in queries. */
  class LaboratoryLinks(_tableTag: Tag) extends profile.api.Table[LaboratoryLinksRow](_tableTag, "laboratory_links") {
    def * = (Rep.Some(id), laboratoryId, link, name, explain, createdAt, updatedAt) <> (LaboratoryLinksRow.tupled, LaboratoryLinksRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(laboratoryId), Rep.Some(link), Rep.Some(name), explain, Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> LaboratoryLinksRow.tupled((_1, _2.get, _3.get, _4.get, _5, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column laboratory_id SqlType(INT) */
    val laboratoryId: Rep[Int] = column[Int]("laboratory_id")
    /** Database column link SqlType(VARCHAR), Length(255,true) */
    val link: Rep[String] = column[String]("link", O.Length(255,varying=true))
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column explain SqlType(TEXT), Length(65535,true) */
    val explain: Rep[Option[String]] = column[Option[String]]("explain", O.Length(65535,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Index over (laboratoryId) (database name index_laboratory_links_on_laboratory_id) */
    val index1 = index("index_laboratory_links_on_laboratory_id", laboratoryId)
  }
  /** Collection-like TableQuery object for table LaboratoryLinks */
  lazy val LaboratoryLinks = new TableQuery(tag => new LaboratoryLinks(tag))

  /** Entity class storing rows of table LaboratoryTags
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param explain Database column explain SqlType(TEXT), Length(65535,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class LaboratoryTagsRow(id: Option[Int] = None, name: String, explain: Option[String], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching LaboratoryTagsRow objects using plain SQL queries */
  implicit def GetResultLaboratoryTagsRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[DateTime]]): GR[LaboratoryTagsRow] = GR{
    prs => import prs._
    LaboratoryTagsRow.tupled((<<?[Int], <<[String], <<?[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table laboratory_tags. Objects of this class serve as prototypes for rows in queries. */
  class LaboratoryTags(_tableTag: Tag) extends profile.api.Table[LaboratoryTagsRow](_tableTag, "laboratory_tags") {
    def * = (Rep.Some(id), name, explain, createdAt, updatedAt) <> (LaboratoryTagsRow.tupled, LaboratoryTagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name), explain, Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> LaboratoryTagsRow.tupled((_1, _2.get, _3, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column explain SqlType(TEXT), Length(65535,true) */
    val explain: Rep[Option[String]] = column[Option[String]]("explain", O.Length(65535,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Uniqueness Index over (name) (database name index_laboratory_tags_on_name) */
    val index1 = index("index_laboratory_tags_on_name", name, unique=true)
  }
  /** Collection-like TableQuery object for table LaboratoryTags */
  lazy val LaboratoryTags = new TableQuery(tag => new LaboratoryTags(tag))

  /** Entity class storing rows of table LargeTags
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(127,true) */
  final case class LargeTagsRow(id: Option[Int] = None, name: String)
  /** GetResult implicit for fetching LargeTagsRow objects using plain SQL queries */
  implicit def GetResultLargeTagsRow(implicit e0: GR[Option[Int]], e1: GR[String]): GR[LargeTagsRow] = GR{
    prs => import prs._
    LargeTagsRow.tupled((<<?[Int], <<[String]))
  }
  /** Table description of table large_tags. Objects of this class serve as prototypes for rows in queries. */
  class LargeTags(_tableTag: Tag) extends profile.api.Table[LargeTagsRow](_tableTag, "large_tags") {
    def * = (Rep.Some(id), name) <> (LargeTagsRow.tupled, LargeTagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name)).shaped.<>({r=>import r._; _1.map(_=> LargeTagsRow.tupled((_1, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(127,true) */
    val name: Rep[String] = column[String]("name", O.Length(127,varying=true))

    /** Uniqueness Index over (name) (database name index_large_tags_name) */
    val index1 = index("index_large_tags_name", name, unique=true)
  }
  /** Collection-like TableQuery object for table LargeTags */
  lazy val LargeTags = new TableQuery(tag => new LargeTags(tag))

  /** Entity class storing rows of table MailActivates
   *  @param userId Database column user_id SqlType(INT), PrimaryKey
   *  @param activateKey Database column activate_key SqlType(VARCHAR), Length(100,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param activatedAt Database column activated_at SqlType(DATETIME)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class MailActivatesRow(userId: Int, activateKey: String, createdAt: Option[DateTime], activatedAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching MailActivatesRow objects using plain SQL queries */
  implicit def GetResultMailActivatesRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[DateTime]]): GR[MailActivatesRow] = GR{
    prs => import prs._
    MailActivatesRow.tupled((<<[Int], <<[String], <<[Option[DateTime]], <<?[DateTime], <<[Option[DateTime]]))
  }
  /** Table description of table mail_activates. Objects of this class serve as prototypes for rows in queries. */
  class MailActivates(_tableTag: Tag) extends profile.api.Table[MailActivatesRow](_tableTag, "mail_activates") {
    def * = (userId, activateKey, createdAt, activatedAt, updatedAt) <> (MailActivatesRow.tupled, MailActivatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(userId), Rep.Some(activateKey), Rep.Some(createdAt), activatedAt, Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> MailActivatesRow.tupled((_1.get, _2.get, _3.get, _4, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column user_id SqlType(INT), PrimaryKey */
    val userId: Rep[Int] = column[Int]("user_id", O.PrimaryKey)
    /** Database column activate_key SqlType(VARCHAR), Length(100,true) */
    val activateKey: Rep[String] = column[String]("activate_key", O.Length(100,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column activated_at SqlType(DATETIME) */
    val activatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("activated_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Foreign key referencing CompanyUsers (database name mail_activates_fk_1) */
    lazy val companyUsersFk = foreignKey("mail_activates_fk_1", userId, CompanyUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table MailActivates */
  lazy val MailActivates = new TableQuery(tag => new MailActivates(tag))

  /** Entity class storing rows of table MailmagUsers
   *  @param email Database column email SqlType(VARCHAR), PrimaryKey, Length(100,true) */
  final case class MailmagUsersRow(email: String)
  /** GetResult implicit for fetching MailmagUsersRow objects using plain SQL queries */
  implicit def GetResultMailmagUsersRow(implicit e0: GR[String]): GR[MailmagUsersRow] = GR{
    prs => import prs._
    MailmagUsersRow(<<[String])
  }
  /** Table description of table mailmag_users. Objects of this class serve as prototypes for rows in queries. */
  class MailmagUsers(_tableTag: Tag) extends profile.api.Table[MailmagUsersRow](_tableTag, "mailmag_users") {
    def * = email <> (MailmagUsersRow, MailmagUsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = Rep.Some(email).shaped.<>(r => r.map(_=> MailmagUsersRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column email SqlType(VARCHAR), PrimaryKey, Length(100,true) */
    val email: Rep[String] = column[String]("email", O.PrimaryKey, O.Length(100,varying=true))
  }
  /** Collection-like TableQuery object for table MailmagUsers */
  lazy val MailmagUsers = new TableQuery(tag => new MailmagUsers(tag))

  /** Entity class storing rows of table MailNotifications
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class MailNotificationsRow(id: Option[Int] = None, name: String, createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching MailNotificationsRow objects using plain SQL queries */
  implicit def GetResultMailNotificationsRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[DateTime]]): GR[MailNotificationsRow] = GR{
    prs => import prs._
    MailNotificationsRow.tupled((<<?[Int], <<[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table mail_notifications. Objects of this class serve as prototypes for rows in queries. */
  class MailNotifications(_tableTag: Tag) extends profile.api.Table[MailNotificationsRow](_tableTag, "mail_notifications") {
    def * = (Rep.Some(id), name, createdAt, updatedAt) <> (MailNotificationsRow.tupled, MailNotificationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> MailNotificationsRow.tupled((_1, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table MailNotifications */
  lazy val MailNotifications = new TableQuery(tag => new MailNotifications(tag))

  /** Entity class storing rows of table MailParams
   *  @param targetId Database column target_id SqlType(INT)
   *  @param label Database column label SqlType(VARCHAR), Length(20,true)
   *  @param value Database column value SqlType(VARCHAR), Length(100,true) */
  final case class MailParamsRow(targetId: Int, label: String, value: String)
  /** GetResult implicit for fetching MailParamsRow objects using plain SQL queries */
  implicit def GetResultMailParamsRow(implicit e0: GR[Int], e1: GR[String]): GR[MailParamsRow] = GR{
    prs => import prs._
    MailParamsRow.tupled((<<[Int], <<[String], <<[String]))
  }
  /** Table description of table mail_params. Objects of this class serve as prototypes for rows in queries. */
  class MailParams(_tableTag: Tag) extends profile.api.Table[MailParamsRow](_tableTag, "mail_params") {
    def * = (targetId, label, value) <> (MailParamsRow.tupled, MailParamsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(targetId), Rep.Some(label), Rep.Some(value)).shaped.<>({r=>import r._; _1.map(_=> MailParamsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column target_id SqlType(INT) */
    val targetId: Rep[Int] = column[Int]("target_id")
    /** Database column label SqlType(VARCHAR), Length(20,true) */
    val label: Rep[String] = column[String]("label", O.Length(20,varying=true))
    /** Database column value SqlType(VARCHAR), Length(100,true) */
    val value: Rep[String] = column[String]("value", O.Length(100,varying=true))

    /** Foreign key referencing MailTargets (database name mail_params_ibfk_1) */
    lazy val mailTargetsFk = foreignKey("mail_params_ibfk_1", targetId, MailTargets)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table MailParams */
  lazy val MailParams = new TableQuery(tag => new MailParams(tag))

  /** Entity class storing rows of table MailTargets
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param jobId Database column job_id SqlType(INT)
   *  @param email Database column email SqlType(VARCHAR), Length(100,true)
   *  @param sentAt Database column sent_at SqlType(TIMESTAMP)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class MailTargetsRow(id: Option[Int] = None, jobId: Int, email: String, sentAt: Option[DateTime], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching MailTargetsRow objects using plain SQL queries */
  implicit def GetResultMailTargetsRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[String], e3: GR[Option[DateTime]]): GR[MailTargetsRow] = GR{
    prs => import prs._
    MailTargetsRow.tupled((<<?[Int], <<[Int], <<[String], <<[Option[DateTime]], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table mail_targets. Objects of this class serve as prototypes for rows in queries. */
  class MailTargets(_tableTag: Tag) extends profile.api.Table[MailTargetsRow](_tableTag, "mail_targets") {
    def * = (Rep.Some(id), jobId, email, sentAt, createdAt, updatedAt) <> (MailTargetsRow.tupled, MailTargetsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(jobId), Rep.Some(email), Rep.Some(sentAt), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> MailTargetsRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column job_id SqlType(INT) */
    val jobId: Rep[Int] = column[Int]("job_id")
    /** Database column email SqlType(VARCHAR), Length(100,true) */
    val email: Rep[String] = column[String]("email", O.Length(100,varying=true))
    /** Database column sent_at SqlType(TIMESTAMP) */
    val sentAt: Rep[Option[DateTime]] = column[Option[DateTime]]("sent_at")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Foreign key referencing Jobs (database name mail_targets_ibfk_1) */
    lazy val jobsFk = foreignKey("mail_targets_ibfk_1", jobId, Jobs)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table MailTargets */
  lazy val MailTargets = new TableQuery(tag => new MailTargets(tag))

  /** Entity class storing rows of table MArea
   *  @param id Database column id SqlType(INT), PrimaryKey
   *  @param label Database column label SqlType(VARCHAR), Length(255,true)
   *  @param sortOrder Database column sort_order SqlType(INT)
   *  @param created Database column created SqlType(DATETIME)
   *  @param modified Database column modified SqlType(DATETIME)
   *  @param deleted Database column deleted SqlType(DATETIME) */
  final case class MAreaRow(id: Int, label: String, sortOrder: Int, created: DateTime, modified: Option[DateTime], deleted: Option[DateTime])
  /** GetResult implicit for fetching MAreaRow objects using plain SQL queries */
  implicit def GetResultMAreaRow(implicit e0: GR[Int], e1: GR[String], e2: GR[DateTime], e3: GR[Option[DateTime]]): GR[MAreaRow] = GR{
    prs => import prs._
    MAreaRow.tupled((<<[Int], <<[String], <<[Int], <<[DateTime], <<?[DateTime], <<?[DateTime]))
  }
  /** Table description of table m_area. Objects of this class serve as prototypes for rows in queries. */
  class MArea(_tableTag: Tag) extends profile.api.Table[MAreaRow](_tableTag, "m_area") {
    def * = (id, label, sortOrder, created, modified, deleted) <> (MAreaRow.tupled, MAreaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(label), Rep.Some(sortOrder), Rep.Some(created), modified, deleted).shaped.<>({r=>import r._; _1.map(_=> MAreaRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column label SqlType(VARCHAR), Length(255,true) */
    val label: Rep[String] = column[String]("label", O.Length(255,varying=true))
    /** Database column sort_order SqlType(INT) */
    val sortOrder: Rep[Int] = column[Int]("sort_order")
    /** Database column created SqlType(DATETIME) */
    val created: Rep[DateTime] = column[DateTime]("created")
    /** Database column modified SqlType(DATETIME) */
    val modified: Rep[Option[DateTime]] = column[Option[DateTime]]("modified")
    /** Database column deleted SqlType(DATETIME) */
    val deleted: Rep[Option[DateTime]] = column[Option[DateTime]]("deleted")
  }
  /** Collection-like TableQuery object for table MArea */
  lazy val MArea = new TableQuery(tag => new MArea(tag))

  /** Entity class storing rows of table MCapital
   *  @param id Database column id SqlType(INT), PrimaryKey
   *  @param label Database column label SqlType(VARCHAR), Length(255,true)
   *  @param sortOrder Database column sort_order SqlType(INT)
   *  @param created Database column created SqlType(DATETIME)
   *  @param modified Database column modified SqlType(DATETIME)
   *  @param deleted Database column deleted SqlType(DATETIME) */
  final case class MCapitalRow(id: Int, label: String, sortOrder: Int, created: DateTime, modified: Option[DateTime], deleted: Option[DateTime])
  /** GetResult implicit for fetching MCapitalRow objects using plain SQL queries */
  implicit def GetResultMCapitalRow(implicit e0: GR[Int], e1: GR[String], e2: GR[DateTime], e3: GR[Option[DateTime]]): GR[MCapitalRow] = GR{
    prs => import prs._
    MCapitalRow.tupled((<<[Int], <<[String], <<[Int], <<[DateTime], <<?[DateTime], <<?[DateTime]))
  }
  /** Table description of table m_capital. Objects of this class serve as prototypes for rows in queries. */
  class MCapital(_tableTag: Tag) extends profile.api.Table[MCapitalRow](_tableTag, "m_capital") {
    def * = (id, label, sortOrder, created, modified, deleted) <> (MCapitalRow.tupled, MCapitalRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(label), Rep.Some(sortOrder), Rep.Some(created), modified, deleted).shaped.<>({r=>import r._; _1.map(_=> MCapitalRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column label SqlType(VARCHAR), Length(255,true) */
    val label: Rep[String] = column[String]("label", O.Length(255,varying=true))
    /** Database column sort_order SqlType(INT) */
    val sortOrder: Rep[Int] = column[Int]("sort_order")
    /** Database column created SqlType(DATETIME) */
    val created: Rep[DateTime] = column[DateTime]("created")
    /** Database column modified SqlType(DATETIME) */
    val modified: Rep[Option[DateTime]] = column[Option[DateTime]]("modified")
    /** Database column deleted SqlType(DATETIME) */
    val deleted: Rep[Option[DateTime]] = column[Option[DateTime]]("deleted")
  }
  /** Collection-like TableQuery object for table MCapital */
  lazy val MCapital = new TableQuery(tag => new MCapital(tag))

  /** Entity class storing rows of table MediumTags
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param largeTagId Database column large_tag_id SqlType(INT)
   *  @param name Database column name SqlType(VARCHAR), Length(127,true) */
  final case class MediumTagsRow(id: Option[Int] = None, largeTagId: Option[Int], name: String)
  /** GetResult implicit for fetching MediumTagsRow objects using plain SQL queries */
  implicit def GetResultMediumTagsRow(implicit e0: GR[Option[Int]], e1: GR[String]): GR[MediumTagsRow] = GR{
    prs => import prs._
    MediumTagsRow.tupled((<<?[Int], <<?[Int], <<[String]))
  }
  /** Table description of table medium_tags. Objects of this class serve as prototypes for rows in queries. */
  class MediumTags(_tableTag: Tag) extends profile.api.Table[MediumTagsRow](_tableTag, "medium_tags") {
    def * = (Rep.Some(id), largeTagId, name) <> (MediumTagsRow.tupled, MediumTagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), largeTagId, Rep.Some(name)).shaped.<>({r=>import r._; _1.map(_=> MediumTagsRow.tupled((_1, _2, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column large_tag_id SqlType(INT) */
    val largeTagId: Rep[Option[Int]] = column[Option[Int]]("large_tag_id")
    /** Database column name SqlType(VARCHAR), Length(127,true) */
    val name: Rep[String] = column[String]("name", O.Length(127,varying=true))

    /** Foreign key referencing LargeTags (database name medium_tags_fk_1) */
    lazy val largeTagsFk = foreignKey("medium_tags_fk_1", largeTagId, LargeTags)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (name,largeTagId) (database name unique_medium_tags_name_large_tag_id) */
    val index1 = index("unique_medium_tags_name_large_tag_id", (name, largeTagId), unique=true)
  }
  /** Collection-like TableQuery object for table MediumTags */
  lazy val MediumTags = new TableQuery(tag => new MediumTags(tag))

  /** Entity class storing rows of table MIndustryLarge
   *  @param id Database column id SqlType(INT), PrimaryKey
   *  @param label Database column label SqlType(VARCHAR), Length(255,true)
   *  @param sortOrder Database column sort_order SqlType(INT)
   *  @param created Database column created SqlType(DATETIME)
   *  @param modified Database column modified SqlType(DATETIME)
   *  @param deleted Database column deleted SqlType(DATETIME) */
  final case class MIndustryLargeRow(id: Int, label: String, sortOrder: Int, created: DateTime, modified: Option[DateTime], deleted: Option[DateTime])
  /** GetResult implicit for fetching MIndustryLargeRow objects using plain SQL queries */
  implicit def GetResultMIndustryLargeRow(implicit e0: GR[Int], e1: GR[String], e2: GR[DateTime], e3: GR[Option[DateTime]]): GR[MIndustryLargeRow] = GR{
    prs => import prs._
    MIndustryLargeRow.tupled((<<[Int], <<[String], <<[Int], <<[DateTime], <<?[DateTime], <<?[DateTime]))
  }
  /** Table description of table m_industry_large. Objects of this class serve as prototypes for rows in queries. */
  class MIndustryLarge(_tableTag: Tag) extends profile.api.Table[MIndustryLargeRow](_tableTag, "m_industry_large") {
    def * = (id, label, sortOrder, created, modified, deleted) <> (MIndustryLargeRow.tupled, MIndustryLargeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(label), Rep.Some(sortOrder), Rep.Some(created), modified, deleted).shaped.<>({r=>import r._; _1.map(_=> MIndustryLargeRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column label SqlType(VARCHAR), Length(255,true) */
    val label: Rep[String] = column[String]("label", O.Length(255,varying=true))
    /** Database column sort_order SqlType(INT) */
    val sortOrder: Rep[Int] = column[Int]("sort_order")
    /** Database column created SqlType(DATETIME) */
    val created: Rep[DateTime] = column[DateTime]("created")
    /** Database column modified SqlType(DATETIME) */
    val modified: Rep[Option[DateTime]] = column[Option[DateTime]]("modified")
    /** Database column deleted SqlType(DATETIME) */
    val deleted: Rep[Option[DateTime]] = column[Option[DateTime]]("deleted")
  }
  /** Collection-like TableQuery object for table MIndustryLarge */
  lazy val MIndustryLarge = new TableQuery(tag => new MIndustryLarge(tag))

  /** Entity class storing rows of table MIndustrySmall
   *  @param id Database column id SqlType(INT), PrimaryKey
   *  @param industryLargeId Database column industry_large_id SqlType(INT)
   *  @param label Database column label SqlType(VARCHAR), Length(255,true)
   *  @param sortOrder Database column sort_order SqlType(INT)
   *  @param created Database column created SqlType(DATETIME)
   *  @param modified Database column modified SqlType(DATETIME)
   *  @param deleted Database column deleted SqlType(DATETIME) */
  final case class MIndustrySmallRow(id: Int, industryLargeId: Int, label: String, sortOrder: Int, created: DateTime, modified: Option[DateTime], deleted: Option[DateTime])
  /** GetResult implicit for fetching MIndustrySmallRow objects using plain SQL queries */
  implicit def GetResultMIndustrySmallRow(implicit e0: GR[Int], e1: GR[String], e2: GR[DateTime], e3: GR[Option[DateTime]]): GR[MIndustrySmallRow] = GR{
    prs => import prs._
    MIndustrySmallRow.tupled((<<[Int], <<[Int], <<[String], <<[Int], <<[DateTime], <<?[DateTime], <<?[DateTime]))
  }
  /** Table description of table m_industry_small. Objects of this class serve as prototypes for rows in queries. */
  class MIndustrySmall(_tableTag: Tag) extends profile.api.Table[MIndustrySmallRow](_tableTag, "m_industry_small") {
    def * = (id, industryLargeId, label, sortOrder, created, modified, deleted) <> (MIndustrySmallRow.tupled, MIndustrySmallRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(industryLargeId), Rep.Some(label), Rep.Some(sortOrder), Rep.Some(created), modified, deleted).shaped.<>({r=>import r._; _1.map(_=> MIndustrySmallRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column industry_large_id SqlType(INT) */
    val industryLargeId: Rep[Int] = column[Int]("industry_large_id")
    /** Database column label SqlType(VARCHAR), Length(255,true) */
    val label: Rep[String] = column[String]("label", O.Length(255,varying=true))
    /** Database column sort_order SqlType(INT) */
    val sortOrder: Rep[Int] = column[Int]("sort_order")
    /** Database column created SqlType(DATETIME) */
    val created: Rep[DateTime] = column[DateTime]("created")
    /** Database column modified SqlType(DATETIME) */
    val modified: Rep[Option[DateTime]] = column[Option[DateTime]]("modified")
    /** Database column deleted SqlType(DATETIME) */
    val deleted: Rep[Option[DateTime]] = column[Option[DateTime]]("deleted")

    /** Index over (industryLargeId) (database name industry_large_id) */
    val index1 = index("industry_large_id", industryLargeId)
  }
  /** Collection-like TableQuery object for table MIndustrySmall */
  lazy val MIndustrySmall = new TableQuery(tag => new MIndustrySmall(tag))

  /** Entity class storing rows of table MJobTypeLarge
   *  @param id Database column id SqlType(INT)
   *  @param label Database column label SqlType(VARCHAR), Length(255,true)
   *  @param sortOrder Database column sort_order SqlType(INT)
   *  @param created Database column created SqlType(DATETIME)
   *  @param modified Database column modified SqlType(DATETIME)
   *  @param deleted Database column deleted SqlType(DATETIME) */
  final case class MJobTypeLargeRow(id: Int, label: String, sortOrder: Int, created: DateTime, modified: Option[DateTime], deleted: Option[DateTime])
  /** GetResult implicit for fetching MJobTypeLargeRow objects using plain SQL queries */
  implicit def GetResultMJobTypeLargeRow(implicit e0: GR[Int], e1: GR[String], e2: GR[DateTime], e3: GR[Option[DateTime]]): GR[MJobTypeLargeRow] = GR{
    prs => import prs._
    MJobTypeLargeRow.tupled((<<[Int], <<[String], <<[Int], <<[DateTime], <<?[DateTime], <<?[DateTime]))
  }
  /** Table description of table m_job_type_large. Objects of this class serve as prototypes for rows in queries. */
  class MJobTypeLarge(_tableTag: Tag) extends profile.api.Table[MJobTypeLargeRow](_tableTag, "m_job_type_large") {
    def * = (id, label, sortOrder, created, modified, deleted) <> (MJobTypeLargeRow.tupled, MJobTypeLargeRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(label), Rep.Some(sortOrder), Rep.Some(created), modified, deleted).shaped.<>({r=>import r._; _1.map(_=> MJobTypeLargeRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT) */
    val id: Rep[Int] = column[Int]("id")
    /** Database column label SqlType(VARCHAR), Length(255,true) */
    val label: Rep[String] = column[String]("label", O.Length(255,varying=true))
    /** Database column sort_order SqlType(INT) */
    val sortOrder: Rep[Int] = column[Int]("sort_order")
    /** Database column created SqlType(DATETIME) */
    val created: Rep[DateTime] = column[DateTime]("created")
    /** Database column modified SqlType(DATETIME) */
    val modified: Rep[Option[DateTime]] = column[Option[DateTime]]("modified")
    /** Database column deleted SqlType(DATETIME) */
    val deleted: Rep[Option[DateTime]] = column[Option[DateTime]]("deleted")

    /** Index over (id) (database name id) */
    val index1 = index("id", id)
  }
  /** Collection-like TableQuery object for table MJobTypeLarge */
  lazy val MJobTypeLarge = new TableQuery(tag => new MJobTypeLarge(tag))

  /** Entity class storing rows of table MJobTypeMiddle
   *  @param id Database column id SqlType(INT), PrimaryKey
   *  @param jobTypeLargeId Database column job_type_large_id SqlType(INT)
   *  @param label Database column label SqlType(VARCHAR), Length(255,true)
   *  @param sortOrder Database column sort_order SqlType(INT)
   *  @param created Database column created SqlType(DATETIME)
   *  @param modified Database column modified SqlType(DATETIME)
   *  @param deleted Database column deleted SqlType(DATETIME) */
  final case class MJobTypeMiddleRow(id: Int, jobTypeLargeId: Int, label: String, sortOrder: Int, created: DateTime, modified: Option[DateTime], deleted: Option[DateTime])
  /** GetResult implicit for fetching MJobTypeMiddleRow objects using plain SQL queries */
  implicit def GetResultMJobTypeMiddleRow(implicit e0: GR[Int], e1: GR[String], e2: GR[DateTime], e3: GR[Option[DateTime]]): GR[MJobTypeMiddleRow] = GR{
    prs => import prs._
    MJobTypeMiddleRow.tupled((<<[Int], <<[Int], <<[String], <<[Int], <<[DateTime], <<?[DateTime], <<?[DateTime]))
  }
  /** Table description of table m_job_type_middle. Objects of this class serve as prototypes for rows in queries. */
  class MJobTypeMiddle(_tableTag: Tag) extends profile.api.Table[MJobTypeMiddleRow](_tableTag, "m_job_type_middle") {
    def * = (id, jobTypeLargeId, label, sortOrder, created, modified, deleted) <> (MJobTypeMiddleRow.tupled, MJobTypeMiddleRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(jobTypeLargeId), Rep.Some(label), Rep.Some(sortOrder), Rep.Some(created), modified, deleted).shaped.<>({r=>import r._; _1.map(_=> MJobTypeMiddleRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column job_type_large_id SqlType(INT) */
    val jobTypeLargeId: Rep[Int] = column[Int]("job_type_large_id")
    /** Database column label SqlType(VARCHAR), Length(255,true) */
    val label: Rep[String] = column[String]("label", O.Length(255,varying=true))
    /** Database column sort_order SqlType(INT) */
    val sortOrder: Rep[Int] = column[Int]("sort_order")
    /** Database column created SqlType(DATETIME) */
    val created: Rep[DateTime] = column[DateTime]("created")
    /** Database column modified SqlType(DATETIME) */
    val modified: Rep[Option[DateTime]] = column[Option[DateTime]]("modified")
    /** Database column deleted SqlType(DATETIME) */
    val deleted: Rep[Option[DateTime]] = column[Option[DateTime]]("deleted")

    /** Index over (jobTypeLargeId) (database name job_type_large_id) */
    val index1 = index("job_type_large_id", jobTypeLargeId)
  }
  /** Collection-like TableQuery object for table MJobTypeMiddle */
  lazy val MJobTypeMiddle = new TableQuery(tag => new MJobTypeMiddle(tag))

  /** Entity class storing rows of table MJobTypeSmall
   *  @param id Database column id SqlType(INT), PrimaryKey
   *  @param jobTypeMiddleId Database column job_type_middle_id SqlType(INT)
   *  @param label Database column label SqlType(VARCHAR), Length(255,true)
   *  @param sortOrder Database column sort_order SqlType(INT)
   *  @param created Database column created SqlType(DATETIME)
   *  @param modified Database column modified SqlType(DATETIME)
   *  @param deleted Database column deleted SqlType(DATETIME) */
  final case class MJobTypeSmallRow(id: Int, jobTypeMiddleId: Int, label: String, sortOrder: Int, created: DateTime, modified: Option[DateTime], deleted: Option[DateTime])
  /** GetResult implicit for fetching MJobTypeSmallRow objects using plain SQL queries */
  implicit def GetResultMJobTypeSmallRow(implicit e0: GR[Int], e1: GR[String], e2: GR[DateTime], e3: GR[Option[DateTime]]): GR[MJobTypeSmallRow] = GR{
    prs => import prs._
    MJobTypeSmallRow.tupled((<<[Int], <<[Int], <<[String], <<[Int], <<[DateTime], <<?[DateTime], <<?[DateTime]))
  }
  /** Table description of table m_job_type_small. Objects of this class serve as prototypes for rows in queries. */
  class MJobTypeSmall(_tableTag: Tag) extends profile.api.Table[MJobTypeSmallRow](_tableTag, "m_job_type_small") {
    def * = (id, jobTypeMiddleId, label, sortOrder, created, modified, deleted) <> (MJobTypeSmallRow.tupled, MJobTypeSmallRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(jobTypeMiddleId), Rep.Some(label), Rep.Some(sortOrder), Rep.Some(created), modified, deleted).shaped.<>({r=>import r._; _1.map(_=> MJobTypeSmallRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column job_type_middle_id SqlType(INT) */
    val jobTypeMiddleId: Rep[Int] = column[Int]("job_type_middle_id")
    /** Database column label SqlType(VARCHAR), Length(255,true) */
    val label: Rep[String] = column[String]("label", O.Length(255,varying=true))
    /** Database column sort_order SqlType(INT) */
    val sortOrder: Rep[Int] = column[Int]("sort_order")
    /** Database column created SqlType(DATETIME) */
    val created: Rep[DateTime] = column[DateTime]("created")
    /** Database column modified SqlType(DATETIME) */
    val modified: Rep[Option[DateTime]] = column[Option[DateTime]]("modified")
    /** Database column deleted SqlType(DATETIME) */
    val deleted: Rep[Option[DateTime]] = column[Option[DateTime]]("deleted")

    /** Index over (jobTypeMiddleId) (database name job_type_middle_id) */
    val index1 = index("job_type_middle_id", jobTypeMiddleId)
  }
  /** Collection-like TableQuery object for table MJobTypeSmall */
  lazy val MJobTypeSmall = new TableQuery(tag => new MJobTypeSmall(tag))

  /** Entity class storing rows of table MPrefecture
   *  @param id Database column id SqlType(INT), PrimaryKey
   *  @param areaId Database column area_id SqlType(INT)
   *  @param label Database column label SqlType(VARCHAR), Length(255,true)
   *  @param sortOrder Database column sort_order SqlType(INT)
   *  @param created Database column created SqlType(DATETIME)
   *  @param modified Database column modified SqlType(DATETIME)
   *  @param deleted Database column deleted SqlType(DATETIME) */
  final case class MPrefectureRow(id: Int, areaId: Int, label: String, sortOrder: Int, created: DateTime, modified: Option[DateTime], deleted: Option[DateTime])
  /** GetResult implicit for fetching MPrefectureRow objects using plain SQL queries */
  implicit def GetResultMPrefectureRow(implicit e0: GR[Int], e1: GR[String], e2: GR[DateTime], e3: GR[Option[DateTime]]): GR[MPrefectureRow] = GR{
    prs => import prs._
    MPrefectureRow.tupled((<<[Int], <<[Int], <<[String], <<[Int], <<[DateTime], <<?[DateTime], <<?[DateTime]))
  }
  /** Table description of table m_prefecture. Objects of this class serve as prototypes for rows in queries. */
  class MPrefecture(_tableTag: Tag) extends profile.api.Table[MPrefectureRow](_tableTag, "m_prefecture") {
    def * = (id, areaId, label, sortOrder, created, modified, deleted) <> (MPrefectureRow.tupled, MPrefectureRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(areaId), Rep.Some(label), Rep.Some(sortOrder), Rep.Some(created), modified, deleted).shaped.<>({r=>import r._; _1.map(_=> MPrefectureRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column area_id SqlType(INT) */
    val areaId: Rep[Int] = column[Int]("area_id")
    /** Database column label SqlType(VARCHAR), Length(255,true) */
    val label: Rep[String] = column[String]("label", O.Length(255,varying=true))
    /** Database column sort_order SqlType(INT) */
    val sortOrder: Rep[Int] = column[Int]("sort_order")
    /** Database column created SqlType(DATETIME) */
    val created: Rep[DateTime] = column[DateTime]("created")
    /** Database column modified SqlType(DATETIME) */
    val modified: Rep[Option[DateTime]] = column[Option[DateTime]]("modified")
    /** Database column deleted SqlType(DATETIME) */
    val deleted: Rep[Option[DateTime]] = column[Option[DateTime]]("deleted")

    /** Index over (areaId) (database name area_id) */
    val index1 = index("area_id", areaId)
  }
  /** Collection-like TableQuery object for table MPrefecture */
  lazy val MPrefecture = new TableQuery(tag => new MPrefecture(tag))

  /** Entity class storing rows of table NgCompanies
   *  @param companyName Database column company_name SqlType(VARCHAR), Length(255,true)
   *  @param email Database column email SqlType(VARCHAR), Length(100,true)
   *  @param staffName Database column staff_name SqlType(VARCHAR), Length(100,true)
   *  @param url Database column url SqlType(VARCHAR), Length(1000,true)
   *  @param memo Database column memo SqlType(VARCHAR), Length(1000,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class NgCompaniesRow(companyName: String, email: String, staffName: String, url: String, memo: Option[String], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching NgCompaniesRow objects using plain SQL queries */
  implicit def GetResultNgCompaniesRow(implicit e0: GR[String], e1: GR[Option[String]], e2: GR[Option[DateTime]]): GR[NgCompaniesRow] = GR{
    prs => import prs._
    NgCompaniesRow.tupled((<<[String], <<[String], <<[String], <<[String], <<?[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table ng_companies. Objects of this class serve as prototypes for rows in queries. */
  class NgCompanies(_tableTag: Tag) extends profile.api.Table[NgCompaniesRow](_tableTag, "ng_companies") {
    def * = (companyName, email, staffName, url, memo, createdAt, updatedAt) <> (NgCompaniesRow.tupled, NgCompaniesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(companyName), Rep.Some(email), Rep.Some(staffName), Rep.Some(url), memo, Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> NgCompaniesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_name SqlType(VARCHAR), Length(255,true) */
    val companyName: Rep[String] = column[String]("company_name", O.Length(255,varying=true))
    /** Database column email SqlType(VARCHAR), Length(100,true) */
    val email: Rep[String] = column[String]("email", O.Length(100,varying=true))
    /** Database column staff_name SqlType(VARCHAR), Length(100,true) */
    val staffName: Rep[String] = column[String]("staff_name", O.Length(100,varying=true))
    /** Database column url SqlType(VARCHAR), Length(1000,true) */
    val url: Rep[String] = column[String]("url", O.Length(1000,varying=true))
    /** Database column memo SqlType(VARCHAR), Length(1000,true) */
    val memo: Rep[Option[String]] = column[Option[String]]("memo", O.Length(1000,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table NgCompanies */
  lazy val NgCompanies = new TableQuery(tag => new NgCompanies(tag))

  /** Entity class storing rows of table NotificationImages
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param notificationId Database column notification_id SqlType(INT)
   *  @param image Database column image SqlType(TEXT), Length(65535,true)
   *  @param alt Database column alt SqlType(VARCHAR), Length(255,true)
   *  @param rowOrder Database column row_order SqlType(INT)
   *  @param createdAt Database column created_at SqlType(DATETIME)
   *  @param updatedAt Database column updated_at SqlType(DATETIME) */
  final case class NotificationImagesRow(id: Option[Int] = None, notificationId: Int, image: String, alt: Option[String], rowOrder: Option[Int], createdAt: DateTime, updatedAt: DateTime)
  /** GetResult implicit for fetching NotificationImagesRow objects using plain SQL queries */
  implicit def GetResultNotificationImagesRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[String], e3: GR[Option[String]], e4: GR[DateTime]): GR[NotificationImagesRow] = GR{
    prs => import prs._
    NotificationImagesRow.tupled((<<?[Int], <<[Int], <<[String], <<?[String], <<?[Int], <<[DateTime], <<[DateTime]))
  }
  /** Table description of table notification_images. Objects of this class serve as prototypes for rows in queries. */
  class NotificationImages(_tableTag: Tag) extends profile.api.Table[NotificationImagesRow](_tableTag, "notification_images") {
    def * = (Rep.Some(id), notificationId, image, alt, rowOrder, createdAt, updatedAt) <> (NotificationImagesRow.tupled, NotificationImagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(notificationId), Rep.Some(image), alt, rowOrder, Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> NotificationImagesRow.tupled((_1, _2.get, _3.get, _4, _5, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column notification_id SqlType(INT) */
    val notificationId: Rep[Int] = column[Int]("notification_id")
    /** Database column image SqlType(TEXT), Length(65535,true) */
    val image: Rep[String] = column[String]("image", O.Length(65535,varying=true))
    /** Database column alt SqlType(VARCHAR), Length(255,true) */
    val alt: Rep[Option[String]] = column[Option[String]]("alt", O.Length(255,varying=true))
    /** Database column row_order SqlType(INT) */
    val rowOrder: Rep[Option[Int]] = column[Option[Int]]("row_order")
    /** Database column created_at SqlType(DATETIME) */
    val createdAt: Rep[DateTime] = column[DateTime]("created_at")
    /** Database column updated_at SqlType(DATETIME) */
    val updatedAt: Rep[DateTime] = column[DateTime]("updated_at")

    /** Index over (notificationId) (database name index_notification_images_on_notification_id) */
    val index1 = index("index_notification_images_on_notification_id", notificationId)
  }
  /** Collection-like TableQuery object for table NotificationImages */
  lazy val NotificationImages = new TableQuery(tag => new NotificationImages(tag))

  /** Entity class storing rows of table Notifications
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param title Database column title SqlType(VARCHAR), Length(100,true)
   *  @param description Database column description SqlType(VARCHAR), Length(100,true)
   *  @param body Database column body SqlType(TEXT), Length(65535,true)
   *  @param projectId Database column project_id SqlType(INT)
   *  @param unread Database column unread SqlType(BIT)
   *  @param kind Database column kind SqlType(INT)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP) */
  final case class NotificationsRow(id: Option[Int] = None, title: String, description: String, body: String, projectId: Int, unread: Boolean, kind: Int, createdAt: Option[DateTime])
  /** GetResult implicit for fetching NotificationsRow objects using plain SQL queries */
  implicit def GetResultNotificationsRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Int], e3: GR[Boolean], e4: GR[Option[DateTime]]): GR[NotificationsRow] = GR{
    prs => import prs._
    NotificationsRow.tupled((<<?[Int], <<[String], <<[String], <<[String], <<[Int], <<[Boolean], <<[Int], <<[Option[DateTime]]))
  }
  /** Table description of table notifications. Objects of this class serve as prototypes for rows in queries. */
  class Notifications(_tableTag: Tag) extends profile.api.Table[NotificationsRow](_tableTag, "notifications") {
    def * = (Rep.Some(id), title, description, body, projectId, unread, kind, createdAt) <> (NotificationsRow.tupled, NotificationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(title), Rep.Some(description), Rep.Some(body), Rep.Some(projectId), Rep.Some(unread), Rep.Some(kind), Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> NotificationsRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column title SqlType(VARCHAR), Length(100,true) */
    val title: Rep[String] = column[String]("title", O.Length(100,varying=true))
    /** Database column description SqlType(VARCHAR), Length(100,true) */
    val description: Rep[String] = column[String]("description", O.Length(100,varying=true))
    /** Database column body SqlType(TEXT), Length(65535,true) */
    val body: Rep[String] = column[String]("body", O.Length(65535,varying=true))
    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column unread SqlType(BIT) */
    val unread: Rep[Boolean] = column[Boolean]("unread")
    /** Database column kind SqlType(INT) */
    val kind: Rep[Int] = column[Int]("kind")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")

    /** Foreign key referencing Projects (database name notifications_ibfk_1) */
    lazy val projectsFk = foreignKey("notifications_ibfk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Notifications */
  lazy val Notifications = new TableQuery(tag => new Notifications(tag))

  /** Entity class storing rows of table NotificationTemplates
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param title Database column title SqlType(VARCHAR), Length(200,true)
   *  @param body Database column body SqlType(TEXT), Length(65535,true) */
  final case class NotificationTemplatesRow(id: Option[Int] = None, title: String, body: String)
  /** GetResult implicit for fetching NotificationTemplatesRow objects using plain SQL queries */
  implicit def GetResultNotificationTemplatesRow(implicit e0: GR[Option[Int]], e1: GR[String]): GR[NotificationTemplatesRow] = GR{
    prs => import prs._
    NotificationTemplatesRow.tupled((<<?[Int], <<[String], <<[String]))
  }
  /** Table description of table notification_templates. Objects of this class serve as prototypes for rows in queries. */
  class NotificationTemplates(_tableTag: Tag) extends profile.api.Table[NotificationTemplatesRow](_tableTag, "notification_templates") {
    def * = (Rep.Some(id), title, body) <> (NotificationTemplatesRow.tupled, NotificationTemplatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(title), Rep.Some(body)).shaped.<>({r=>import r._; _1.map(_=> NotificationTemplatesRow.tupled((_1, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column title SqlType(VARCHAR), Length(200,true) */
    val title: Rep[String] = column[String]("title", O.Length(200,varying=true))
    /** Database column body SqlType(TEXT), Length(65535,true) */
    val body: Rep[String] = column[String]("body", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table NotificationTemplates */
  lazy val NotificationTemplates = new TableQuery(tag => new NotificationTemplates(tag))

  /** Entity class storing rows of table OfferableResource
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param companyId Database column company_id SqlType(INT)
   *  @param value Database column value SqlType(TEXT), Length(65535,true)
   *  @param displayOrder Database column display_order SqlType(INT) */
  final case class OfferableResourceRow(id: Option[Int] = None, companyId: Int, value: String, displayOrder: Int)
  /** GetResult implicit for fetching OfferableResourceRow objects using plain SQL queries */
  implicit def GetResultOfferableResourceRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[String]): GR[OfferableResourceRow] = GR{
    prs => import prs._
    OfferableResourceRow.tupled((<<?[Int], <<[Int], <<[String], <<[Int]))
  }
  /** Table description of table offerable_resource. Objects of this class serve as prototypes for rows in queries. */
  class OfferableResource(_tableTag: Tag) extends profile.api.Table[OfferableResourceRow](_tableTag, "offerable_resource") {
    def * = (Rep.Some(id), companyId, value, displayOrder) <> (OfferableResourceRow.tupled, OfferableResourceRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(companyId), Rep.Some(value), Rep.Some(displayOrder)).shaped.<>({r=>import r._; _1.map(_=> OfferableResourceRow.tupled((_1, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column company_id SqlType(INT) */
    val companyId: Rep[Int] = column[Int]("company_id")
    /** Database column value SqlType(TEXT), Length(65535,true) */
    val value: Rep[String] = column[String]("value", O.Length(65535,varying=true))
    /** Database column display_order SqlType(INT) */
    val displayOrder: Rep[Int] = column[Int]("display_order")

    /** Index over (companyId) (database name company_id) */
    val index1 = index("company_id", companyId)
  }
  /** Collection-like TableQuery object for table OfferableResource */
  lazy val OfferableResource = new TableQuery(tag => new OfferableResource(tag))

  /** Entity class storing rows of table OfferableResourceUpdateRequest
   *  @param companyId Database column company_id SqlType(INT), PrimaryKey
   *  @param value1 Database column value1 SqlType(TEXT), Length(65535,true)
   *  @param value2 Database column value2 SqlType(TEXT), Length(65535,true)
   *  @param value3 Database column value3 SqlType(TEXT), Length(65535,true)
   *  @param value4 Database column value4 SqlType(TEXT), Length(65535,true)
   *  @param value5 Database column value5 SqlType(TEXT), Length(65535,true)
   *  @param status Database column status SqlType(VARCHAR), Length(10,true)
   *  @param created Database column created SqlType(TIMESTAMP) */
  final case class OfferableResourceUpdateRequestRow(companyId: Int, value1: Option[String], value2: Option[String], value3: Option[String], value4: Option[String], value5: Option[String], status: String, created: Option[DateTime])
  /** GetResult implicit for fetching OfferableResourceUpdateRequestRow objects using plain SQL queries */
  implicit def GetResultOfferableResourceUpdateRequestRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[DateTime]]): GR[OfferableResourceUpdateRequestRow] = GR{
    prs => import prs._
    OfferableResourceUpdateRequestRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[String], <<[Option[DateTime]]))
  }
  /** Table description of table offerable_resource_update_request. Objects of this class serve as prototypes for rows in queries. */
  class OfferableResourceUpdateRequest(_tableTag: Tag) extends profile.api.Table[OfferableResourceUpdateRequestRow](_tableTag, "offerable_resource_update_request") {
    def * = (companyId, value1, value2, value3, value4, value5, status, created) <> (OfferableResourceUpdateRequestRow.tupled, OfferableResourceUpdateRequestRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(companyId), value1, value2, value3, value4, value5, Rep.Some(status), Rep.Some(created)).shaped.<>({r=>import r._; _1.map(_=> OfferableResourceUpdateRequestRow.tupled((_1.get, _2, _3, _4, _5, _6, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_id SqlType(INT), PrimaryKey */
    val companyId: Rep[Int] = column[Int]("company_id", O.PrimaryKey)
    /** Database column value1 SqlType(TEXT), Length(65535,true) */
    val value1: Rep[Option[String]] = column[Option[String]]("value1", O.Length(65535,varying=true))
    /** Database column value2 SqlType(TEXT), Length(65535,true) */
    val value2: Rep[Option[String]] = column[Option[String]]("value2", O.Length(65535,varying=true))
    /** Database column value3 SqlType(TEXT), Length(65535,true) */
    val value3: Rep[Option[String]] = column[Option[String]]("value3", O.Length(65535,varying=true))
    /** Database column value4 SqlType(TEXT), Length(65535,true) */
    val value4: Rep[Option[String]] = column[Option[String]]("value4", O.Length(65535,varying=true))
    /** Database column value5 SqlType(TEXT), Length(65535,true) */
    val value5: Rep[Option[String]] = column[Option[String]]("value5", O.Length(65535,varying=true))
    /** Database column status SqlType(VARCHAR), Length(10,true) */
    val status: Rep[String] = column[String]("status", O.Length(10,varying=true))
    /** Database column created SqlType(TIMESTAMP) */
    val created: Rep[Option[DateTime]] = column[Option[DateTime]]("created")

    /** Foreign key referencing Companies (database name offerable_resource_update_request_ibfk_1) */
    lazy val companiesFk = foreignKey("offerable_resource_update_request_ibfk_1", companyId, Companies)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table OfferableResourceUpdateRequest */
  lazy val OfferableResourceUpdateRequest = new TableQuery(tag => new OfferableResourceUpdateRequest(tag))

  /** Entity class storing rows of table OpenInnovationPortals
   *  @param projectId Database column project_id SqlType(INT)
   *  @param url Database column url SqlType(TEXT), Length(65535,true)
   *  @param technicalDetail Database column technical_detail SqlType(MEDIUMTEXT), Length(16777215,true) */
  final case class OpenInnovationPortalsRow(projectId: Int, url: Option[String], technicalDetail: Option[String])
  /** GetResult implicit for fetching OpenInnovationPortalsRow objects using plain SQL queries */
  implicit def GetResultOpenInnovationPortalsRow(implicit e0: GR[Int], e1: GR[Option[String]]): GR[OpenInnovationPortalsRow] = GR{
    prs => import prs._
    OpenInnovationPortalsRow.tupled((<<[Int], <<?[String], <<?[String]))
  }
  /** Table description of table open_innovation_portals. Objects of this class serve as prototypes for rows in queries. */
  class OpenInnovationPortals(_tableTag: Tag) extends profile.api.Table[OpenInnovationPortalsRow](_tableTag, "open_innovation_portals") {
    def * = (projectId, url, technicalDetail) <> (OpenInnovationPortalsRow.tupled, OpenInnovationPortalsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(projectId), url, technicalDetail).shaped.<>({r=>import r._; _1.map(_=> OpenInnovationPortalsRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column url SqlType(TEXT), Length(65535,true) */
    val url: Rep[Option[String]] = column[Option[String]]("url", O.Length(65535,varying=true))
    /** Database column technical_detail SqlType(MEDIUMTEXT), Length(16777215,true) */
    val technicalDetail: Rep[Option[String]] = column[Option[String]]("technical_detail", O.Length(16777215,varying=true))

    /** Foreign key referencing Projects (database name open_innovation_portals_fk_1) */
    lazy val projectsFk = foreignKey("open_innovation_portals_fk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (projectId) (database name project_id) */
    val index1 = index("project_id", projectId, unique=true)
  }
  /** Collection-like TableQuery object for table OpenInnovationPortals */
  lazy val OpenInnovationPortals = new TableQuery(tag => new OpenInnovationPortals(tag))

  /** Entity class storing rows of table OpenInnovatorHistories
   *  @param projectId Database column project_id SqlType(INT)
   *  @param name Database column name SqlType(VARCHAR), Length(100,true)
   *  @param position Database column position SqlType(VARCHAR), Length(100,true)
   *  @param message Database column message SqlType(TEXT), Length(65535,true)
   *  @param department Database column department SqlType(VARCHAR), Length(100,true)
   *  @param departmentDescription Database column department_description SqlType(TEXT), Length(65535,true)
   *  @param mission Database column mission SqlType(TEXT), Length(65535,true)
   *  @param career Database column career SqlType(TEXT), Length(65535,true)
   *  @param logoUrl Database column logo_url SqlType(VARCHAR), Length(200,true)
   *  @param modifiedAt Database column modified_at SqlType(TIMESTAMP)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP) */
  final case class OpenInnovatorHistoriesRow(projectId: Int, name: Option[String], position: Option[String], message: Option[String], department: Option[String], departmentDescription: Option[String], mission: Option[String], career: Option[String], logoUrl: Option[String], modifiedAt: Option[DateTime], createdAt: Option[DateTime])
  /** GetResult implicit for fetching OpenInnovatorHistoriesRow objects using plain SQL queries */
  implicit def GetResultOpenInnovatorHistoriesRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[DateTime]]): GR[OpenInnovatorHistoriesRow] = GR{
    prs => import prs._
    OpenInnovatorHistoriesRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table open_innovator_histories. Objects of this class serve as prototypes for rows in queries. */
  class OpenInnovatorHistories(_tableTag: Tag) extends profile.api.Table[OpenInnovatorHistoriesRow](_tableTag, "open_innovator_histories") {
    def * = (projectId, name, position, message, department, departmentDescription, mission, career, logoUrl, modifiedAt, createdAt) <> (OpenInnovatorHistoriesRow.tupled, OpenInnovatorHistoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(projectId), name, position, message, department, departmentDescription, mission, career, logoUrl, Rep.Some(modifiedAt), Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> OpenInnovatorHistoriesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column name SqlType(VARCHAR), Length(100,true) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(100,varying=true))
    /** Database column position SqlType(VARCHAR), Length(100,true) */
    val position: Rep[Option[String]] = column[Option[String]]("position", O.Length(100,varying=true))
    /** Database column message SqlType(TEXT), Length(65535,true) */
    val message: Rep[Option[String]] = column[Option[String]]("message", O.Length(65535,varying=true))
    /** Database column department SqlType(VARCHAR), Length(100,true) */
    val department: Rep[Option[String]] = column[Option[String]]("department", O.Length(100,varying=true))
    /** Database column department_description SqlType(TEXT), Length(65535,true) */
    val departmentDescription: Rep[Option[String]] = column[Option[String]]("department_description", O.Length(65535,varying=true))
    /** Database column mission SqlType(TEXT), Length(65535,true) */
    val mission: Rep[Option[String]] = column[Option[String]]("mission", O.Length(65535,varying=true))
    /** Database column career SqlType(TEXT), Length(65535,true) */
    val career: Rep[Option[String]] = column[Option[String]]("career", O.Length(65535,varying=true))
    /** Database column logo_url SqlType(VARCHAR), Length(200,true) */
    val logoUrl: Rep[Option[String]] = column[Option[String]]("logo_url", O.Length(200,varying=true))
    /** Database column modified_at SqlType(TIMESTAMP) */
    val modifiedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("modified_at")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
  }
  /** Collection-like TableQuery object for table OpenInnovatorHistories */
  lazy val OpenInnovatorHistories = new TableQuery(tag => new OpenInnovatorHistories(tag))

  /** Entity class storing rows of table OpenInnovators
   *  @param projectId Database column project_id SqlType(INT)
   *  @param name Database column name SqlType(VARCHAR), Length(100,true)
   *  @param position Database column position SqlType(VARCHAR), Length(100,true)
   *  @param message Database column message SqlType(TEXT), Length(65535,true)
   *  @param department Database column department SqlType(VARCHAR), Length(100,true)
   *  @param departmentDescription Database column department_description SqlType(TEXT), Length(65535,true)
   *  @param mission Database column mission SqlType(TEXT), Length(65535,true)
   *  @param career Database column career SqlType(TEXT), Length(65535,true)
   *  @param logoUrl Database column logo_url SqlType(VARCHAR), Length(200,true)
   *  @param modifiedAt Database column modified_at SqlType(TIMESTAMP)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP) */
  final case class OpenInnovatorsRow(projectId: Int, name: Option[String], position: Option[String], message: Option[String], department: Option[String], departmentDescription: Option[String], mission: Option[String], career: Option[String], logoUrl: Option[String], modifiedAt: Option[DateTime], createdAt: Option[DateTime])
  /** GetResult implicit for fetching OpenInnovatorsRow objects using plain SQL queries */
  implicit def GetResultOpenInnovatorsRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[DateTime]]): GR[OpenInnovatorsRow] = GR{
    prs => import prs._
    OpenInnovatorsRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table open_innovators. Objects of this class serve as prototypes for rows in queries. */
  class OpenInnovators(_tableTag: Tag) extends profile.api.Table[OpenInnovatorsRow](_tableTag, "open_innovators") {
    def * = (projectId, name, position, message, department, departmentDescription, mission, career, logoUrl, modifiedAt, createdAt) <> (OpenInnovatorsRow.tupled, OpenInnovatorsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(projectId), name, position, message, department, departmentDescription, mission, career, logoUrl, Rep.Some(modifiedAt), Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> OpenInnovatorsRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10.get, _11.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column name SqlType(VARCHAR), Length(100,true) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(100,varying=true))
    /** Database column position SqlType(VARCHAR), Length(100,true) */
    val position: Rep[Option[String]] = column[Option[String]]("position", O.Length(100,varying=true))
    /** Database column message SqlType(TEXT), Length(65535,true) */
    val message: Rep[Option[String]] = column[Option[String]]("message", O.Length(65535,varying=true))
    /** Database column department SqlType(VARCHAR), Length(100,true) */
    val department: Rep[Option[String]] = column[Option[String]]("department", O.Length(100,varying=true))
    /** Database column department_description SqlType(TEXT), Length(65535,true) */
    val departmentDescription: Rep[Option[String]] = column[Option[String]]("department_description", O.Length(65535,varying=true))
    /** Database column mission SqlType(TEXT), Length(65535,true) */
    val mission: Rep[Option[String]] = column[Option[String]]("mission", O.Length(65535,varying=true))
    /** Database column career SqlType(TEXT), Length(65535,true) */
    val career: Rep[Option[String]] = column[Option[String]]("career", O.Length(65535,varying=true))
    /** Database column logo_url SqlType(VARCHAR), Length(200,true) */
    val logoUrl: Rep[Option[String]] = column[Option[String]]("logo_url", O.Length(200,varying=true))
    /** Database column modified_at SqlType(TIMESTAMP) */
    val modifiedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("modified_at")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")

    /** Foreign key referencing Projects (database name open_innovators_ibfk_1) */
    lazy val projectsFk = foreignKey("open_innovators_ibfk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table OpenInnovators */
  lazy val OpenInnovators = new TableQuery(tag => new OpenInnovators(tag))

  /** Entity class storing rows of table PickupPromotions
   *  @param promotionId Database column promotion_id SqlType(INT), PrimaryKey
   *  @param imageUrl Database column image_url SqlType(VARCHAR), Length(300,true)
   *  @param displayOrder Database column display_order SqlType(INT) */
  final case class PickupPromotionsRow(promotionId: Int, imageUrl: String, displayOrder: Int)
  /** GetResult implicit for fetching PickupPromotionsRow objects using plain SQL queries */
  implicit def GetResultPickupPromotionsRow(implicit e0: GR[Int], e1: GR[String]): GR[PickupPromotionsRow] = GR{
    prs => import prs._
    PickupPromotionsRow.tupled((<<[Int], <<[String], <<[Int]))
  }
  /** Table description of table pickup_promotions. Objects of this class serve as prototypes for rows in queries. */
  class PickupPromotions(_tableTag: Tag) extends profile.api.Table[PickupPromotionsRow](_tableTag, "pickup_promotions") {
    def * = (promotionId, imageUrl, displayOrder) <> (PickupPromotionsRow.tupled, PickupPromotionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(promotionId), Rep.Some(imageUrl), Rep.Some(displayOrder)).shaped.<>({r=>import r._; _1.map(_=> PickupPromotionsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column promotion_id SqlType(INT), PrimaryKey */
    val promotionId: Rep[Int] = column[Int]("promotion_id", O.PrimaryKey)
    /** Database column image_url SqlType(VARCHAR), Length(300,true) */
    val imageUrl: Rep[String] = column[String]("image_url", O.Length(300,varying=true))
    /** Database column display_order SqlType(INT) */
    val displayOrder: Rep[Int] = column[Int]("display_order")

    /** Foreign key referencing Promotions (database name pickup_promotions_ibfk_1) */
    lazy val promotionsFk = foreignKey("pickup_promotions_ibfk_1", promotionId, Promotions)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PickupPromotions */
  lazy val PickupPromotions = new TableQuery(tag => new PickupPromotions(tag))

  /** Entity class storing rows of table PkshaCompanyRecommendHistories
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param userId Database column user_id SqlType(INT)
   *  @param recommendedAt Database column recommended_at SqlType(TIMESTAMP)
   *  @param status Database column status SqlType(VARCHAR), Length(10,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class PkshaCompanyRecommendHistoriesRow(id: Option[Int] = None, userId: Int, recommendedAt: Option[DateTime], status: String, createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching PkshaCompanyRecommendHistoriesRow objects using plain SQL queries */
  implicit def GetResultPkshaCompanyRecommendHistoriesRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[Option[DateTime]], e3: GR[String]): GR[PkshaCompanyRecommendHistoriesRow] = GR{
    prs => import prs._
    PkshaCompanyRecommendHistoriesRow.tupled((<<?[Int], <<[Int], <<[Option[DateTime]], <<[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table pksha_company_recommend_histories. Objects of this class serve as prototypes for rows in queries. */
  class PkshaCompanyRecommendHistories(_tableTag: Tag) extends profile.api.Table[PkshaCompanyRecommendHistoriesRow](_tableTag, "pksha_company_recommend_histories") {
    def * = (Rep.Some(id), userId, recommendedAt, status, createdAt, updatedAt) <> (PkshaCompanyRecommendHistoriesRow.tupled, PkshaCompanyRecommendHistoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(userId), Rep.Some(recommendedAt), Rep.Some(status), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> PkshaCompanyRecommendHistoriesRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column user_id SqlType(INT) */
    val userId: Rep[Int] = column[Int]("user_id")
    /** Database column recommended_at SqlType(TIMESTAMP) */
    val recommendedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("recommended_at")
    /** Database column status SqlType(VARCHAR), Length(10,true) */
    val status: Rep[String] = column[String]("status", O.Length(10,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table PkshaCompanyRecommendHistories */
  lazy val PkshaCompanyRecommendHistories = new TableQuery(tag => new PkshaCompanyRecommendHistories(tag))

  /** Entity class storing rows of table PkshaCompanyRecommendHistoryDetails
   *  @param pkshaCompanyRecommendHistoryId Database column pksha_company_recommend_history_id SqlType(INT)
   *  @param recommenderCompanyId Database column recommender_company_id SqlType(INT)
   *  @param recommendedCompanyId Database column recommended_company_id SqlType(INT)
   *  @param notificationId Database column notification_id SqlType(INT)
   *  @param status Database column status SqlType(VARCHAR), Length(100,true)
   *  @param body Database column body SqlType(TEXT), Length(65535,true) */
  final case class PkshaCompanyRecommendHistoryDetailsRow(pkshaCompanyRecommendHistoryId: Int, recommenderCompanyId: Int, recommendedCompanyId: Option[Int], notificationId: Option[Int], status: String, body: Option[String])
  /** GetResult implicit for fetching PkshaCompanyRecommendHistoryDetailsRow objects using plain SQL queries */
  implicit def GetResultPkshaCompanyRecommendHistoryDetailsRow(implicit e0: GR[Int], e1: GR[Option[Int]], e2: GR[String], e3: GR[Option[String]]): GR[PkshaCompanyRecommendHistoryDetailsRow] = GR{
    prs => import prs._
    PkshaCompanyRecommendHistoryDetailsRow.tupled((<<[Int], <<[Int], <<?[Int], <<?[Int], <<[String], <<?[String]))
  }
  /** Table description of table pksha_company_recommend_history_details. Objects of this class serve as prototypes for rows in queries. */
  class PkshaCompanyRecommendHistoryDetails(_tableTag: Tag) extends profile.api.Table[PkshaCompanyRecommendHistoryDetailsRow](_tableTag, "pksha_company_recommend_history_details") {
    def * = (pkshaCompanyRecommendHistoryId, recommenderCompanyId, recommendedCompanyId, notificationId, status, body) <> (PkshaCompanyRecommendHistoryDetailsRow.tupled, PkshaCompanyRecommendHistoryDetailsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(pkshaCompanyRecommendHistoryId), Rep.Some(recommenderCompanyId), recommendedCompanyId, notificationId, Rep.Some(status), body).shaped.<>({r=>import r._; _1.map(_=> PkshaCompanyRecommendHistoryDetailsRow.tupled((_1.get, _2.get, _3, _4, _5.get, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column pksha_company_recommend_history_id SqlType(INT) */
    val pkshaCompanyRecommendHistoryId: Rep[Int] = column[Int]("pksha_company_recommend_history_id")
    /** Database column recommender_company_id SqlType(INT) */
    val recommenderCompanyId: Rep[Int] = column[Int]("recommender_company_id")
    /** Database column recommended_company_id SqlType(INT) */
    val recommendedCompanyId: Rep[Option[Int]] = column[Option[Int]]("recommended_company_id")
    /** Database column notification_id SqlType(INT) */
    val notificationId: Rep[Option[Int]] = column[Option[Int]]("notification_id")
    /** Database column status SqlType(VARCHAR), Length(100,true) */
    val status: Rep[String] = column[String]("status", O.Length(100,varying=true))
    /** Database column body SqlType(TEXT), Length(65535,true) */
    val body: Rep[Option[String]] = column[Option[String]]("body", O.Length(65535,varying=true))

    /** Foreign key referencing Companies (database name recommender_company_id_fk_1) */
    lazy val companiesFk1 = foreignKey("recommender_company_id_fk_1", recommenderCompanyId, Companies)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Companies (database name recommender_company_id_fk_2) */
    lazy val companiesFk2 = foreignKey("recommender_company_id_fk_2", recommendedCompanyId, Companies)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PkshaCompanyRecommendHistoryDetails */
  lazy val PkshaCompanyRecommendHistoryDetails = new TableQuery(tag => new PkshaCompanyRecommendHistoryDetails(tag))

  /** Entity class storing rows of table PrivateInformations
   *  @param projectId Database column project_id SqlType(INT), PrimaryKey
   *  @param resources Database column resources SqlType(VARCHAR), Length(1000,true)
   *  @param needs Database column needs SqlType(VARCHAR), Length(1000,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class PrivateInformationsRow(projectId: Int, resources: String, needs: String, createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching PrivateInformationsRow objects using plain SQL queries */
  implicit def GetResultPrivateInformationsRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[DateTime]]): GR[PrivateInformationsRow] = GR{
    prs => import prs._
    PrivateInformationsRow.tupled((<<[Int], <<[String], <<[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table private_informations. Objects of this class serve as prototypes for rows in queries. */
  class PrivateInformations(_tableTag: Tag) extends profile.api.Table[PrivateInformationsRow](_tableTag, "private_informations") {
    def * = (projectId, resources, needs, createdAt, updatedAt) <> (PrivateInformationsRow.tupled, PrivateInformationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(projectId), Rep.Some(resources), Rep.Some(needs), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> PrivateInformationsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column project_id SqlType(INT), PrimaryKey */
    val projectId: Rep[Int] = column[Int]("project_id", O.PrimaryKey)
    /** Database column resources SqlType(VARCHAR), Length(1000,true) */
    val resources: Rep[String] = column[String]("resources", O.Length(1000,varying=true))
    /** Database column needs SqlType(VARCHAR), Length(1000,true) */
    val needs: Rep[String] = column[String]("needs", O.Length(1000,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Foreign key referencing Projects (database name project_id_fk_1) */
    lazy val projectsFk = foreignKey("project_id_fk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PrivateInformations */
  lazy val PrivateInformations = new TableQuery(tag => new PrivateInformations(tag))

  /** Entity class storing rows of table ProjectDescriptions
   *  @param projectId Database column project_id SqlType(INT), PrimaryKey
   *  @param description Database column description SqlType(TEXT), Length(65535,true) */
  final case class ProjectDescriptionsRow(projectId: Int, description: String)
  /** GetResult implicit for fetching ProjectDescriptionsRow objects using plain SQL queries */
  implicit def GetResultProjectDescriptionsRow(implicit e0: GR[Int], e1: GR[String]): GR[ProjectDescriptionsRow] = GR{
    prs => import prs._
    ProjectDescriptionsRow.tupled((<<[Int], <<[String]))
  }
  /** Table description of table project_descriptions. Objects of this class serve as prototypes for rows in queries. */
  class ProjectDescriptions(_tableTag: Tag) extends profile.api.Table[ProjectDescriptionsRow](_tableTag, "project_descriptions") {
    def * = (projectId, description) <> (ProjectDescriptionsRow.tupled, ProjectDescriptionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(projectId), Rep.Some(description)).shaped.<>({r=>import r._; _1.map(_=> ProjectDescriptionsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column project_id SqlType(INT), PrimaryKey */
    val projectId: Rep[Int] = column[Int]("project_id", O.PrimaryKey)
    /** Database column description SqlType(TEXT), Length(65535,true) */
    val description: Rep[String] = column[String]("description", O.Length(65535,varying=true))

    /** Foreign key referencing Projects (database name project_descriptions_fk) */
    lazy val projectsFk = foreignKey("project_descriptions_fk", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ProjectDescriptions */
  lazy val ProjectDescriptions = new TableQuery(tag => new ProjectDescriptions(tag))

  /** Entity class storing rows of table ProjectNeedsSmallTags
   *  @param projectId Database column project_id SqlType(INT)
   *  @param smallTagId Database column small_tag_id SqlType(INT) */
  final case class ProjectNeedsSmallTagsRow(projectId: Int, smallTagId: Int)
  /** GetResult implicit for fetching ProjectNeedsSmallTagsRow objects using plain SQL queries */
  implicit def GetResultProjectNeedsSmallTagsRow(implicit e0: GR[Int]): GR[ProjectNeedsSmallTagsRow] = GR{
    prs => import prs._
    ProjectNeedsSmallTagsRow.tupled((<<[Int], <<[Int]))
  }
  /** Table description of table project_needs_small_tags. Objects of this class serve as prototypes for rows in queries. */
  class ProjectNeedsSmallTags(_tableTag: Tag) extends profile.api.Table[ProjectNeedsSmallTagsRow](_tableTag, "project_needs_small_tags") {
    def * = (projectId, smallTagId) <> (ProjectNeedsSmallTagsRow.tupled, ProjectNeedsSmallTagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(projectId), Rep.Some(smallTagId)).shaped.<>({r=>import r._; _1.map(_=> ProjectNeedsSmallTagsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column small_tag_id SqlType(INT) */
    val smallTagId: Rep[Int] = column[Int]("small_tag_id")

    /** Primary key of ProjectNeedsSmallTags (database name PRIMARY) */
    val pk = primaryKey("PRIMARY", (projectId, smallTagId))

    /** Foreign key referencing Projects (database name project_needs_small_tags_fk_1) */
    lazy val projectsFk = foreignKey("project_needs_small_tags_fk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing SmallTags (database name project_needs_small_tags_fk_2) */
    lazy val smallTagsFk = foreignKey("project_needs_small_tags_fk_2", smallTagId, SmallTags)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ProjectNeedsSmallTags */
  lazy val ProjectNeedsSmallTags = new TableQuery(tag => new ProjectNeedsSmallTags(tag))

  /** Entity class storing rows of table ProjectPrSmallTags
   *  @param projectId Database column project_id SqlType(INT)
   *  @param smallTagId Database column small_tag_id SqlType(INT) */
  final case class ProjectPrSmallTagsRow(projectId: Int, smallTagId: Int)
  /** GetResult implicit for fetching ProjectPrSmallTagsRow objects using plain SQL queries */
  implicit def GetResultProjectPrSmallTagsRow(implicit e0: GR[Int]): GR[ProjectPrSmallTagsRow] = GR{
    prs => import prs._
    ProjectPrSmallTagsRow.tupled((<<[Int], <<[Int]))
  }
  /** Table description of table project_pr_small_tags. Objects of this class serve as prototypes for rows in queries. */
  class ProjectPrSmallTags(_tableTag: Tag) extends profile.api.Table[ProjectPrSmallTagsRow](_tableTag, "project_pr_small_tags") {
    def * = (projectId, smallTagId) <> (ProjectPrSmallTagsRow.tupled, ProjectPrSmallTagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(projectId), Rep.Some(smallTagId)).shaped.<>({r=>import r._; _1.map(_=> ProjectPrSmallTagsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column small_tag_id SqlType(INT) */
    val smallTagId: Rep[Int] = column[Int]("small_tag_id")

    /** Primary key of ProjectPrSmallTags (database name PRIMARY) */
    val pk = primaryKey("PRIMARY", (projectId, smallTagId))

    /** Foreign key referencing Projects (database name project_pr_small_tags_fk_1) */
    lazy val projectsFk = foreignKey("project_pr_small_tags_fk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing SmallTags (database name project_pr_small_tags_fk_2) */
    lazy val smallTagsFk = foreignKey("project_pr_small_tags_fk_2", smallTagId, SmallTags)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ProjectPrSmallTags */
  lazy val ProjectPrSmallTags = new TableQuery(tag => new ProjectPrSmallTags(tag))

  /** Entity class storing rows of table ProjectRecommends
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param projectId Database column project_id SqlType(INT)
   *  @param recommendId Database column recommend_id SqlType(INT)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class ProjectRecommendsRow(id: Option[Int] = None, projectId: Int, recommendId: Int, createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching ProjectRecommendsRow objects using plain SQL queries */
  implicit def GetResultProjectRecommendsRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[Option[DateTime]]): GR[ProjectRecommendsRow] = GR{
    prs => import prs._
    ProjectRecommendsRow.tupled((<<?[Int], <<[Int], <<[Int], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table project_recommends. Objects of this class serve as prototypes for rows in queries. */
  class ProjectRecommends(_tableTag: Tag) extends profile.api.Table[ProjectRecommendsRow](_tableTag, "project_recommends") {
    def * = (Rep.Some(id), projectId, recommendId, createdAt, updatedAt) <> (ProjectRecommendsRow.tupled, ProjectRecommendsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(projectId), Rep.Some(recommendId), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> ProjectRecommendsRow.tupled((_1, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column recommend_id SqlType(INT) */
    val recommendId: Rep[Int] = column[Int]("recommend_id")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Foreign key referencing Projects (database name project_recommend_project_id_fk_1) */
    lazy val projectsFk1 = foreignKey("project_recommend_project_id_fk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Projects (database name project_recommend_recommend_id_fk_1) */
    lazy val projectsFk2 = foreignKey("project_recommend_recommend_id_fk_1", recommendId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (projectId,recommendId) (database name project_recommend_multiple_unique) */
    val index1 = index("project_recommend_multiple_unique", (projectId, recommendId), unique=true)
  }
  /** Collection-like TableQuery object for table ProjectRecommends */
  lazy val ProjectRecommends = new TableQuery(tag => new ProjectRecommends(tag))

  /** Entity class storing rows of table ProjectRoles
   *  @param id Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class ProjectRolesRow(id: Option[Int] = None, name: String, createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching ProjectRolesRow objects using plain SQL queries */
  implicit def GetResultProjectRolesRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[DateTime]]): GR[ProjectRolesRow] = GR{
    prs => import prs._
    ProjectRolesRow.tupled((<<?[Int], <<[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table project_roles. Objects of this class serve as prototypes for rows in queries. */
  class ProjectRoles(_tableTag: Tag) extends profile.api.Table[ProjectRolesRow](_tableTag, "project_roles") {
    def * = (Rep.Some(id), name, createdAt, updatedAt) <> (ProjectRolesRow.tupled, ProjectRolesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> ProjectRolesRow.tupled((_1, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT UNSIGNED), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table ProjectRoles */
  lazy val ProjectRoles = new TableQuery(tag => new ProjectRoles(tag))

  /** Entity class storing rows of table Projects
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param companyId Database column company_id SqlType(INT)
   *  @param name Database column name SqlType(VARCHAR), Length(200,true)
   *  @param logoUrl Database column logo_url SqlType(VARCHAR), Length(200,true)
   *  @param isValid Database column is_valid SqlType(BIT)
   *  @param isPublished Database column is_published SqlType(BIT)
   *  @param isPremium Database column is_premium SqlType(BIT)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class ProjectsRow(id: Option[Int] = None, companyId: Int, name: String, logoUrl: Option[String], isValid: Boolean, isPublished: Boolean, isPremium: Boolean, createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching ProjectsRow objects using plain SQL queries */
  implicit def GetResultProjectsRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[String], e3: GR[Option[String]], e4: GR[Boolean], e5: GR[Option[DateTime]]): GR[ProjectsRow] = GR{
    prs => import prs._
    ProjectsRow.tupled((<<?[Int], <<[Int], <<[String], <<?[String], <<[Boolean], <<[Boolean], <<[Boolean], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table projects. Objects of this class serve as prototypes for rows in queries. */
  class Projects(_tableTag: Tag) extends profile.api.Table[ProjectsRow](_tableTag, "projects") {
    def * = (Rep.Some(id), companyId, name, logoUrl, isValid, isPublished, isPremium, createdAt, updatedAt) <> (ProjectsRow.tupled, ProjectsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(companyId), Rep.Some(name), logoUrl, Rep.Some(isValid), Rep.Some(isPublished), Rep.Some(isPremium), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> ProjectsRow.tupled((_1, _2.get, _3.get, _4, _5.get, _6.get, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column company_id SqlType(INT) */
    val companyId: Rep[Int] = column[Int]("company_id")
    /** Database column name SqlType(VARCHAR), Length(200,true) */
    val name: Rep[String] = column[String]("name", O.Length(200,varying=true))
    /** Database column logo_url SqlType(VARCHAR), Length(200,true) */
    val logoUrl: Rep[Option[String]] = column[Option[String]]("logo_url", O.Length(200,varying=true))
    /** Database column is_valid SqlType(BIT) */
    val isValid: Rep[Boolean] = column[Boolean]("is_valid")
    /** Database column is_published SqlType(BIT) */
    val isPublished: Rep[Boolean] = column[Boolean]("is_published")
    /** Database column is_premium SqlType(BIT) */
    val isPremium: Rep[Boolean] = column[Boolean]("is_premium")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table Projects */
  lazy val Projects = new TableQuery(tag => new Projects(tag))

  /** Entity class storing rows of table ProjectTags
   *  @param projectId Database column project_id SqlType(INT)
   *  @param tagId Database column tag_id SqlType(INT) */
  final case class ProjectTagsRow(projectId: Int, tagId: Int)
  /** GetResult implicit for fetching ProjectTagsRow objects using plain SQL queries */
  implicit def GetResultProjectTagsRow(implicit e0: GR[Int]): GR[ProjectTagsRow] = GR{
    prs => import prs._
    ProjectTagsRow.tupled((<<[Int], <<[Int]))
  }
  /** Table description of table project_tags. Objects of this class serve as prototypes for rows in queries. */
  class ProjectTags(_tableTag: Tag) extends profile.api.Table[ProjectTagsRow](_tableTag, "project_tags") {
    def * = (projectId, tagId) <> (ProjectTagsRow.tupled, ProjectTagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(projectId), Rep.Some(tagId)).shaped.<>({r=>import r._; _1.map(_=> ProjectTagsRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column tag_id SqlType(INT) */
    val tagId: Rep[Int] = column[Int]("tag_id")

    /** Foreign key referencing Projects (database name project_tags_fk_1) */
    lazy val projectsFk = foreignKey("project_tags_fk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ProjectTags */
  lazy val ProjectTags = new TableQuery(tag => new ProjectTags(tag))

  /** Entity class storing rows of table ProjectUsers
   *  @param projectId Database column project_id SqlType(INT)
   *  @param companyUserId Database column company_user_id SqlType(INT)
   *  @param projectRoleId Database column project_role_id SqlType(INT UNSIGNED), Default(1)
   *  @param isSelected Database column is_selected SqlType(BIT) */
  final case class ProjectUsersRow(projectId: Int, companyUserId: Int, projectRoleId: Int = 1, isSelected: Boolean)
  /** GetResult implicit for fetching ProjectUsersRow objects using plain SQL queries */
  implicit def GetResultProjectUsersRow(implicit e0: GR[Int], e1: GR[Boolean]): GR[ProjectUsersRow] = GR{
    prs => import prs._
    ProjectUsersRow.tupled((<<[Int], <<[Int], <<[Int], <<[Boolean]))
  }
  /** Table description of table project_users. Objects of this class serve as prototypes for rows in queries. */
  class ProjectUsers(_tableTag: Tag) extends profile.api.Table[ProjectUsersRow](_tableTag, "project_users") {
    def * = (projectId, companyUserId, projectRoleId, isSelected) <> (ProjectUsersRow.tupled, ProjectUsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(projectId), Rep.Some(companyUserId), Rep.Some(projectRoleId), Rep.Some(isSelected)).shaped.<>({r=>import r._; _1.map(_=> ProjectUsersRow.tupled((_1.get, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column company_user_id SqlType(INT) */
    val companyUserId: Rep[Int] = column[Int]("company_user_id")
    /** Database column project_role_id SqlType(INT UNSIGNED), Default(1) */
    val projectRoleId: Rep[Int] = column[Int]("project_role_id", O.Default(1))
    /** Database column is_selected SqlType(BIT) */
    val isSelected: Rep[Boolean] = column[Boolean]("is_selected")

    /** Foreign key referencing CompanyUsers (database name project_users_fk_2) */
    lazy val companyUsersFk = foreignKey("project_users_fk_2", companyUserId, CompanyUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing ProjectRoles (database name project_users_fk_3) */
    lazy val projectRolesFk = foreignKey("project_users_fk_3", projectRoleId, ProjectRoles)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Projects (database name project_users_fk_1) */
    lazy val projectsFk = foreignKey("project_users_fk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (projectId,companyUserId) (database name project_id) */
    val index1 = index("project_id", (projectId, companyUserId), unique=true)
  }
  /** Collection-like TableQuery object for table ProjectUsers */
  lazy val ProjectUsers = new TableQuery(tag => new ProjectUsers(tag))

  /** Entity class storing rows of table PromotionHistories
   *  @param id Database column id SqlType(INT)
   *  @param title Database column title SqlType(TEXT), Length(65535,true)
   *  @param goal Database column goal SqlType(TEXT), Length(65535,true)
   *  @param message Database column message SqlType(TEXT), Length(65535,true)
   *  @param achievement Database column achievement SqlType(TEXT), Length(65535,true)
   *  @param premiumImage Database column premium_image SqlType(VARCHAR), Length(200,true)
   *  @param premiumImageSp Database column premium_image_sp SqlType(VARCHAR), Length(200,true)
   *  @param requirements Database column requirements SqlType(TEXT), Length(65535,true)
   *  @param businessDescription Database column business_description SqlType(TEXT), Length(65535,true)
   *  @param premiumWeight Database column premium_weight SqlType(INT)
   *  @param sortAdjustmentParameter Database column sort_adjustment_parameter SqlType(INT)
   *  @param modifiedAt Database column modified_at SqlType(TIMESTAMP)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP) */
  final case class PromotionHistoriesRow(id: Int, title: Option[String], goal: Option[String], message: Option[String], achievement: Option[String], premiumImage: Option[String], premiumImageSp: Option[String], requirements: Option[String], businessDescription: Option[String], premiumWeight: Option[Int], sortAdjustmentParameter: Option[Int], modifiedAt: Option[DateTime], createdAt: Option[DateTime])
  /** GetResult implicit for fetching PromotionHistoriesRow objects using plain SQL queries */
  implicit def GetResultPromotionHistoriesRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[Int]], e3: GR[Option[DateTime]]): GR[PromotionHistoriesRow] = GR{
    prs => import prs._
    PromotionHistoriesRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[Int], <<?[Int], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table promotion_histories. Objects of this class serve as prototypes for rows in queries. */
  class PromotionHistories(_tableTag: Tag) extends profile.api.Table[PromotionHistoriesRow](_tableTag, "promotion_histories") {
    def * = (id, title, goal, message, achievement, premiumImage, premiumImageSp, requirements, businessDescription, premiumWeight, sortAdjustmentParameter, modifiedAt, createdAt) <> (PromotionHistoriesRow.tupled, PromotionHistoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), title, goal, message, achievement, premiumImage, premiumImageSp, requirements, businessDescription, premiumWeight, sortAdjustmentParameter, Rep.Some(modifiedAt), Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> PromotionHistoriesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12.get, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT) */
    val id: Rep[Int] = column[Int]("id")
    /** Database column title SqlType(TEXT), Length(65535,true) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Length(65535,varying=true))
    /** Database column goal SqlType(TEXT), Length(65535,true) */
    val goal: Rep[Option[String]] = column[Option[String]]("goal", O.Length(65535,varying=true))
    /** Database column message SqlType(TEXT), Length(65535,true) */
    val message: Rep[Option[String]] = column[Option[String]]("message", O.Length(65535,varying=true))
    /** Database column achievement SqlType(TEXT), Length(65535,true) */
    val achievement: Rep[Option[String]] = column[Option[String]]("achievement", O.Length(65535,varying=true))
    /** Database column premium_image SqlType(VARCHAR), Length(200,true) */
    val premiumImage: Rep[Option[String]] = column[Option[String]]("premium_image", O.Length(200,varying=true))
    /** Database column premium_image_sp SqlType(VARCHAR), Length(200,true) */
    val premiumImageSp: Rep[Option[String]] = column[Option[String]]("premium_image_sp", O.Length(200,varying=true))
    /** Database column requirements SqlType(TEXT), Length(65535,true) */
    val requirements: Rep[Option[String]] = column[Option[String]]("requirements", O.Length(65535,varying=true))
    /** Database column business_description SqlType(TEXT), Length(65535,true) */
    val businessDescription: Rep[Option[String]] = column[Option[String]]("business_description", O.Length(65535,varying=true))
    /** Database column premium_weight SqlType(INT) */
    val premiumWeight: Rep[Option[Int]] = column[Option[Int]]("premium_weight")
    /** Database column sort_adjustment_parameter SqlType(INT) */
    val sortAdjustmentParameter: Rep[Option[Int]] = column[Option[Int]]("sort_adjustment_parameter")
    /** Database column modified_at SqlType(TIMESTAMP) */
    val modifiedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("modified_at")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
  }
  /** Collection-like TableQuery object for table PromotionHistories */
  lazy val PromotionHistories = new TableQuery(tag => new PromotionHistories(tag))

  /** Entity class storing rows of table PromotionImages
   *  @param promotionId Database column promotion_id SqlType(INT)
   *  @param imageText1 Database column image_text1 SqlType(VARCHAR), Length(50,true)
   *  @param imageText2 Database column image_text2 SqlType(VARCHAR), Length(50,true)
   *  @param imageText3 Database column image_text3 SqlType(VARCHAR), Length(50,true)
   *  @param image1Url Database column image1_url SqlType(VARCHAR), Length(200,true)
   *  @param image2Url Database column image2_url SqlType(VARCHAR), Length(200,true)
   *  @param image3Url Database column image3_url SqlType(VARCHAR), Length(200,true) */
  final case class PromotionImagesRow(promotionId: Int, imageText1: Option[String], imageText2: Option[String], imageText3: Option[String], image1Url: Option[String], image2Url: Option[String], image3Url: Option[String])
  /** GetResult implicit for fetching PromotionImagesRow objects using plain SQL queries */
  implicit def GetResultPromotionImagesRow(implicit e0: GR[Int], e1: GR[Option[String]]): GR[PromotionImagesRow] = GR{
    prs => import prs._
    PromotionImagesRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table promotion_images. Objects of this class serve as prototypes for rows in queries. */
  class PromotionImages(_tableTag: Tag) extends profile.api.Table[PromotionImagesRow](_tableTag, "promotion_images") {
    def * = (promotionId, imageText1, imageText2, imageText3, image1Url, image2Url, image3Url) <> (PromotionImagesRow.tupled, PromotionImagesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(promotionId), imageText1, imageText2, imageText3, image1Url, image2Url, image3Url).shaped.<>({r=>import r._; _1.map(_=> PromotionImagesRow.tupled((_1.get, _2, _3, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column promotion_id SqlType(INT) */
    val promotionId: Rep[Int] = column[Int]("promotion_id")
    /** Database column image_text1 SqlType(VARCHAR), Length(50,true) */
    val imageText1: Rep[Option[String]] = column[Option[String]]("image_text1", O.Length(50,varying=true))
    /** Database column image_text2 SqlType(VARCHAR), Length(50,true) */
    val imageText2: Rep[Option[String]] = column[Option[String]]("image_text2", O.Length(50,varying=true))
    /** Database column image_text3 SqlType(VARCHAR), Length(50,true) */
    val imageText3: Rep[Option[String]] = column[Option[String]]("image_text3", O.Length(50,varying=true))
    /** Database column image1_url SqlType(VARCHAR), Length(200,true) */
    val image1Url: Rep[Option[String]] = column[Option[String]]("image1_url", O.Length(200,varying=true))
    /** Database column image2_url SqlType(VARCHAR), Length(200,true) */
    val image2Url: Rep[Option[String]] = column[Option[String]]("image2_url", O.Length(200,varying=true))
    /** Database column image3_url SqlType(VARCHAR), Length(200,true) */
    val image3Url: Rep[Option[String]] = column[Option[String]]("image3_url", O.Length(200,varying=true))

    /** Foreign key referencing Promotions (database name promotion_images_fk_1) */
    lazy val promotionsFk = foreignKey("promotion_images_fk_1", promotionId, Promotions)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PromotionImages */
  lazy val PromotionImages = new TableQuery(tag => new PromotionImages(tag))

  /** Entity class storing rows of table PromotionResourceHistories
   *  @param promotionId Database column promotion_id SqlType(INT)
   *  @param resource1 Database column resource1 SqlType(TEXT), Length(65535,true)
   *  @param resource2 Database column resource2 SqlType(TEXT), Length(65535,true)
   *  @param resource3 Database column resource3 SqlType(TEXT), Length(65535,true)
   *  @param modifiedAt Database column modified_at SqlType(TIMESTAMP)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP) */
  final case class PromotionResourceHistoriesRow(promotionId: Int, resource1: Option[String], resource2: Option[String], resource3: Option[String], modifiedAt: Option[DateTime], createdAt: Option[DateTime])
  /** GetResult implicit for fetching PromotionResourceHistoriesRow objects using plain SQL queries */
  implicit def GetResultPromotionResourceHistoriesRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[DateTime]]): GR[PromotionResourceHistoriesRow] = GR{
    prs => import prs._
    PromotionResourceHistoriesRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table promotion_resource_histories. Objects of this class serve as prototypes for rows in queries. */
  class PromotionResourceHistories(_tableTag: Tag) extends profile.api.Table[PromotionResourceHistoriesRow](_tableTag, "promotion_resource_histories") {
    def * = (promotionId, resource1, resource2, resource3, modifiedAt, createdAt) <> (PromotionResourceHistoriesRow.tupled, PromotionResourceHistoriesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(promotionId), resource1, resource2, resource3, Rep.Some(modifiedAt), Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> PromotionResourceHistoriesRow.tupled((_1.get, _2, _3, _4, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column promotion_id SqlType(INT) */
    val promotionId: Rep[Int] = column[Int]("promotion_id")
    /** Database column resource1 SqlType(TEXT), Length(65535,true) */
    val resource1: Rep[Option[String]] = column[Option[String]]("resource1", O.Length(65535,varying=true))
    /** Database column resource2 SqlType(TEXT), Length(65535,true) */
    val resource2: Rep[Option[String]] = column[Option[String]]("resource2", O.Length(65535,varying=true))
    /** Database column resource3 SqlType(TEXT), Length(65535,true) */
    val resource3: Rep[Option[String]] = column[Option[String]]("resource3", O.Length(65535,varying=true))
    /** Database column modified_at SqlType(TIMESTAMP) */
    val modifiedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("modified_at")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
  }
  /** Collection-like TableQuery object for table PromotionResourceHistories */
  lazy val PromotionResourceHistories = new TableQuery(tag => new PromotionResourceHistories(tag))

  /** Entity class storing rows of table PromotionResources
   *  @param promotionId Database column promotion_id SqlType(INT)
   *  @param resource1 Database column resource1 SqlType(TEXT), Length(65535,true)
   *  @param resource2 Database column resource2 SqlType(TEXT), Length(65535,true)
   *  @param resource3 Database column resource3 SqlType(TEXT), Length(65535,true) */
  final case class PromotionResourcesRow(promotionId: Int, resource1: Option[String], resource2: Option[String], resource3: Option[String])
  /** GetResult implicit for fetching PromotionResourcesRow objects using plain SQL queries */
  implicit def GetResultPromotionResourcesRow(implicit e0: GR[Int], e1: GR[Option[String]]): GR[PromotionResourcesRow] = GR{
    prs => import prs._
    PromotionResourcesRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table promotion_resources. Objects of this class serve as prototypes for rows in queries. */
  class PromotionResources(_tableTag: Tag) extends profile.api.Table[PromotionResourcesRow](_tableTag, "promotion_resources") {
    def * = (promotionId, resource1, resource2, resource3) <> (PromotionResourcesRow.tupled, PromotionResourcesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(promotionId), resource1, resource2, resource3).shaped.<>({r=>import r._; _1.map(_=> PromotionResourcesRow.tupled((_1.get, _2, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column promotion_id SqlType(INT) */
    val promotionId: Rep[Int] = column[Int]("promotion_id")
    /** Database column resource1 SqlType(TEXT), Length(65535,true) */
    val resource1: Rep[Option[String]] = column[Option[String]]("resource1", O.Length(65535,varying=true))
    /** Database column resource2 SqlType(TEXT), Length(65535,true) */
    val resource2: Rep[Option[String]] = column[Option[String]]("resource2", O.Length(65535,varying=true))
    /** Database column resource3 SqlType(TEXT), Length(65535,true) */
    val resource3: Rep[Option[String]] = column[Option[String]]("resource3", O.Length(65535,varying=true))

    /** Foreign key referencing Promotions (database name promotion_resources_fk_1) */
    lazy val promotionsFk = foreignKey("promotion_resources_fk_1", promotionId, Promotions)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PromotionResources */
  lazy val PromotionResources = new TableQuery(tag => new PromotionResources(tag))

  /** Entity class storing rows of table Promotions
   *  @param id Database column id SqlType(INT), PrimaryKey
   *  @param title Database column title SqlType(TEXT), Length(65535,true)
   *  @param goal Database column goal SqlType(TEXT), Length(65535,true)
   *  @param message Database column message SqlType(TEXT), Length(65535,true)
   *  @param achievement Database column achievement SqlType(TEXT), Length(65535,true)
   *  @param premiumImage Database column premium_image SqlType(VARCHAR), Length(200,true)
   *  @param premiumImageSp Database column premium_image_sp SqlType(VARCHAR), Length(200,true)
   *  @param requirements Database column requirements SqlType(TEXT), Length(65535,true)
   *  @param businessDescription Database column business_description SqlType(TEXT), Length(65535,true)
   *  @param premiumWeight Database column premium_weight SqlType(INT), Default(10)
   *  @param sortAdjustmentParameter Database column sort_adjustment_parameter SqlType(INT), Default(0)
   *  @param modifiedAt Database column modified_at SqlType(TIMESTAMP)
   *  @param displayOrder Database column display_order SqlType(INT), Default(Some(0))
   *  @param createdAt Database column created_at SqlType(TIMESTAMP) */
  final case class PromotionsRow(id: Int, title: Option[String], goal: Option[String], message: Option[String], achievement: Option[String], premiumImage: Option[String], premiumImageSp: Option[String], requirements: Option[String], businessDescription: Option[String], premiumWeight: Int = 10, sortAdjustmentParameter: Int = 0, modifiedAt: Option[DateTime], displayOrder: Option[Int] = Some(0), createdAt: Option[DateTime])
  /** GetResult implicit for fetching PromotionsRow objects using plain SQL queries */
  implicit def GetResultPromotionsRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[Option[DateTime]], e3: GR[Option[Int]]): GR[PromotionsRow] = GR{
    prs => import prs._
    PromotionsRow.tupled((<<[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[Int], <<[Int], <<[Option[DateTime]], <<?[Int], <<[Option[DateTime]]))
  }
  /** Table description of table promotions. Objects of this class serve as prototypes for rows in queries. */
  class Promotions(_tableTag: Tag) extends profile.api.Table[PromotionsRow](_tableTag, "promotions") {
    def * = (id, title, goal, message, achievement, premiumImage, premiumImageSp, requirements, businessDescription, premiumWeight, sortAdjustmentParameter, modifiedAt, displayOrder, createdAt) <> (PromotionsRow.tupled, PromotionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), title, goal, message, achievement, premiumImage, premiumImageSp, requirements, businessDescription, Rep.Some(premiumWeight), Rep.Some(sortAdjustmentParameter), Rep.Some(modifiedAt), displayOrder, Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> PromotionsRow.tupled((_1.get, _2, _3, _4, _5, _6, _7, _8, _9, _10.get, _11.get, _12.get, _13, _14.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column title SqlType(TEXT), Length(65535,true) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Length(65535,varying=true))
    /** Database column goal SqlType(TEXT), Length(65535,true) */
    val goal: Rep[Option[String]] = column[Option[String]]("goal", O.Length(65535,varying=true))
    /** Database column message SqlType(TEXT), Length(65535,true) */
    val message: Rep[Option[String]] = column[Option[String]]("message", O.Length(65535,varying=true))
    /** Database column achievement SqlType(TEXT), Length(65535,true) */
    val achievement: Rep[Option[String]] = column[Option[String]]("achievement", O.Length(65535,varying=true))
    /** Database column premium_image SqlType(VARCHAR), Length(200,true) */
    val premiumImage: Rep[Option[String]] = column[Option[String]]("premium_image", O.Length(200,varying=true))
    /** Database column premium_image_sp SqlType(VARCHAR), Length(200,true) */
    val premiumImageSp: Rep[Option[String]] = column[Option[String]]("premium_image_sp", O.Length(200,varying=true))
    /** Database column requirements SqlType(TEXT), Length(65535,true) */
    val requirements: Rep[Option[String]] = column[Option[String]]("requirements", O.Length(65535,varying=true))
    /** Database column business_description SqlType(TEXT), Length(65535,true) */
    val businessDescription: Rep[Option[String]] = column[Option[String]]("business_description", O.Length(65535,varying=true))
    /** Database column premium_weight SqlType(INT), Default(10) */
    val premiumWeight: Rep[Int] = column[Int]("premium_weight", O.Default(10))
    /** Database column sort_adjustment_parameter SqlType(INT), Default(0) */
    val sortAdjustmentParameter: Rep[Int] = column[Int]("sort_adjustment_parameter", O.Default(0))
    /** Database column modified_at SqlType(TIMESTAMP) */
    val modifiedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("modified_at")
    /** Database column display_order SqlType(INT), Default(Some(0)) */
    val displayOrder: Rep[Option[Int]] = column[Option[Int]]("display_order", O.Default(Some(0)))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")

    /** Foreign key referencing Projects (database name promotions_fk_1) */
    lazy val projectsFk = foreignKey("promotions_fk_1", id, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Promotions */
  lazy val Promotions = new TableQuery(tag => new Promotions(tag))

  /** Entity class storing rows of table PrRejectReason
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param companyId Database column company_id SqlType(INT)
   *  @param memo Database column memo SqlType(TEXT), Length(65535,true)
   *  @param created Database column created SqlType(TIMESTAMP) */
  final case class PrRejectReasonRow(id: Option[Int] = None, companyId: Int, memo: Option[String], created: Option[DateTime])
  /** GetResult implicit for fetching PrRejectReasonRow objects using plain SQL queries */
  implicit def GetResultPrRejectReasonRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[Option[String]], e3: GR[Option[DateTime]]): GR[PrRejectReasonRow] = GR{
    prs => import prs._
    PrRejectReasonRow.tupled((<<?[Int], <<[Int], <<?[String], <<[Option[DateTime]]))
  }
  /** Table description of table pr_reject_reason. Objects of this class serve as prototypes for rows in queries. */
  class PrRejectReason(_tableTag: Tag) extends profile.api.Table[PrRejectReasonRow](_tableTag, "pr_reject_reason") {
    def * = (Rep.Some(id), companyId, memo, created) <> (PrRejectReasonRow.tupled, PrRejectReasonRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(companyId), memo, Rep.Some(created)).shaped.<>({r=>import r._; _1.map(_=> PrRejectReasonRow.tupled((_1, _2.get, _3, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column company_id SqlType(INT) */
    val companyId: Rep[Int] = column[Int]("company_id")
    /** Database column memo SqlType(TEXT), Length(65535,true) */
    val memo: Rep[Option[String]] = column[Option[String]]("memo", O.Length(65535,varying=true))
    /** Database column created SqlType(TIMESTAMP) */
    val created: Rep[Option[DateTime]] = column[Option[DateTime]]("created")

    /** Foreign key referencing Companies (database name pr_reject_reason_ibfk_1) */
    lazy val companiesFk = foreignKey("pr_reject_reason_ibfk_1", companyId, Companies)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PrRejectReason */
  lazy val PrRejectReason = new TableQuery(tag => new PrRejectReason(tag))

  /** Entity class storing rows of table PublicinfoInputCounts
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param projectId Database column project_id SqlType(INT)
   *  @param bases Database column bases SqlType(INT)
   *  @param pr Database column pr SqlType(INT)
   *  @param needs Database column needs SqlType(INT)
   *  @param openInnovator Database column open_innovator SqlType(INT)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class PublicinfoInputCountsRow(id: Option[Int] = None, projectId: Int, bases: Int, pr: Int, needs: Int, openInnovator: Int, createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching PublicinfoInputCountsRow objects using plain SQL queries */
  implicit def GetResultPublicinfoInputCountsRow(implicit e0: GR[Option[Int]], e1: GR[Int], e2: GR[Option[DateTime]]): GR[PublicinfoInputCountsRow] = GR{
    prs => import prs._
    PublicinfoInputCountsRow.tupled((<<?[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Int], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table publicinfo_input_counts. Objects of this class serve as prototypes for rows in queries. */
  class PublicinfoInputCounts(_tableTag: Tag) extends profile.api.Table[PublicinfoInputCountsRow](_tableTag, "publicinfo_input_counts") {
    def * = (Rep.Some(id), projectId, bases, pr, needs, openInnovator, createdAt, updatedAt) <> (PublicinfoInputCountsRow.tupled, PublicinfoInputCountsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(projectId), Rep.Some(bases), Rep.Some(pr), Rep.Some(needs), Rep.Some(openInnovator), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> PublicinfoInputCountsRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column bases SqlType(INT) */
    val bases: Rep[Int] = column[Int]("bases")
    /** Database column pr SqlType(INT) */
    val pr: Rep[Int] = column[Int]("pr")
    /** Database column needs SqlType(INT) */
    val needs: Rep[Int] = column[Int]("needs")
    /** Database column open_innovator SqlType(INT) */
    val openInnovator: Rep[Int] = column[Int]("open_innovator")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Foreign key referencing Projects (database name publicinfo_input_counts_ibfk_1) */
    lazy val projectsFk = foreignKey("publicinfo_input_counts_ibfk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table PublicinfoInputCounts */
  lazy val PublicinfoInputCounts = new TableQuery(tag => new PublicinfoInputCounts(tag))

  /** Entity class storing rows of table PushNotifications
   *  @param id Database column id SqlType(INT), AutoInc
   *  @param title Database column title SqlType(VARCHAR), Length(255,true)
   *  @param body Database column body SqlType(VARCHAR), Length(1023,true)
   *  @param imageUrl Database column image_url SqlType(VARCHAR), Length(255,true)
   *  @param clickAction Database column click_action SqlType(VARCHAR), Length(255,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class PushNotificationsRow(id: Option[Int] = None, title: String, body: Option[String], imageUrl: Option[String], clickAction: Option[String], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching PushNotificationsRow objects using plain SQL queries */
  implicit def GetResultPushNotificationsRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[DateTime]]): GR[PushNotificationsRow] = GR{
    prs => import prs._
    PushNotificationsRow.tupled((<<?[Int], <<[String], <<?[String], <<?[String], <<?[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table push_notifications. Objects of this class serve as prototypes for rows in queries. */
  class PushNotifications(_tableTag: Tag) extends profile.api.Table[PushNotificationsRow](_tableTag, "push_notifications") {
    def * = (Rep.Some(id), title, body, imageUrl, clickAction, createdAt, updatedAt) <> (PushNotificationsRow.tupled, PushNotificationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(title), body, imageUrl, clickAction, Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> PushNotificationsRow.tupled((_1, _2.get, _3, _4, _5, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc */
    val id: Rep[Int] = column[Int]("id", O.AutoInc)
    /** Database column title SqlType(VARCHAR), Length(255,true) */
    val title: Rep[String] = column[String]("title", O.Length(255,varying=true))
    /** Database column body SqlType(VARCHAR), Length(1023,true) */
    val body: Rep[Option[String]] = column[Option[String]]("body", O.Length(1023,varying=true))
    /** Database column image_url SqlType(VARCHAR), Length(255,true) */
    val imageUrl: Rep[Option[String]] = column[Option[String]]("image_url", O.Length(255,varying=true))
    /** Database column click_action SqlType(VARCHAR), Length(255,true) */
    val clickAction: Rep[Option[String]] = column[Option[String]]("click_action", O.Length(255,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Uniqueness Index over (id) (database name id) */
    val index1 = index("id", id, unique=true)
  }
  /** Collection-like TableQuery object for table PushNotifications */
  lazy val PushNotifications = new TableQuery(tag => new PushNotifications(tag))

  /** Entity class storing rows of table Questions
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param title Database column title SqlType(VARCHAR), Length(255,true)
   *  @param answer Database column answer SqlType(TEXT), Length(65535,true)
   *  @param enable Database column enable SqlType(BIT)
   *  @param createdAt Database column created_at SqlType(DATETIME) */
  final case class QuestionsRow(id: Option[Int] = None, title: String, answer: String, enable: Boolean, createdAt: DateTime)
  /** GetResult implicit for fetching QuestionsRow objects using plain SQL queries */
  implicit def GetResultQuestionsRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Boolean], e3: GR[DateTime]): GR[QuestionsRow] = GR{
    prs => import prs._
    QuestionsRow.tupled((<<?[Int], <<[String], <<[String], <<[Boolean], <<[DateTime]))
  }
  /** Table description of table questions. Objects of this class serve as prototypes for rows in queries. */
  class Questions(_tableTag: Tag) extends profile.api.Table[QuestionsRow](_tableTag, "questions") {
    def * = (Rep.Some(id), title, answer, enable, createdAt) <> (QuestionsRow.tupled, QuestionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(title), Rep.Some(answer), Rep.Some(enable), Rep.Some(createdAt)).shaped.<>({r=>import r._; _1.map(_=> QuestionsRow.tupled((_1, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column title SqlType(VARCHAR), Length(255,true) */
    val title: Rep[String] = column[String]("title", O.Length(255,varying=true))
    /** Database column answer SqlType(TEXT), Length(65535,true) */
    val answer: Rep[String] = column[String]("answer", O.Length(65535,varying=true))
    /** Database column enable SqlType(BIT) */
    val enable: Rep[Boolean] = column[Boolean]("enable")
    /** Database column created_at SqlType(DATETIME) */
    val createdAt: Rep[DateTime] = column[DateTime]("created_at")
  }
  /** Collection-like TableQuery object for table Questions */
  lazy val Questions = new TableQuery(tag => new Questions(tag))

  /** Entity class storing rows of table ReceivePermissions
   *  @param userId Database column user_id SqlType(INT), PrimaryKey
   *  @param unreadNotification Database column unread_notification SqlType(BIT)
   *  @param weeklyMailInformation Database column weekly_mail_information SqlType(BIT) */
  final case class ReceivePermissionsRow(userId: Int, unreadNotification: Boolean, weeklyMailInformation: Boolean)
  /** GetResult implicit for fetching ReceivePermissionsRow objects using plain SQL queries */
  implicit def GetResultReceivePermissionsRow(implicit e0: GR[Int], e1: GR[Boolean]): GR[ReceivePermissionsRow] = GR{
    prs => import prs._
    ReceivePermissionsRow.tupled((<<[Int], <<[Boolean], <<[Boolean]))
  }
  /** Table description of table receive_permissions. Objects of this class serve as prototypes for rows in queries. */
  class ReceivePermissions(_tableTag: Tag) extends profile.api.Table[ReceivePermissionsRow](_tableTag, "receive_permissions") {
    def * = (userId, unreadNotification, weeklyMailInformation) <> (ReceivePermissionsRow.tupled, ReceivePermissionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(userId), Rep.Some(unreadNotification), Rep.Some(weeklyMailInformation)).shaped.<>({r=>import r._; _1.map(_=> ReceivePermissionsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column user_id SqlType(INT), PrimaryKey */
    val userId: Rep[Int] = column[Int]("user_id", O.PrimaryKey)
    /** Database column unread_notification SqlType(BIT) */
    val unreadNotification: Rep[Boolean] = column[Boolean]("unread_notification")
    /** Database column weekly_mail_information SqlType(BIT) */
    val weeklyMailInformation: Rep[Boolean] = column[Boolean]("weekly_mail_information")

    /** Foreign key referencing CompanyUsers (database name receive_permissions_idfk_1) */
    lazy val companyUsersFk = foreignKey("receive_permissions_idfk_1", userId, CompanyUsers)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table ReceivePermissions */
  lazy val ReceivePermissions = new TableQuery(tag => new ReceivePermissions(tag))

  /** Entity class storing rows of table RecommendedSearches
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(100,true)
   *  @param url Database column url SqlType(VARCHAR), Length(300,true)
   *  @param displayOrder Database column display_order SqlType(INT) */
  final case class RecommendedSearchesRow(id: Option[Int] = None, name: String, url: String, displayOrder: Int)
  /** GetResult implicit for fetching RecommendedSearchesRow objects using plain SQL queries */
  implicit def GetResultRecommendedSearchesRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Int]): GR[RecommendedSearchesRow] = GR{
    prs => import prs._
    RecommendedSearchesRow.tupled((<<?[Int], <<[String], <<[String], <<[Int]))
  }
  /** Table description of table recommended_searches. Objects of this class serve as prototypes for rows in queries. */
  class RecommendedSearches(_tableTag: Tag) extends profile.api.Table[RecommendedSearchesRow](_tableTag, "recommended_searches") {
    def * = (Rep.Some(id), name, url, displayOrder) <> (RecommendedSearchesRow.tupled, RecommendedSearchesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name), Rep.Some(url), Rep.Some(displayOrder)).shaped.<>({r=>import r._; _1.map(_=> RecommendedSearchesRow.tupled((_1, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(100,true) */
    val name: Rep[String] = column[String]("name", O.Length(100,varying=true))
    /** Database column url SqlType(VARCHAR), Length(300,true) */
    val url: Rep[String] = column[String]("url", O.Length(300,varying=true))
    /** Database column display_order SqlType(INT) */
    val displayOrder: Rep[Int] = column[Int]("display_order")
  }
  /** Collection-like TableQuery object for table RecommendedSearches */
  lazy val RecommendedSearches = new TableQuery(tag => new RecommendedSearches(tag))

  /** Entity class storing rows of table RecommendTemplates
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param location Database column location SqlType(VARCHAR), Length(100,true)
   *  @param label Database column label SqlType(VARCHAR), Length(100,true)
   *  @param body Database column body SqlType(TEXT), Length(65535,true) */
  final case class RecommendTemplatesRow(id: Option[Int] = None, location: String, label: String, body: String)
  /** GetResult implicit for fetching RecommendTemplatesRow objects using plain SQL queries */
  implicit def GetResultRecommendTemplatesRow(implicit e0: GR[Option[Int]], e1: GR[String]): GR[RecommendTemplatesRow] = GR{
    prs => import prs._
    RecommendTemplatesRow.tupled((<<?[Int], <<[String], <<[String], <<[String]))
  }
  /** Table description of table recommend_templates. Objects of this class serve as prototypes for rows in queries. */
  class RecommendTemplates(_tableTag: Tag) extends profile.api.Table[RecommendTemplatesRow](_tableTag, "recommend_templates") {
    def * = (Rep.Some(id), location, label, body) <> (RecommendTemplatesRow.tupled, RecommendTemplatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(location), Rep.Some(label), Rep.Some(body)).shaped.<>({r=>import r._; _1.map(_=> RecommendTemplatesRow.tupled((_1, _2.get, _3.get, _4.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column location SqlType(VARCHAR), Length(100,true) */
    val location: Rep[String] = column[String]("location", O.Length(100,varying=true))
    /** Database column label SqlType(VARCHAR), Length(100,true) */
    val label: Rep[String] = column[String]("label", O.Length(100,varying=true))
    /** Database column body SqlType(TEXT), Length(65535,true) */
    val body: Rep[String] = column[String]("body", O.Length(65535,varying=true))
  }
  /** Collection-like TableQuery object for table RecommendTemplates */
  lazy val RecommendTemplates = new TableQuery(tag => new RecommendTemplates(tag))

  /** Entity class storing rows of table RegisterTracking
   *  @param companyName Database column company_name SqlType(VARCHAR), Length(255,true)
   *  @param landingUrl Database column landing_url SqlType(VARCHAR), Length(1000,true)
   *  @param labels Database column labels SqlType(VARCHAR), Length(1000,true) */
  final case class RegisterTrackingRow(companyName: String, landingUrl: Option[String], labels: Option[String])
  /** GetResult implicit for fetching RegisterTrackingRow objects using plain SQL queries */
  implicit def GetResultRegisterTrackingRow(implicit e0: GR[String], e1: GR[Option[String]]): GR[RegisterTrackingRow] = GR{
    prs => import prs._
    RegisterTrackingRow.tupled((<<[String], <<?[String], <<?[String]))
  }
  /** Table description of table register_tracking. Objects of this class serve as prototypes for rows in queries. */
  class RegisterTracking(_tableTag: Tag) extends profile.api.Table[RegisterTrackingRow](_tableTag, "register_tracking") {
    def * = (companyName, landingUrl, labels) <> (RegisterTrackingRow.tupled, RegisterTrackingRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(companyName), landingUrl, labels).shaped.<>({r=>import r._; _1.map(_=> RegisterTrackingRow.tupled((_1.get, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_name SqlType(VARCHAR), Length(255,true) */
    val companyName: Rep[String] = column[String]("company_name", O.Length(255,varying=true))
    /** Database column landing_url SqlType(VARCHAR), Length(1000,true) */
    val landingUrl: Rep[Option[String]] = column[Option[String]]("landing_url", O.Length(1000,varying=true))
    /** Database column labels SqlType(VARCHAR), Length(1000,true) */
    val labels: Rep[Option[String]] = column[Option[String]]("labels", O.Length(1000,varying=true))
  }
  /** Collection-like TableQuery object for table RegisterTracking */
  lazy val RegisterTracking = new TableQuery(tag => new RegisterTracking(tag))

  /** Entity class storing rows of table Roles
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(191,true)
   *  @param resourceType Database column resource_type SqlType(VARCHAR), Length(191,true)
   *  @param resourceId Database column resource_id SqlType(INT)
   *  @param createdAt Database column created_at SqlType(DATETIME)
   *  @param updatedAt Database column updated_at SqlType(DATETIME) */
  final case class RolesRow(id: Option[Int] = None, name: Option[String], resourceType: Option[String], resourceId: Option[Int], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching RolesRow objects using plain SQL queries */
  implicit def GetResultRolesRow(implicit e0: GR[Option[Int]], e1: GR[Option[String]], e2: GR[Option[DateTime]]): GR[RolesRow] = GR{
    prs => import prs._
    RolesRow.tupled((<<?[Int], <<?[String], <<?[String], <<?[Int], <<?[DateTime], <<?[DateTime]))
  }
  /** Table description of table roles. Objects of this class serve as prototypes for rows in queries. */
  class Roles(_tableTag: Tag) extends profile.api.Table[RolesRow](_tableTag, "roles") {
    def * = (Rep.Some(id), name, resourceType, resourceId, createdAt, updatedAt) <> (RolesRow.tupled, RolesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), name, resourceType, resourceId, createdAt, updatedAt).shaped.<>({r=>import r._; _1.map(_=> RolesRow.tupled((_1, _2, _3, _4, _5, _6)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(191,true) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(191,varying=true))
    /** Database column resource_type SqlType(VARCHAR), Length(191,true) */
    val resourceType: Rep[Option[String]] = column[Option[String]]("resource_type", O.Length(191,varying=true))
    /** Database column resource_id SqlType(INT) */
    val resourceId: Rep[Option[Int]] = column[Option[Int]]("resource_id")
    /** Database column created_at SqlType(DATETIME) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(DATETIME) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Index over (name) (database name index_roles_on_name) */
    val index1 = index("index_roles_on_name", name)
    /** Index over (name,resourceType,resourceId) (database name rolify_roles_index) */
    val index2 = index("rolify_roles_index", (name, resourceType, resourceId))
  }
  /** Collection-like TableQuery object for table Roles */
  lazy val Roles = new TableQuery(tag => new Roles(tag))

  /** Entity class storing rows of table Sales
   *  @param companyId Database column company_id SqlType(INT)
   *  @param year Database column year SqlType(INT)
   *  @param value Database column value SqlType(BIGINT) */
  final case class SalesRow(companyId: Int, year: Int, value: Long)
  /** GetResult implicit for fetching SalesRow objects using plain SQL queries */
  implicit def GetResultSalesRow(implicit e0: GR[Int], e1: GR[Long]): GR[SalesRow] = GR{
    prs => import prs._
    SalesRow.tupled((<<[Int], <<[Int], <<[Long]))
  }
  /** Table description of table sales. Objects of this class serve as prototypes for rows in queries. */
  class Sales(_tableTag: Tag) extends profile.api.Table[SalesRow](_tableTag, "sales") {
    def * = (companyId, year, value) <> (SalesRow.tupled, SalesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(companyId), Rep.Some(year), Rep.Some(value)).shaped.<>({r=>import r._; _1.map(_=> SalesRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_id SqlType(INT) */
    val companyId: Rep[Int] = column[Int]("company_id")
    /** Database column year SqlType(INT) */
    val year: Rep[Int] = column[Int]("year")
    /** Database column value SqlType(BIGINT) */
    val value: Rep[Long] = column[Long]("value")

    /** Primary key of Sales (database name PRIMARY) */
    val pk = primaryKey("PRIMARY", (companyId, year))

    /** Foreign key referencing Companies (database name sales_ibfk_1) */
    lazy val companiesFk = foreignKey("sales_ibfk_1", companyId, Companies)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Sales */
  lazy val Sales = new TableQuery(tag => new Sales(tag))

  /** Entity class storing rows of table SchemaHistory
   *  @param installedRank Database column installed_rank SqlType(INT), PrimaryKey
   *  @param version Database column version SqlType(VARCHAR), Length(50,true)
   *  @param description Database column description SqlType(VARCHAR), Length(200,true)
   *  @param `type` Database column type SqlType(VARCHAR), Length(20,true)
   *  @param script Database column script SqlType(VARCHAR), Length(1000,true)
   *  @param checksum Database column checksum SqlType(INT)
   *  @param installedBy Database column installed_by SqlType(VARCHAR), Length(100,true)
   *  @param installedOn Database column installed_on SqlType(TIMESTAMP)
   *  @param executionTime Database column execution_time SqlType(INT)
   *  @param success Database column success SqlType(BIT) */
  final case class SchemaHistoryRow(installedRank: Int, version: Option[String], description: String, `type`: String, script: String, checksum: Option[Int], installedBy: String, installedOn: Option[DateTime], executionTime: Int, success: Boolean)
  /** GetResult implicit for fetching SchemaHistoryRow objects using plain SQL queries */
  implicit def GetResultSchemaHistoryRow(implicit e0: GR[Int], e1: GR[Option[String]], e2: GR[String], e3: GR[Option[Int]], e4: GR[Option[DateTime]], e5: GR[Boolean]): GR[SchemaHistoryRow] = GR{
    prs => import prs._
    SchemaHistoryRow.tupled((<<[Int], <<?[String], <<[String], <<[String], <<[String], <<?[Int], <<[String], <<[Option[DateTime]], <<[Int], <<[Boolean]))
  }
  /** Table description of table schema_history. Objects of this class serve as prototypes for rows in queries.
   *  NOTE: The following names collided with Scala keywords and were escaped: type */
  class SchemaHistory(_tableTag: Tag) extends profile.api.Table[SchemaHistoryRow](_tableTag, "schema_history") {
    def * = (installedRank, version, description, `type`, script, checksum, installedBy, installedOn, executionTime, success) <> (SchemaHistoryRow.tupled, SchemaHistoryRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(installedRank), version, Rep.Some(description), Rep.Some(`type`), Rep.Some(script), checksum, Rep.Some(installedBy), Rep.Some(installedOn), Rep.Some(executionTime), Rep.Some(success)).shaped.<>({r=>import r._; _1.map(_=> SchemaHistoryRow.tupled((_1.get, _2, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column installed_rank SqlType(INT), PrimaryKey */
    val installedRank: Rep[Int] = column[Int]("installed_rank", O.PrimaryKey)
    /** Database column version SqlType(VARCHAR), Length(50,true) */
    val version: Rep[Option[String]] = column[Option[String]]("version", O.Length(50,varying=true))
    /** Database column description SqlType(VARCHAR), Length(200,true) */
    val description: Rep[String] = column[String]("description", O.Length(200,varying=true))
    /** Database column type SqlType(VARCHAR), Length(20,true)
     *  NOTE: The name was escaped because it collided with a Scala keyword. */
    val `type`: Rep[String] = column[String]("type", O.Length(20,varying=true))
    /** Database column script SqlType(VARCHAR), Length(1000,true) */
    val script: Rep[String] = column[String]("script", O.Length(1000,varying=true))
    /** Database column checksum SqlType(INT) */
    val checksum: Rep[Option[Int]] = column[Option[Int]]("checksum")
    /** Database column installed_by SqlType(VARCHAR), Length(100,true) */
    val installedBy: Rep[String] = column[String]("installed_by", O.Length(100,varying=true))
    /** Database column installed_on SqlType(TIMESTAMP) */
    val installedOn: Rep[Option[DateTime]] = column[Option[DateTime]]("installed_on")
    /** Database column execution_time SqlType(INT) */
    val executionTime: Rep[Int] = column[Int]("execution_time")
    /** Database column success SqlType(BIT) */
    val success: Rep[Boolean] = column[Boolean]("success")

    /** Index over (success) (database name schema_history_s_idx) */
    val index1 = index("schema_history_s_idx", success)
  }
  /** Collection-like TableQuery object for table SchemaHistory */
  lazy val SchemaHistory = new TableQuery(tag => new SchemaHistory(tag))

  /** Entity class storing rows of table SchemaMigrations
   *  @param version Database column version SqlType(VARCHAR), PrimaryKey, Length(255,true) */
  final case class SchemaMigrationsRow(version: String)
  /** GetResult implicit for fetching SchemaMigrationsRow objects using plain SQL queries */
  implicit def GetResultSchemaMigrationsRow(implicit e0: GR[String]): GR[SchemaMigrationsRow] = GR{
    prs => import prs._
    SchemaMigrationsRow(<<[String])
  }
  /** Table description of table schema_migrations. Objects of this class serve as prototypes for rows in queries. */
  class SchemaMigrations(_tableTag: Tag) extends profile.api.Table[SchemaMigrationsRow](_tableTag, "schema_migrations") {
    def * = version <> (SchemaMigrationsRow, SchemaMigrationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = Rep.Some(version).shaped.<>(r => r.map(_=> SchemaMigrationsRow(r.get)), (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column version SqlType(VARCHAR), PrimaryKey, Length(255,true) */
    val version: Rep[String] = column[String]("version", O.PrimaryKey, O.Length(255,varying=true))
  }
  /** Collection-like TableQuery object for table SchemaMigrations */
  lazy val SchemaMigrations = new TableQuery(tag => new SchemaMigrations(tag))

  /** Entity class storing rows of table Scrapes
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param articleId Database column article_id SqlType(INT)
   *  @param url Database column url SqlType(VARCHAR), Length(300,true)
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param title Database column title SqlType(TEXT), Length(65535,true)
   *  @param content Database column content SqlType(TEXT), Length(65535,true)
   *  @param publishedAt Database column published_at SqlType(DATETIME)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP)
   *  @param selected Database column selected SqlType(TINYINT), Default(0) */
  final case class ScrapesRow(id: Option[Int] = None, articleId: Option[Int], url: Option[String], name: Option[String], title: Option[String], content: Option[String], publishedAt: Option[DateTime], createdAt: Option[DateTime], updatedAt: Option[DateTime], selected: Byte = 0)
  /** GetResult implicit for fetching ScrapesRow objects using plain SQL queries */
  implicit def GetResultScrapesRow(implicit e0: GR[Option[Int]], e1: GR[Option[String]], e2: GR[Option[DateTime]], e3: GR[Byte]): GR[ScrapesRow] = GR{
    prs => import prs._
    ScrapesRow.tupled((<<?[Int], <<?[Int], <<?[String], <<?[String], <<?[String], <<?[String], <<?[DateTime], <<[Option[DateTime]], <<[Option[DateTime]], <<[Byte]))
  }
  /** Table description of table scrapes. Objects of this class serve as prototypes for rows in queries. */
  class Scrapes(_tableTag: Tag) extends profile.api.Table[ScrapesRow](_tableTag, "scrapes") {
    def * = (Rep.Some(id), articleId, url, name, title, content, publishedAt, createdAt, updatedAt, selected) <> (ScrapesRow.tupled, ScrapesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), articleId, url, name, title, content, publishedAt, Rep.Some(createdAt), Rep.Some(updatedAt), Rep.Some(selected)).shaped.<>({r=>import r._; _1.map(_=> ScrapesRow.tupled((_1, _2, _3, _4, _5, _6, _7, _8.get, _9.get, _10.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column article_id SqlType(INT) */
    val articleId: Rep[Option[Int]] = column[Option[Int]]("article_id")
    /** Database column url SqlType(VARCHAR), Length(300,true) */
    val url: Rep[Option[String]] = column[Option[String]]("url", O.Length(300,varying=true))
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(255,varying=true))
    /** Database column title SqlType(TEXT), Length(65535,true) */
    val title: Rep[Option[String]] = column[Option[String]]("title", O.Length(65535,varying=true))
    /** Database column content SqlType(TEXT), Length(65535,true) */
    val content: Rep[Option[String]] = column[Option[String]]("content", O.Length(65535,varying=true))
    /** Database column published_at SqlType(DATETIME) */
    val publishedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("published_at")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
    /** Database column selected SqlType(TINYINT), Default(0) */
    val selected: Rep[Byte] = column[Byte]("selected", O.Default(0))

    /** Uniqueness Index over (articleId) (database name index_scrapes_on_article_id) */
    val index1 = index("index_scrapes_on_article_id", articleId, unique=true)
    /** Index over (createdAt,name) (database name index_scrapes_on_created_at_and_name) */
    val index2 = index("index_scrapes_on_created_at_and_name", (createdAt, name))
  }
  /** Collection-like TableQuery object for table Scrapes */
  lazy val Scrapes = new TableQuery(tag => new Scrapes(tag))

  /** Entity class storing rows of table SecretInfos
   *  @param companyId Database column company_id SqlType(INT)
   *  @param kind Database column kind SqlType(INT)
   *  @param value Database column value SqlType(TEXT), Length(65535,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class SecretInfosRow(companyId: Int, kind: Int, value: String, createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching SecretInfosRow objects using plain SQL queries */
  implicit def GetResultSecretInfosRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[DateTime]]): GR[SecretInfosRow] = GR{
    prs => import prs._
    SecretInfosRow.tupled((<<[Int], <<[Int], <<[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table secret_infos. Objects of this class serve as prototypes for rows in queries. */
  class SecretInfos(_tableTag: Tag) extends profile.api.Table[SecretInfosRow](_tableTag, "secret_infos") {
    def * = (companyId, kind, value, createdAt, updatedAt) <> (SecretInfosRow.tupled, SecretInfosRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(companyId), Rep.Some(kind), Rep.Some(value), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> SecretInfosRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_id SqlType(INT) */
    val companyId: Rep[Int] = column[Int]("company_id")
    /** Database column kind SqlType(INT) */
    val kind: Rep[Int] = column[Int]("kind")
    /** Database column value SqlType(TEXT), Length(65535,true) */
    val value: Rep[String] = column[String]("value", O.Length(65535,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table SecretInfos */
  lazy val SecretInfos = new TableQuery(tag => new SecretInfos(tag))

  /** Entity class storing rows of table SiteAdmin
   *  @param mailAddress Database column mail_address SqlType(VARCHAR), PrimaryKey, Length(100,true)
   *  @param password Database column password SqlType(VARCHAR), Length(100,true)
   *  @param created Database column created SqlType(TIMESTAMP)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class SiteAdminRow(mailAddress: String, password: String, created: Option[DateTime], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching SiteAdminRow objects using plain SQL queries */
  implicit def GetResultSiteAdminRow(implicit e0: GR[String], e1: GR[Option[DateTime]]): GR[SiteAdminRow] = GR{
    prs => import prs._
    SiteAdminRow.tupled((<<[String], <<[String], <<[Option[DateTime]], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table site_admin. Objects of this class serve as prototypes for rows in queries. */
  class SiteAdmin(_tableTag: Tag) extends profile.api.Table[SiteAdminRow](_tableTag, "site_admin") {
    def * = (mailAddress, password, created, createdAt, updatedAt) <> (SiteAdminRow.tupled, SiteAdminRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(mailAddress), Rep.Some(password), Rep.Some(created), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> SiteAdminRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column mail_address SqlType(VARCHAR), PrimaryKey, Length(100,true) */
    val mailAddress: Rep[String] = column[String]("mail_address", O.PrimaryKey, O.Length(100,varying=true))
    /** Database column password SqlType(VARCHAR), Length(100,true) */
    val password: Rep[String] = column[String]("password", O.Length(100,varying=true))
    /** Database column created SqlType(TIMESTAMP) */
    val created: Rep[Option[DateTime]] = column[Option[DateTime]]("created")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table SiteAdmin */
  lazy val SiteAdmin = new TableQuery(tag => new SiteAdmin(tag))

  /** Entity class storing rows of table Sitemaps
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param loc Database column loc SqlType(VARCHAR), Length(300,true)
   *  @param priority Database column priority SqlType(VARCHAR), Length(10,true)
   *  @param changefreq Database column changefreq SqlType(VARCHAR), Length(10,true) */
  final case class SitemapsRow(id: Option[Int] = None, loc: String, priority: Option[String], changefreq: Option[String])
  /** GetResult implicit for fetching SitemapsRow objects using plain SQL queries */
  implicit def GetResultSitemapsRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[String]]): GR[SitemapsRow] = GR{
    prs => import prs._
    SitemapsRow.tupled((<<?[Int], <<[String], <<?[String], <<?[String]))
  }
  /** Table description of table sitemaps. Objects of this class serve as prototypes for rows in queries. */
  class Sitemaps(_tableTag: Tag) extends profile.api.Table[SitemapsRow](_tableTag, "sitemaps") {
    def * = (Rep.Some(id), loc, priority, changefreq) <> (SitemapsRow.tupled, SitemapsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(loc), priority, changefreq).shaped.<>({r=>import r._; _1.map(_=> SitemapsRow.tupled((_1, _2.get, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column loc SqlType(VARCHAR), Length(300,true) */
    val loc: Rep[String] = column[String]("loc", O.Length(300,varying=true))
    /** Database column priority SqlType(VARCHAR), Length(10,true) */
    val priority: Rep[Option[String]] = column[Option[String]]("priority", O.Length(10,varying=true))
    /** Database column changefreq SqlType(VARCHAR), Length(10,true) */
    val changefreq: Rep[Option[String]] = column[Option[String]]("changefreq", O.Length(10,varying=true))
  }
  /** Collection-like TableQuery object for table Sitemaps */
  lazy val Sitemaps = new TableQuery(tag => new Sitemaps(tag))

  /** Entity class storing rows of table SmallTags
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param mediumTagId Database column medium_tag_id SqlType(INT)
   *  @param name Database column name SqlType(VARCHAR), Length(127,true)
   *  @param isAuthorized Database column is_authorized SqlType(BIT)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class SmallTagsRow(id: Option[Int] = None, mediumTagId: Option[Int], name: String, isAuthorized: Boolean, createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching SmallTagsRow objects using plain SQL queries */
  implicit def GetResultSmallTagsRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Boolean], e3: GR[Option[DateTime]]): GR[SmallTagsRow] = GR{
    prs => import prs._
    SmallTagsRow.tupled((<<?[Int], <<?[Int], <<[String], <<[Boolean], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table small_tags. Objects of this class serve as prototypes for rows in queries. */
  class SmallTags(_tableTag: Tag) extends profile.api.Table[SmallTagsRow](_tableTag, "small_tags") {
    def * = (Rep.Some(id), mediumTagId, name, isAuthorized, createdAt, updatedAt) <> (SmallTagsRow.tupled, SmallTagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), mediumTagId, Rep.Some(name), Rep.Some(isAuthorized), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> SmallTagsRow.tupled((_1, _2, _3.get, _4.get, _5.get, _6.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column medium_tag_id SqlType(INT) */
    val mediumTagId: Rep[Option[Int]] = column[Option[Int]]("medium_tag_id")
    /** Database column name SqlType(VARCHAR), Length(127,true) */
    val name: Rep[String] = column[String]("name", O.Length(127,varying=true))
    /** Database column is_authorized SqlType(BIT) */
    val isAuthorized: Rep[Boolean] = column[Boolean]("is_authorized")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Foreign key referencing MediumTags (database name small_tags_fk_1) */
    lazy val mediumTagsFk = foreignKey("small_tags_fk_1", mediumTagId, MediumTags)(r => Rep.Some(r.id), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (name,mediumTagId) (database name unique_small_tags_name_medium_tag_id) */
    val index1 = index("unique_small_tags_name_medium_tag_id", (name, mediumTagId), unique=true)
  }
  /** Collection-like TableQuery object for table SmallTags */
  lazy val SmallTags = new TableQuery(tag => new SmallTags(tag))

  /** Entity class storing rows of table Specials
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param description Database column description SqlType(VARCHAR), Length(1000,true)
   *  @param displayOrder Database column display_order SqlType(INT)
   *  @param image Database column image SqlType(VARCHAR), Length(200,true)
   *  @param name Database column name SqlType(VARCHAR), Length(100,true)
   *  @param top Database column top SqlType(BIT)
   *  @param pickupImage Database column pickup_image SqlType(VARCHAR), Length(300,true) */
  final case class SpecialsRow(id: Option[Int] = None, description: String, displayOrder: Int, image: Option[String], name: String, top: Boolean, pickupImage: Option[String])
  /** GetResult implicit for fetching SpecialsRow objects using plain SQL queries */
  implicit def GetResultSpecialsRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Int], e3: GR[Option[String]], e4: GR[Boolean]): GR[SpecialsRow] = GR{
    prs => import prs._
    SpecialsRow.tupled((<<?[Int], <<[String], <<[Int], <<?[String], <<[String], <<[Boolean], <<?[String]))
  }
  /** Table description of table specials. Objects of this class serve as prototypes for rows in queries. */
  class Specials(_tableTag: Tag) extends profile.api.Table[SpecialsRow](_tableTag, "specials") {
    def * = (Rep.Some(id), description, displayOrder, image, name, top, pickupImage) <> (SpecialsRow.tupled, SpecialsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(description), Rep.Some(displayOrder), image, Rep.Some(name), Rep.Some(top), pickupImage).shaped.<>({r=>import r._; _1.map(_=> SpecialsRow.tupled((_1, _2.get, _3.get, _4, _5.get, _6.get, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column description SqlType(VARCHAR), Length(1000,true) */
    val description: Rep[String] = column[String]("description", O.Length(1000,varying=true))
    /** Database column display_order SqlType(INT) */
    val displayOrder: Rep[Int] = column[Int]("display_order")
    /** Database column image SqlType(VARCHAR), Length(200,true) */
    val image: Rep[Option[String]] = column[Option[String]]("image", O.Length(200,varying=true))
    /** Database column name SqlType(VARCHAR), Length(100,true) */
    val name: Rep[String] = column[String]("name", O.Length(100,varying=true))
    /** Database column top SqlType(BIT) */
    val top: Rep[Boolean] = column[Boolean]("top")
    /** Database column pickup_image SqlType(VARCHAR), Length(300,true) */
    val pickupImage: Rep[Option[String]] = column[Option[String]]("pickup_image", O.Length(300,varying=true))
  }
  /** Collection-like TableQuery object for table Specials */
  lazy val Specials = new TableQuery(tag => new Specials(tag))

  /** Entity class storing rows of table SpecialTargets
   *  @param specialId Database column special_id SqlType(INT)
   *  @param projectId Database column project_id SqlType(INT)
   *  @param displayOrder Database column display_order SqlType(INT) */
  final case class SpecialTargetsRow(specialId: Int, projectId: Int, displayOrder: Int)
  /** GetResult implicit for fetching SpecialTargetsRow objects using plain SQL queries */
  implicit def GetResultSpecialTargetsRow(implicit e0: GR[Int]): GR[SpecialTargetsRow] = GR{
    prs => import prs._
    SpecialTargetsRow.tupled((<<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table special_targets. Objects of this class serve as prototypes for rows in queries. */
  class SpecialTargets(_tableTag: Tag) extends profile.api.Table[SpecialTargetsRow](_tableTag, "special_targets") {
    def * = (specialId, projectId, displayOrder) <> (SpecialTargetsRow.tupled, SpecialTargetsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(specialId), Rep.Some(projectId), Rep.Some(displayOrder)).shaped.<>({r=>import r._; _1.map(_=> SpecialTargetsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column special_id SqlType(INT) */
    val specialId: Rep[Int] = column[Int]("special_id")
    /** Database column project_id SqlType(INT) */
    val projectId: Rep[Int] = column[Int]("project_id")
    /** Database column display_order SqlType(INT) */
    val displayOrder: Rep[Int] = column[Int]("display_order")

    /** Primary key of SpecialTargets (database name PRIMARY) */
    val pk = primaryKey("PRIMARY", (specialId, projectId))

    /** Foreign key referencing Projects (database name special_targets_ibfk_1) */
    lazy val projectsFk = foreignKey("special_targets_ibfk_1", projectId, Projects)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Specials (database name special_targets_ibfk_2) */
    lazy val specialsFk = foreignKey("special_targets_ibfk_2", specialId, Specials)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table SpecialTargets */
  lazy val SpecialTargets = new TableQuery(tag => new SpecialTargets(tag))

  /** Entity class storing rows of table StaffPasswordReset
   *  @param hashKey Database column hash_key SqlType(VARCHAR), PrimaryKey, Length(100,true)
   *  @param staffId Database column staff_id SqlType(INT)
   *  @param created Database column created SqlType(TIMESTAMP)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class StaffPasswordResetRow(hashKey: String, staffId: Int, created: Option[DateTime], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching StaffPasswordResetRow objects using plain SQL queries */
  implicit def GetResultStaffPasswordResetRow(implicit e0: GR[String], e1: GR[Int], e2: GR[Option[DateTime]]): GR[StaffPasswordResetRow] = GR{
    prs => import prs._
    StaffPasswordResetRow.tupled((<<[String], <<[Int], <<[Option[DateTime]], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table staff_password_reset. Objects of this class serve as prototypes for rows in queries. */
  class StaffPasswordReset(_tableTag: Tag) extends profile.api.Table[StaffPasswordResetRow](_tableTag, "staff_password_reset") {
    def * = (hashKey, staffId, created, createdAt, updatedAt) <> (StaffPasswordResetRow.tupled, StaffPasswordResetRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(hashKey), Rep.Some(staffId), Rep.Some(created), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> StaffPasswordResetRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column hash_key SqlType(VARCHAR), PrimaryKey, Length(100,true) */
    val hashKey: Rep[String] = column[String]("hash_key", O.PrimaryKey, O.Length(100,varying=true))
    /** Database column staff_id SqlType(INT) */
    val staffId: Rep[Int] = column[Int]("staff_id")
    /** Database column created SqlType(TIMESTAMP) */
    val created: Rep[Option[DateTime]] = column[Option[DateTime]]("created")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table StaffPasswordReset */
  lazy val StaffPasswordReset = new TableQuery(tag => new StaffPasswordReset(tag))

  /** Entity class storing rows of table SucceededCases
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param coOwner1 Database column co_owner1 SqlType(VARCHAR), Length(255,true)
   *  @param companyType1 Database column company_type1 SqlType(VARCHAR), Length(32,true)
   *  @param coOwner2 Database column co_owner2 SqlType(VARCHAR), Length(255,true)
   *  @param companyType2 Database column company_type2 SqlType(VARCHAR), Length(32,true)
   *  @param kind Database column kind SqlType(VARCHAR), Length(255,true)
   *  @param reason Database column reason SqlType(VARCHAR), Length(255,true)
   *  @param method Database column method SqlType(VARCHAR), Length(255,true)
   *  @param content Database column content SqlType(TEXT), Length(65535,true)
   *  @param result Database column result SqlType(TEXT), Length(65535,true)
   *  @param scale Database column scale SqlType(VARCHAR), Length(255,true)
   *  @param uri Database column uri SqlType(TEXT), Length(65535,true)
   *  @param startedYear Database column started_year SqlType(YEAR)
   *  @param registeredAt Database column registered_at SqlType(DATETIME)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class SucceededCasesRow(id: Option[Int] = None, coOwner1: String, companyType1: String, coOwner2: String, companyType2: String, kind: String, reason: String, method: String, content: String, result: String, scale: String, uri: String, startedYear: Option[LocalDate], registeredAt: DateTime, createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching SucceededCasesRow objects using plain SQL queries */
  implicit def GetResultSucceededCasesRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[LocalDate]], e3: GR[DateTime], e4: GR[Option[DateTime]]): GR[SucceededCasesRow] = GR{
    prs => import prs._
    SucceededCasesRow.tupled((<<?[Int], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<[String], <<?[LocalDate], <<[DateTime], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table succeeded_cases. Objects of this class serve as prototypes for rows in queries. */
  class SucceededCases(_tableTag: Tag) extends profile.api.Table[SucceededCasesRow](_tableTag, "succeeded_cases") {
    def * = (Rep.Some(id), coOwner1, companyType1, coOwner2, companyType2, kind, reason, method, content, result, scale, uri, startedYear, registeredAt, createdAt, updatedAt) <> (SucceededCasesRow.tupled, SucceededCasesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(coOwner1), Rep.Some(companyType1), Rep.Some(coOwner2), Rep.Some(companyType2), Rep.Some(kind), Rep.Some(reason), Rep.Some(method), Rep.Some(content), Rep.Some(result), Rep.Some(scale), Rep.Some(uri), startedYear, Rep.Some(registeredAt), Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> SucceededCasesRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12.get, _13, _14.get, _15.get, _16.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column co_owner1 SqlType(VARCHAR), Length(255,true) */
    val coOwner1: Rep[String] = column[String]("co_owner1", O.Length(255,varying=true))
    /** Database column company_type1 SqlType(VARCHAR), Length(32,true) */
    val companyType1: Rep[String] = column[String]("company_type1", O.Length(32,varying=true))
    /** Database column co_owner2 SqlType(VARCHAR), Length(255,true) */
    val coOwner2: Rep[String] = column[String]("co_owner2", O.Length(255,varying=true))
    /** Database column company_type2 SqlType(VARCHAR), Length(32,true) */
    val companyType2: Rep[String] = column[String]("company_type2", O.Length(32,varying=true))
    /** Database column kind SqlType(VARCHAR), Length(255,true) */
    val kind: Rep[String] = column[String]("kind", O.Length(255,varying=true))
    /** Database column reason SqlType(VARCHAR), Length(255,true) */
    val reason: Rep[String] = column[String]("reason", O.Length(255,varying=true))
    /** Database column method SqlType(VARCHAR), Length(255,true) */
    val method: Rep[String] = column[String]("method", O.Length(255,varying=true))
    /** Database column content SqlType(TEXT), Length(65535,true) */
    val content: Rep[String] = column[String]("content", O.Length(65535,varying=true))
    /** Database column result SqlType(TEXT), Length(65535,true) */
    val result: Rep[String] = column[String]("result", O.Length(65535,varying=true))
    /** Database column scale SqlType(VARCHAR), Length(255,true) */
    val scale: Rep[String] = column[String]("scale", O.Length(255,varying=true))
    /** Database column uri SqlType(TEXT), Length(65535,true) */
    val uri: Rep[String] = column[String]("uri", O.Length(65535,varying=true))
    /** Database column started_year SqlType(YEAR) */
    val startedYear: Rep[Option[LocalDate]] = column[Option[LocalDate]]("started_year")
    /** Database column registered_at SqlType(DATETIME) */
    val registeredAt: Rep[DateTime] = column[DateTime]("registered_at")
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")
  }
  /** Collection-like TableQuery object for table SucceededCases */
  lazy val SucceededCases = new TableQuery(tag => new SucceededCases(tag))

  /** Entity class storing rows of table Taggings
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param tagId Database column tag_id SqlType(INT)
   *  @param taggableType Database column taggable_type SqlType(VARCHAR), Length(191,true)
   *  @param taggableId Database column taggable_id SqlType(INT)
   *  @param taggerType Database column tagger_type SqlType(VARCHAR), Length(191,true)
   *  @param taggerId Database column tagger_id SqlType(INT)
   *  @param context Database column context SqlType(VARCHAR), Length(128,true)
   *  @param createdAt Database column created_at SqlType(DATETIME) */
  final case class TaggingsRow(id: Option[Int] = None, tagId: Option[Int], taggableType: Option[String], taggableId: Option[Int], taggerType: Option[String], taggerId: Option[Int], context: Option[String], createdAt: Option[DateTime])
  /** GetResult implicit for fetching TaggingsRow objects using plain SQL queries */
  implicit def GetResultTaggingsRow(implicit e0: GR[Option[Int]], e1: GR[Option[String]], e2: GR[Option[DateTime]]): GR[TaggingsRow] = GR{
    prs => import prs._
    TaggingsRow.tupled((<<?[Int], <<?[Int], <<?[String], <<?[Int], <<?[String], <<?[Int], <<?[String], <<?[DateTime]))
  }
  /** Table description of table taggings. Objects of this class serve as prototypes for rows in queries. */
  class Taggings(_tableTag: Tag) extends profile.api.Table[TaggingsRow](_tableTag, "taggings") {
    def * = (Rep.Some(id), tagId, taggableType, taggableId, taggerType, taggerId, context, createdAt) <> (TaggingsRow.tupled, TaggingsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), tagId, taggableType, taggableId, taggerType, taggerId, context, createdAt).shaped.<>({r=>import r._; _1.map(_=> TaggingsRow.tupled((_1, _2, _3, _4, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column tag_id SqlType(INT) */
    val tagId: Rep[Option[Int]] = column[Option[Int]]("tag_id")
    /** Database column taggable_type SqlType(VARCHAR), Length(191,true) */
    val taggableType: Rep[Option[String]] = column[Option[String]]("taggable_type", O.Length(191,varying=true))
    /** Database column taggable_id SqlType(INT) */
    val taggableId: Rep[Option[Int]] = column[Option[Int]]("taggable_id")
    /** Database column tagger_type SqlType(VARCHAR), Length(191,true) */
    val taggerType: Rep[Option[String]] = column[Option[String]]("tagger_type", O.Length(191,varying=true))
    /** Database column tagger_id SqlType(INT) */
    val taggerId: Rep[Option[Int]] = column[Option[Int]]("tagger_id")
    /** Database column context SqlType(VARCHAR), Length(128,true) */
    val context: Rep[Option[String]] = column[Option[String]]("context", O.Length(128,varying=true))
    /** Database column created_at SqlType(DATETIME) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")

    /** Index over (context) (database name index_taggings_on_context) */
    val index1 = index("index_taggings_on_context", context)
    /** Index over (tagId) (database name index_taggings_on_tag_id) */
    val index2 = index("index_taggings_on_tag_id", tagId)
    /** Index over (taggableId) (database name index_taggings_on_taggable_id) */
    val index3 = index("index_taggings_on_taggable_id", taggableId)
    /** Index over (taggableId,taggableType,context) (database name index_taggings_on_taggable_id_and_taggable_type_and_context) */
    val index4 = index("index_taggings_on_taggable_id_and_taggable_type_and_context", (taggableId, taggableType, context))
    /** Index over (taggableType) (database name index_taggings_on_taggable_type) */
    val index5 = index("index_taggings_on_taggable_type", taggableType)
    /** Index over (taggerId) (database name index_taggings_on_tagger_id) */
    val index6 = index("index_taggings_on_tagger_id", taggerId)
    /** Index over (taggerId,taggerType) (database name index_taggings_on_tagger_id_and_tagger_type) */
    val index7 = index("index_taggings_on_tagger_id_and_tagger_type", (taggerId, taggerType))
    /** Uniqueness Index over (tagId,taggableId,taggableType,context,taggerId,taggerType) (database name taggings_idx) */
    val index8 = index("taggings_idx", (tagId, taggableId, taggableType, context, taggerId, taggerType), unique=true)
    /** Index over (taggableId,taggableType,taggerId,context) (database name taggings_idy) */
    val index9 = index("taggings_idy", (taggableId, taggableType, taggerId, context))
  }
  /** Collection-like TableQuery object for table Taggings */
  lazy val Taggings = new TableQuery(tag => new Taggings(tag))

  /** Entity class storing rows of table TagOrders
   *  @param tagId Database column tag_id SqlType(INT), PrimaryKey
   *  @param displayOrder Database column display_order SqlType(INT)
   *  @param pickup Database column pickup SqlType(BIT) */
  final case class TagOrdersRow(tagId: Int, displayOrder: Int, pickup: Boolean)
  /** GetResult implicit for fetching TagOrdersRow objects using plain SQL queries */
  implicit def GetResultTagOrdersRow(implicit e0: GR[Int], e1: GR[Boolean]): GR[TagOrdersRow] = GR{
    prs => import prs._
    TagOrdersRow.tupled((<<[Int], <<[Int], <<[Boolean]))
  }
  /** Table description of table tag_orders. Objects of this class serve as prototypes for rows in queries. */
  class TagOrders(_tableTag: Tag) extends profile.api.Table[TagOrdersRow](_tableTag, "tag_orders") {
    def * = (tagId, displayOrder, pickup) <> (TagOrdersRow.tupled, TagOrdersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(tagId), Rep.Some(displayOrder), Rep.Some(pickup)).shaped.<>({r=>import r._; _1.map(_=> TagOrdersRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column tag_id SqlType(INT), PrimaryKey */
    val tagId: Rep[Int] = column[Int]("tag_id", O.PrimaryKey)
    /** Database column display_order SqlType(INT) */
    val displayOrder: Rep[Int] = column[Int]("display_order")
    /** Database column pickup SqlType(BIT) */
    val pickup: Rep[Boolean] = column[Boolean]("pickup")
  }
  /** Collection-like TableQuery object for table TagOrders */
  lazy val TagOrders = new TableQuery(tag => new TagOrders(tag))

  /** Entity class storing rows of table Tags
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param taggingsCount Database column taggings_count SqlType(INT), Default(Some(0)) */
  final case class TagsRow(id: Option[Int] = None, name: Option[String], taggingsCount: Option[Int] = Some(0))
  /** GetResult implicit for fetching TagsRow objects using plain SQL queries */
  implicit def GetResultTagsRow(implicit e0: GR[Option[Int]], e1: GR[Option[String]]): GR[TagsRow] = GR{
    prs => import prs._
    TagsRow.tupled((<<?[Int], <<?[String], <<?[Int]))
  }
  /** Table description of table tags. Objects of this class serve as prototypes for rows in queries. */
  class Tags(_tableTag: Tag) extends profile.api.Table[TagsRow](_tableTag, "tags") {
    def * = (Rep.Some(id), name, taggingsCount) <> (TagsRow.tupled, TagsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), name, taggingsCount).shaped.<>({r=>import r._; _1.map(_=> TagsRow.tupled((_1, _2, _3)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[Option[String]] = column[Option[String]]("name", O.Length(255,varying=true))
    /** Database column taggings_count SqlType(INT), Default(Some(0)) */
    val taggingsCount: Rep[Option[Int]] = column[Option[Int]]("taggings_count", O.Default(Some(0)))

    /** Uniqueness Index over (name) (database name index_tags_on_name) */
    val index1 = index("index_tags_on_name", name, unique=true)
  }
  /** Collection-like TableQuery object for table Tags */
  lazy val Tags = new TableQuery(tag => new Tags(tag))

  /** Entity class storing rows of table TPreEntryCorp
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param nameKana Database column name_kana SqlType(VARCHAR), Length(255,true)
   *  @param zipCode Database column zip_code SqlType(VARCHAR), Length(10,true)
   *  @param prefectureId Database column prefecture_id SqlType(INT)
   *  @param location Database column location SqlType(VARCHAR), Length(255,true)
   *  @param tel Database column tel SqlType(VARCHAR), Length(20,true)
   *  @param url Database column url SqlType(VARCHAR), Length(1023,true)
   *  @param establishment Database column establishment SqlType(DATE)
   *  @param capitalId Database column capital_id SqlType(INT)
   *  @param chargeName Database column charge_name SqlType(VARCHAR), Length(255,true)
   *  @param chargeNameKana Database column charge_name_kana SqlType(VARCHAR), Length(255,true)
   *  @param chargeSection Database column charge_section SqlType(VARCHAR), Length(255,true)
   *  @param chargePosition Database column charge_position SqlType(VARCHAR), Length(255,true)
   *  @param chargeMailAddress Database column charge_mail_address SqlType(VARCHAR), Length(511,true)
   *  @param created Database column created SqlType(DATETIME)
   *  @param modified Database column modified SqlType(DATETIME)
   *  @param deleted Database column deleted SqlType(DATETIME) */
  final case class TPreEntryCorpRow(id: Option[Int] = None, name: String, nameKana: String, zipCode: String, prefectureId: Int, location: String, tel: String, url: Option[String], establishment: Option[LocalDate], capitalId: Option[Int], chargeName: String, chargeNameKana: String, chargeSection: String, chargePosition: Option[String], chargeMailAddress: String, created: DateTime, modified: Option[DateTime], deleted: Option[DateTime])
  /** GetResult implicit for fetching TPreEntryCorpRow objects using plain SQL queries */
  implicit def GetResultTPreEntryCorpRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Int], e3: GR[Option[String]], e4: GR[Option[LocalDate]], e5: GR[DateTime], e6: GR[Option[DateTime]]): GR[TPreEntryCorpRow] = GR{
    prs => import prs._
    TPreEntryCorpRow.tupled((<<?[Int], <<[String], <<[String], <<[String], <<[Int], <<[String], <<[String], <<?[String], <<?[LocalDate], <<?[Int], <<[String], <<[String], <<[String], <<?[String], <<[String], <<[DateTime], <<?[DateTime], <<?[DateTime]))
  }
  /** Table description of table t_pre_entry_corp. Objects of this class serve as prototypes for rows in queries. */
  class TPreEntryCorp(_tableTag: Tag) extends profile.api.Table[TPreEntryCorpRow](_tableTag, "t_pre_entry_corp") {
    def * = (Rep.Some(id), name, nameKana, zipCode, prefectureId, location, tel, url, establishment, capitalId, chargeName, chargeNameKana, chargeSection, chargePosition, chargeMailAddress, created, modified, deleted) <> (TPreEntryCorpRow.tupled, TPreEntryCorpRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name), Rep.Some(nameKana), Rep.Some(zipCode), Rep.Some(prefectureId), Rep.Some(location), Rep.Some(tel), url, establishment, capitalId, Rep.Some(chargeName), Rep.Some(chargeNameKana), Rep.Some(chargeSection), chargePosition, Rep.Some(chargeMailAddress), Rep.Some(created), modified, deleted).shaped.<>({r=>import r._; _1.map(_=> TPreEntryCorpRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7.get, _8, _9, _10, _11.get, _12.get, _13.get, _14, _15.get, _16.get, _17, _18)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column name_kana SqlType(VARCHAR), Length(255,true) */
    val nameKana: Rep[String] = column[String]("name_kana", O.Length(255,varying=true))
    /** Database column zip_code SqlType(VARCHAR), Length(10,true) */
    val zipCode: Rep[String] = column[String]("zip_code", O.Length(10,varying=true))
    /** Database column prefecture_id SqlType(INT) */
    val prefectureId: Rep[Int] = column[Int]("prefecture_id")
    /** Database column location SqlType(VARCHAR), Length(255,true) */
    val location: Rep[String] = column[String]("location", O.Length(255,varying=true))
    /** Database column tel SqlType(VARCHAR), Length(20,true) */
    val tel: Rep[String] = column[String]("tel", O.Length(20,varying=true))
    /** Database column url SqlType(VARCHAR), Length(1023,true) */
    val url: Rep[Option[String]] = column[Option[String]]("url", O.Length(1023,varying=true))
    /** Database column establishment SqlType(DATE) */
    val establishment: Rep[Option[LocalDate]] = column[Option[LocalDate]]("establishment")
    /** Database column capital_id SqlType(INT) */
    val capitalId: Rep[Option[Int]] = column[Option[Int]]("capital_id")
    /** Database column charge_name SqlType(VARCHAR), Length(255,true) */
    val chargeName: Rep[String] = column[String]("charge_name", O.Length(255,varying=true))
    /** Database column charge_name_kana SqlType(VARCHAR), Length(255,true) */
    val chargeNameKana: Rep[String] = column[String]("charge_name_kana", O.Length(255,varying=true))
    /** Database column charge_section SqlType(VARCHAR), Length(255,true) */
    val chargeSection: Rep[String] = column[String]("charge_section", O.Length(255,varying=true))
    /** Database column charge_position SqlType(VARCHAR), Length(255,true) */
    val chargePosition: Rep[Option[String]] = column[Option[String]]("charge_position", O.Length(255,varying=true))
    /** Database column charge_mail_address SqlType(VARCHAR), Length(511,true) */
    val chargeMailAddress: Rep[String] = column[String]("charge_mail_address", O.Length(511,varying=true))
    /** Database column created SqlType(DATETIME) */
    val created: Rep[DateTime] = column[DateTime]("created")
    /** Database column modified SqlType(DATETIME) */
    val modified: Rep[Option[DateTime]] = column[Option[DateTime]]("modified")
    /** Database column deleted SqlType(DATETIME) */
    val deleted: Rep[Option[DateTime]] = column[Option[DateTime]]("deleted")

    /** Index over (capitalId) (database name capital_id) */
    val index1 = index("capital_id", capitalId)
    /** Index over (prefectureId) (database name prefecture_id) */
    val index2 = index("prefecture_id", prefectureId)
  }
  /** Collection-like TableQuery object for table TPreEntryCorp */
  lazy val TPreEntryCorp = new TableQuery(tag => new TPreEntryCorp(tag))

  /** Entity class storing rows of table TPreEntryUser
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param nameKana Database column name_kana SqlType(VARCHAR), Length(255,true)
   *  @param mailAddress Database column mail_address SqlType(VARCHAR), Length(511,true)
   *  @param companyName Database column company_name SqlType(VARCHAR), Length(255,true)
   *  @param industryLargeId Database column industry_large_id SqlType(VARCHAR), Length(11,true)
   *  @param jobTypeLargeId Database column job_type_large_id SqlType(VARCHAR), Length(11,true)
   *  @param sectionName Database column section_name SqlType(VARCHAR), Length(255,true)
   *  @param created Database column created SqlType(DATETIME)
   *  @param modified Database column modified SqlType(DATETIME)
   *  @param deleted Database column deleted SqlType(DATETIME) */
  final case class TPreEntryUserRow(id: Option[Int] = None, name: String, nameKana: String, mailAddress: String, companyName: Option[String], industryLargeId: Option[String], jobTypeLargeId: Option[String], sectionName: Option[String], created: DateTime, modified: Option[DateTime], deleted: Option[DateTime])
  /** GetResult implicit for fetching TPreEntryUserRow objects using plain SQL queries */
  implicit def GetResultTPreEntryUserRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[String]], e3: GR[DateTime], e4: GR[Option[DateTime]]): GR[TPreEntryUserRow] = GR{
    prs => import prs._
    TPreEntryUserRow.tupled((<<?[Int], <<[String], <<[String], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<[DateTime], <<?[DateTime], <<?[DateTime]))
  }
  /** Table description of table t_pre_entry_user. Objects of this class serve as prototypes for rows in queries. */
  class TPreEntryUser(_tableTag: Tag) extends profile.api.Table[TPreEntryUserRow](_tableTag, "t_pre_entry_user") {
    def * = (Rep.Some(id), name, nameKana, mailAddress, companyName, industryLargeId, jobTypeLargeId, sectionName, created, modified, deleted) <> (TPreEntryUserRow.tupled, TPreEntryUserRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name), Rep.Some(nameKana), Rep.Some(mailAddress), companyName, industryLargeId, jobTypeLargeId, sectionName, Rep.Some(created), modified, deleted).shaped.<>({r=>import r._; _1.map(_=> TPreEntryUserRow.tupled((_1, _2.get, _3.get, _4.get, _5, _6, _7, _8, _9.get, _10, _11)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column name_kana SqlType(VARCHAR), Length(255,true) */
    val nameKana: Rep[String] = column[String]("name_kana", O.Length(255,varying=true))
    /** Database column mail_address SqlType(VARCHAR), Length(511,true) */
    val mailAddress: Rep[String] = column[String]("mail_address", O.Length(511,varying=true))
    /** Database column company_name SqlType(VARCHAR), Length(255,true) */
    val companyName: Rep[Option[String]] = column[Option[String]]("company_name", O.Length(255,varying=true))
    /** Database column industry_large_id SqlType(VARCHAR), Length(11,true) */
    val industryLargeId: Rep[Option[String]] = column[Option[String]]("industry_large_id", O.Length(11,varying=true))
    /** Database column job_type_large_id SqlType(VARCHAR), Length(11,true) */
    val jobTypeLargeId: Rep[Option[String]] = column[Option[String]]("job_type_large_id", O.Length(11,varying=true))
    /** Database column section_name SqlType(VARCHAR), Length(255,true) */
    val sectionName: Rep[Option[String]] = column[Option[String]]("section_name", O.Length(255,varying=true))
    /** Database column created SqlType(DATETIME) */
    val created: Rep[DateTime] = column[DateTime]("created")
    /** Database column modified SqlType(DATETIME) */
    val modified: Rep[Option[DateTime]] = column[Option[DateTime]]("modified")
    /** Database column deleted SqlType(DATETIME) */
    val deleted: Rep[Option[DateTime]] = column[Option[DateTime]]("deleted")

    /** Index over (industryLargeId) (database name industry_small_id) */
    val index1 = index("industry_small_id", industryLargeId)
    /** Index over (jobTypeLargeId) (database name job_type_small_id) */
    val index2 = index("job_type_small_id", jobTypeLargeId)
  }
  /** Collection-like TableQuery object for table TPreEntryUser */
  lazy val TPreEntryUser = new TableQuery(tag => new TPreEntryUser(tag))

  /** Entity class storing rows of table UserMailNotifications
   *  @param companyUserId Database column company_user_id SqlType(INT)
   *  @param mailNotificationId Database column mail_notification_id SqlType(INT UNSIGNED)
   *  @param enabled Database column enabled SqlType(BIT) */
  final case class UserMailNotificationsRow(companyUserId: Int, mailNotificationId: Int, enabled: Boolean)
  /** GetResult implicit for fetching UserMailNotificationsRow objects using plain SQL queries */
  implicit def GetResultUserMailNotificationsRow(implicit e0: GR[Int], e1: GR[Boolean]): GR[UserMailNotificationsRow] = GR{
    prs => import prs._
    UserMailNotificationsRow.tupled((<<[Int], <<[Int], <<[Boolean]))
  }
  /** Table description of table user_mail_notifications. Objects of this class serve as prototypes for rows in queries. */
  class UserMailNotifications(_tableTag: Tag) extends profile.api.Table[UserMailNotificationsRow](_tableTag, "user_mail_notifications") {
    def * = (companyUserId, mailNotificationId, enabled) <> (UserMailNotificationsRow.tupled, UserMailNotificationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(companyUserId), Rep.Some(mailNotificationId), Rep.Some(enabled)).shaped.<>({r=>import r._; _1.map(_=> UserMailNotificationsRow.tupled((_1.get, _2.get, _3.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column company_user_id SqlType(INT) */
    val companyUserId: Rep[Int] = column[Int]("company_user_id")
    /** Database column mail_notification_id SqlType(INT UNSIGNED) */
    val mailNotificationId: Rep[Int] = column[Int]("mail_notification_id")
    /** Database column enabled SqlType(BIT) */
    val enabled: Rep[Boolean] = column[Boolean]("enabled")

    /** Primary key of UserMailNotifications (database name PRIMARY) */
    val pk = primaryKey("PRIMARY", (companyUserId, mailNotificationId))

    /** Foreign key referencing Companies (database name user_mail_notification_fk_1) */
    lazy val companiesFk = foreignKey("user_mail_notification_fk_1", companyUserId, Companies)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing MailNotifications (database name user_mail_notification_fk_2) */
    lazy val mailNotificationsFk = foreignKey("user_mail_notification_fk_2", mailNotificationId, MailNotifications)(r => r.id, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table UserMailNotifications */
  lazy val UserMailNotifications = new TableQuery(tag => new UserMailNotifications(tag))

  /** Entity class storing rows of table Users
   *  @param id Database column id SqlType(INT), AutoInc, PrimaryKey
   *  @param name Database column name SqlType(VARCHAR), Length(255,true)
   *  @param email Database column email SqlType(VARCHAR), Length(191,true)
   *  @param pic Database column pic SqlType(VARCHAR), Length(255,true)
   *  @param attr Database column attr SqlType(VARCHAR), Length(255,true)
   *  @param encryptedPassword Database column encrypted_password SqlType(VARCHAR), Length(255,true)
   *  @param resetPasswordToken Database column reset_password_token SqlType(VARCHAR), Length(191,true)
   *  @param resetPasswordSentAt Database column reset_password_sent_at SqlType(DATETIME)
   *  @param rememberCreatedAt Database column remember_created_at SqlType(DATETIME)
   *  @param signInCount Database column sign_in_count SqlType(INT), Default(0)
   *  @param currentSignInAt Database column current_sign_in_at SqlType(DATETIME)
   *  @param lastSignInAt Database column last_sign_in_at SqlType(DATETIME)
   *  @param currentSignInIp Database column current_sign_in_ip SqlType(VARCHAR), Length(255,true)
   *  @param lastSignInIp Database column last_sign_in_ip SqlType(VARCHAR), Length(255,true)
   *  @param createdAt Database column created_at SqlType(TIMESTAMP)
   *  @param updatedAt Database column updated_at SqlType(TIMESTAMP) */
  final case class UsersRow(id: Option[Int] = None, name: String, email: String, pic: String, attr: String, encryptedPassword: String, resetPasswordToken: Option[String], resetPasswordSentAt: Option[DateTime], rememberCreatedAt: Option[DateTime], signInCount: Int = 0, currentSignInAt: Option[DateTime], lastSignInAt: Option[DateTime], currentSignInIp: Option[String], lastSignInIp: Option[String], createdAt: Option[DateTime], updatedAt: Option[DateTime])
  /** GetResult implicit for fetching UsersRow objects using plain SQL queries */
  implicit def GetResultUsersRow(implicit e0: GR[Option[Int]], e1: GR[String], e2: GR[Option[String]], e3: GR[Option[DateTime]], e4: GR[Int]): GR[UsersRow] = GR{
    prs => import prs._
    UsersRow.tupled((<<?[Int], <<[String], <<[String], <<[String], <<[String], <<[String], <<?[String], <<?[DateTime], <<?[DateTime], <<[Int], <<?[DateTime], <<?[DateTime], <<?[String], <<?[String], <<[Option[DateTime]], <<[Option[DateTime]]))
  }
  /** Table description of table users. Objects of this class serve as prototypes for rows in queries. */
  class Users(_tableTag: Tag) extends profile.api.Table[UsersRow](_tableTag, "users") {
    def * = (Rep.Some(id), name, email, pic, attr, encryptedPassword, resetPasswordToken, resetPasswordSentAt, rememberCreatedAt, signInCount, currentSignInAt, lastSignInAt, currentSignInIp, lastSignInIp, createdAt, updatedAt) <> (UsersRow.tupled, UsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(name), Rep.Some(email), Rep.Some(pic), Rep.Some(attr), Rep.Some(encryptedPassword), resetPasswordToken, resetPasswordSentAt, rememberCreatedAt, Rep.Some(signInCount), currentSignInAt, lastSignInAt, currentSignInIp, lastSignInIp, Rep.Some(createdAt), Rep.Some(updatedAt)).shaped.<>({r=>import r._; _1.map(_=> UsersRow.tupled((_1, _2.get, _3.get, _4.get, _5.get, _6.get, _7, _8, _9, _10.get, _11, _12, _13, _14, _15.get, _16.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(INT), AutoInc, PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.AutoInc, O.PrimaryKey)
    /** Database column name SqlType(VARCHAR), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column email SqlType(VARCHAR), Length(191,true) */
    val email: Rep[String] = column[String]("email", O.Length(191,varying=true))
    /** Database column pic SqlType(VARCHAR), Length(255,true) */
    val pic: Rep[String] = column[String]("pic", O.Length(255,varying=true))
    /** Database column attr SqlType(VARCHAR), Length(255,true) */
    val attr: Rep[String] = column[String]("attr", O.Length(255,varying=true))
    /** Database column encrypted_password SqlType(VARCHAR), Length(255,true) */
    val encryptedPassword: Rep[String] = column[String]("encrypted_password", O.Length(255,varying=true))
    /** Database column reset_password_token SqlType(VARCHAR), Length(191,true) */
    val resetPasswordToken: Rep[Option[String]] = column[Option[String]]("reset_password_token", O.Length(191,varying=true))
    /** Database column reset_password_sent_at SqlType(DATETIME) */
    val resetPasswordSentAt: Rep[Option[DateTime]] = column[Option[DateTime]]("reset_password_sent_at")
    /** Database column remember_created_at SqlType(DATETIME) */
    val rememberCreatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("remember_created_at")
    /** Database column sign_in_count SqlType(INT), Default(0) */
    val signInCount: Rep[Int] = column[Int]("sign_in_count", O.Default(0))
    /** Database column current_sign_in_at SqlType(DATETIME) */
    val currentSignInAt: Rep[Option[DateTime]] = column[Option[DateTime]]("current_sign_in_at")
    /** Database column last_sign_in_at SqlType(DATETIME) */
    val lastSignInAt: Rep[Option[DateTime]] = column[Option[DateTime]]("last_sign_in_at")
    /** Database column current_sign_in_ip SqlType(VARCHAR), Length(255,true) */
    val currentSignInIp: Rep[Option[String]] = column[Option[String]]("current_sign_in_ip", O.Length(255,varying=true))
    /** Database column last_sign_in_ip SqlType(VARCHAR), Length(255,true) */
    val lastSignInIp: Rep[Option[String]] = column[Option[String]]("last_sign_in_ip", O.Length(255,varying=true))
    /** Database column created_at SqlType(TIMESTAMP) */
    val createdAt: Rep[Option[DateTime]] = column[Option[DateTime]]("created_at")
    /** Database column updated_at SqlType(TIMESTAMP) */
    val updatedAt: Rep[Option[DateTime]] = column[Option[DateTime]]("updated_at")

    /** Uniqueness Index over (email) (database name index_users_on_email) */
    val index1 = index("index_users_on_email", email, unique=true)
    /** Uniqueness Index over (resetPasswordToken) (database name index_users_on_reset_password_token) */
    val index2 = index("index_users_on_reset_password_token", resetPasswordToken, unique=true)
  }
  /** Collection-like TableQuery object for table Users */
  lazy val Users = new TableQuery(tag => new Users(tag))

  /** Entity class storing rows of table UsersRoles
   *  @param userId Database column user_id SqlType(INT)
   *  @param roleId Database column role_id SqlType(INT) */
  final case class UsersRolesRow(userId: Option[Int], roleId: Option[Int])
  /** GetResult implicit for fetching UsersRolesRow objects using plain SQL queries */
  implicit def GetResultUsersRolesRow(implicit e0: GR[Option[Int]]): GR[UsersRolesRow] = GR{
    prs => import prs._
    UsersRolesRow.tupled((<<?[Int], <<?[Int]))
  }
  /** Table description of table users_roles. Objects of this class serve as prototypes for rows in queries. */
  class UsersRoles(_tableTag: Tag) extends profile.api.Table[UsersRolesRow](_tableTag, "users_roles") {
    def * = (userId, roleId) <> (UsersRolesRow.tupled, UsersRolesRow.unapply)

    /** Database column user_id SqlType(INT) */
    val userId: Rep[Option[Int]] = column[Option[Int]]("user_id")
    /** Database column role_id SqlType(INT) */
    val roleId: Rep[Option[Int]] = column[Option[Int]]("role_id")

    /** Index over (userId,roleId) (database name index_users_roles_on_user_id_and_role_id) */
    val index1 = index("index_users_roles_on_user_id_and_role_id", (userId, roleId))
  }
  /** Collection-like TableQuery object for table UsersRoles */
  lazy val UsersRoles = new TableQuery(tag => new UsersRoles(tag))
}
