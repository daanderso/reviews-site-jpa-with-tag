package com.Derek.reviewssitejpa;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {

	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private GenreRepository genreRepo;

	@Resource
	private TagRepository tagRepo;

	@Override
	public void run(String... args) throws Exception {
		// creating genre objects
		Genre action = new Genre("Action");
		Genre drama = new Genre("Drama");
		Genre comedy = new Genre("Comedy");
		Genre horror = new Genre("Horror");

		// saving genre objects to genre repo
		genreRepo.save(action);
		genreRepo.save(drama);
		genreRepo.save(comedy);
		genreRepo.save(horror);

		// creating Tag object

		Tag love = new Tag("love");
		Tag suspense = new Tag("suspense");
		Tag violence = new Tag("violence");
		Tag thriller = new Tag("thriller");
		Tag fun = new Tag("fun");
		Tag slasher = new Tag("slasher");

		// saving to Tag repo
		tagRepo.save(love);
		tagRepo.save(suspense);
		tagRepo.save(violence);
		tagRepo.save(thriller);
		tagRepo.save(fun);
		tagRepo.save(slasher);

		// creating review objects
		Review review1 = new Review(action, "Batman",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"2005",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"/images/batman.jpg", thriller, suspense);

		Review review2 = new Review(drama, "Shawshank Redemption",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"1994",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"/images/jail.jpg",suspense, violence );

		Review review3 = new Review(action, "Superman",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"1978",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"/images/superman.jpg", thriller, fun);

		Review review4 = new Review(comedy, "Happy Gilmore",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"1996",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"/images/gilmore.jpg", fun);

		Review review5 = new Review(horror, "Friday the 13th",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"1980",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"/images/jason.jpg",slasher, violence );

		// saving review objects to review repo
		reviewRepo.save(review1);
		reviewRepo.save(review2);
		reviewRepo.save(review3);
		reviewRepo.save(review4);
		reviewRepo.save(review5);

	}

}
