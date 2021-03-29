import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

public class dl {

    static String str = "In Deutschland können Eltern bis zum 14. Lebensjahr ihres Kindes entscheiden, ob es in der Schule am …\n" +
            "Geschichtsunterricht teilnimmt.\n" +
            "Religionsunterricht teilnimmt.\n" +
            "Politikunterricht teilnimmt.\n" +
            "Sprachunterricht teilnimmt.\n" +
            "\n" +
            "Welches Recht gehört zu den Grundrechten in Deutschland?\n" +
            "Waffenbesitz\n" +
            "Faustrecht\n" +
            "Meinungsfreiheit\n" +
            "Selbstjustiz\n" +
            "\n" +
            "Wie heißt die deutsche Verfassung?\n" +
            "Volksgesetz\n" +
            "Bundesgesetz\n" +
            "Deutsches Gesetz\n" +
            "Grundgesetz\n" +
            "\n" +
            "\n" +
            "Was steht nicht im Grundgesetz von Deutschland?\n" +
            "Die Würde des Menschen ist unantastbar.\n" +
            "Alle sollen gleich viel Geld haben.\n" +
            "Jeder Mensch darf seine Meinung sagen.\n" +
            "Alle sind vor dem Gesetz gleich.\n" +
            "\n" +
            "\n" +
            "Was ist mit dem deutschen Grundgesetz vereinbar?\n" +
            "Die Prügelstrafe\n" +
            "Die Folter\n" +
            "Die Todesstrafe\n" +
            "Die Geldstrafe\n" +
            "\n" +
            "\n" +
            "Eine Partei im Deutschen Bundestag will die Pressefreiheit abschaffen. Ist das möglich?\n" +
            "Ja, wenn mehr als die Hälfte der Abgeordneten im Bundestag dafür sind.\n" +
            "Ja, aber dazu müssen zwei Drittel der Abgeordneten im Bundestag dafür sein.\n" +
            "Nein, denn die Pressefreiheit ist ein Grundrecht. Sie kann nicht abgeschafft werden.\n" +
            "Nein, denn nur der Bundesrat kann die Pressefreiheit abschaffen.\n" +
            "\n" +
            "In Deutschland dürfen Menschen offen etwas gegen die Regierung sagen, weil …\n" +
            "hier Religionsfreiheit gilt.\n" +
            "die Menschen Steuern zahlen.\n" +
            "die Menschen das Wahlrecht haben.\n" +
            "hier Meinungsfreiheit gilt.\n" +
            "\n" +
            "\n" +
            "Deutschland ist ein Rechtsstaat. Was ist damit gemeint?\n" +
            "Alle Einwohner / Einwohnerinnen und der Staat müssen sich an die Gesetze halten.\n" +
            "Der Staat muss sich nicht an die Gesetze halten.\n" +
            "Nur Deutsche müssen die Gesetze befolgen.\n" +
            "Die Gerichte machen die Gesetze.\n" +
            "\n" +
            "Wahlen in Deutschland sind frei. Was bedeutet das?\n" +
            "Man darf Geld annehmen, wenn man dafür einen bestimmten\n" +
            "Kandidaten / eine bestimmte Kandidatin wählt.\n" +
            "Nur Personen, die noch nie im Gefängnis waren, dürfen wählen.\n" +
            "Der Wähler darf bei der Wahl weder beeinflusst noch zu einer bestimmten Stimmabgabe gezwungen werden und keine Nachteile durch die Wahl haben.\n" +
            "Alle wahlberechtigten Personen müssen wählen.\n" +
            "\n" +
            "\n" +
            "Welches Recht gehört zu den Grundrechten, die nach der deutschen Verfassung garantiert werden? Das Recht auf …\n" +
            "Glaubens- und Gewissensfreiheit\n" +
            "Unterhaltung\n" +
            "Arbeit\n" +
            "Wohnung\n" +
            "\n" +
            "Welches Grundrecht gilt in Deutschland nur für Ausländer / Ausländerinnen? Das Grundrecht auf …\n" +
            "Schutz der Familie\n" +
            "Menschenwürde\n" +
            "Asyl\n" +
            "Meinungsfreiheit\n" +
            "\n" +
            "Wie wird die Verfassung der Bundesrepublik Deutschland genannt?\n" +
            "Grundgesetz\n" +
            "Bundesverfassung\n" +
            "Gesetzbuch\n" +
            "Verfassungsvertrag\n" +
            "\n" +
            "Im Parlament steht der Begriff „Opposition“ für … \n" +
            "die regierenden Parteien.\n" +
            "die Fraktion mit den meisten Abgeordneten.\n" +
            "alle Parteien, die bei der letzten Wahl die 5 %-Hürde erreichen konnten.\n" +
            "alle Abgeordneten, die nicht zu der Regierungspartei / den\n" +
            "Regierungsparteien gehören.\n" +
            "\n" +
            "Was verbietet das Grundgesetz?\n" +
            "Militärdienst\n" +
            "Zwangsarbeit\n" +
            "Freie Berufswahl\n" +
            "Arbeit im Ausland\n" +
            "\n" +
            "Die deutschen Gesetze verbieten …\n" +
            "Meinungsfreiheit der Einwohner und Einwohnerinnen.\n" +
            "Petitionen der Bürger und Bürgerinnen.\n" +
            "Versammlungsfreiheit der Einwohner und Einwohnerinnen.\n" +
            "Ungleichbehandlung der Bürger und Bürgerinnen durch den Staat.\n" +
            "\n" +
            "Was versteht man unter dem Recht der „Freizügigkeit“ in Deutschland?\n" +
            "Man darf sich seinen Wohnort selbst aussuchen.\n" +
            "Man kann seinen Beruf wechseln.\n" +
            "Man darf sich für eine andere Religion entscheiden.\n" +
            "Man darf sich in der Öffentlichkeit nur leicht bekleidet bewegen.\n" +
            "Welches ist das Wappen der Bundesrepublik Deutschland?\n" +
            "1\n" +
            "2\n" +
            "3\n" +
            "4\n" +
            "\n" +
            "In Deutschland sind die meisten Erwerbstätigen …\n" +
            "in kleinen Familienunternehmen beschäftigt.\n" +
            "ehrenamtlich für ein Bundesland tätig.\n" +
            "selbstständig mit einer eigenen Firma tätig.\n" +
            "bei einer Firma oder Behörde beschäftigt.\n" +
            "\n" +
            "Meinungsfreiheit in Deutschland heißt, dass ich …\n" +
            "auf Flugblättern falsche Tatsachen behaupten darf.\n" +
            "meine Meinung in Leserbriefen äußern kann.\n" +
            "Nazi-Symbole tragen darf.\n" +
            "meine Meinung sagen darf, solange ich der Regierung nicht widerspreche.\n" +
            "\n" +
            "Wann ist die Meinungsfreiheit in Deutschland eingeschränkt?\n" +
            "Bei der öffentlichen Verbreitung falscher Behauptungen über einzelne Personen\n" +
            "Bei Meinungsäußerungen über die Bundesregierung\n" +
            "Bei Diskussionen über Religionen\n" +
            "Bei Kritik am Staat\n" +
            "\n" +
            "Welches Grundrecht ist in Artikel 1 des Grundgesetzes der Bundesrepublik Deutschland garantiert?\n" +
            "Die Unantastbarkeit der Menschenwürde\n" +
            "Das Recht auf Leben\n" +
            "Religionsfreiheit\n" +
            "Meinungsfreiheit\n" +
            "\n" +
            "Eine Partei in Deutschland verfolgt das Ziel, eine Diktatur zu errichten. Sie ist dann …\n" +
            "tolerant.\n" +
            "rechtsstaatlich orientiert.\n" +
            "gesetzestreu.\n" +
            "verfassungswidrig.\n" +
            "\n" +
            "Was für eine Staatsform hat Deutschland?\n" +
            "Monarchie\n" +
            "Diktatur\n" +
            "Republik\n" +
            "Fürstentum\n" +
            "\n" +
            "Wie viele Bundesländer hat die Bundesrepublik Deutschland?\n" +
            "14\n" +
            "15\n" +
            "16\n" +
            "17\n" +
            "\n" +
            "\n" +
            "Was ist kein Bundesland der Bundesrepublik Deutschland?\n" +
            "Elsass-Lothringen\n" +
            "Nordrhein-Westfalen\n" +
            "Mecklenburg-Vorpommern\n" +
            "Sachsen-Anhalt\n" +
            "\n" +
            "\n" +
            "\n" +
            "Deutschland ist …\n" +
            "ein sozialistischer Staat.\n" +
            "ein Bundesstaat.\n" +
            "eine Diktatur.\n" +
            "eine Monarchie.\n" +
            "\n" +
            "Welches Tier ist das Wappentier der Bundesrepublik Deutschland?\n" +
            "Löwe\n" +
            "Adler\n" +
            "Bär\n" +
            "Pferd\n" +
            "\n" +
            "Die Zusammenarbeit von Parteien zur Bildung einer Regierung nennt man in Deutschland …\n" +
            "Einheit.\n" +
            "Koalition.\n" +
            "Ministerium.\n" +
            "Fraktion.\n" +
            "\n" +
            "\n" +
            "Welche Aussage ist richtig? In Deutschland …\n" +
            "sind Staat und Religionsgemeinschaften voneinander getrennt.\n" +
            "bilden die Religionsgemeinschaften den Staat.\n" +
            "ist der Staat abhängig von den Religionsgemeinschaften.\n" +
            "bilden Staat und Religionsgemeinschaften eine Einheit.\n" +
            "\n" +
            "\n" +
            "Womit finanziert der deutsche Staat die Sozialversicherung?\n" +
            "Kirchensteuern\n" +
            "Sozialabgaben\n" +
            "Spendengeldern\n" +
            "Vereinsbeiträgen\n" +
            "\n" +
            "\n" +
            "Deutschland ist …\n" +
            "eine kommunistische Republik.\n" +
            "ein demokratischer und sozialer Bundesstaat.\n" +
            "eine kapitalistische und soziale Monarchie.\n" +
            "ein sozialer und sozialistischer Bundesstaat.\n" +
            "\n" +
            "Wer wählt in Deutschland die Abgeordneten zum Bundestag?\n" +
            "Das Militär\n" +
            "Die Wirtschaft\n" +
            "Das wahlberechtigte Volk\n" +
            "Die Verwaltung\n" +
            "\n" +
            "\n" +
            "Was ist kein Merkmal unserer Demokratie?\n" +
            "Regelmäßige Wahlen\n" +
            "Pressezensur\n" +
            "Meinungsfreiheit\n" +
            "Verschiedene Parteien\n" +
            "\n" +
            "\n" +
            "Was ist keine staatliche Gewalt in Deutschland?\n" +
            "Gesetzgebung\n" +
            "Regierung\n" +
            "Presse\n" +
            "Rechtsprechung\n" +
            "Was ist Deutschland nicht?\n" +
            "Eine Demokratie\n" +
            "Ein Rechtsstaat\n" +
            "Eine Monarchie\n" +
            "Ein Sozialstaat\n" +
            "\n" +
            "Welche Maßnahme schafft in Deutschland soziale Sicherheit?\n" +
            "Die Krankenversicherung\n" +
            "Die Autoversicherung\n" +
            "Die Gebäudeversicherung\n" +
            "Die Haftpflichtversicherung\n" +
            "\n" +
            "Wie werden die Regierungschefs / Regierungschefinnen der meisten Bundesländer in Deutschland genannt?\n" +
            "Erster Minister / Erste Ministerin\n" +
            "Premierminister / Premierministerin\n" +
            "Senator / Senatorin\n" +
            "Ministerpräsident / Ministerpräsidentin\n" +
            "\n" +
            "\n" +
            "Was hat jedes deutsche Bundesland?\n" +
            "Einen eigenen Außenminister / eine eigene Außenministerin\n" +
            "Eine eigene Währung\n" +
            "Eine eigene Armee\n" +
            "Eine eigene Regierung\n" +
            "\n" +
            "Warum gibt es in einer Demokratie mehr als eine Partei?\n" +
            "Weil dadurch die unterschiedlichen Meinungen der Bürger und Bürgerinnen vertreten werden\n" +
            "Damit Bestechung in der Politik begrenzt wird\n" +
            "Um politische Demonstrationen zu verhindern\n" +
            "Um wirtschaftlichen Wettbewerb anzuregen\n" +
            "\n" +
            "Wann kann in Deutschland eine Partei verboten werden?\n" +
            "Wenn ihr Wahlkampf zu teuer ist\n" +
            "Wenn sie gegen die Verfassung kämpft\n" +
            "Wenn sie Kritik am Staatsoberhaupt äußert\n" +
            "Wenn ihr Programm eine neue Richtung vorschlägt\n" +
            "\n" +
            "\n" +
            "Zu welcher Versicherung gehört die Pflegeversicherung?\n" +
            "Sozialversicherung\n" +
            "Unfallversicherung\n" +
            "Hausratsversicherung\n" +
            "Haftpflicht- und Feuerversicherung\n" +
            "\n" +
            "\n" +
            "Der deutsche Staat hat viele Aufgaben. Welche Aufgabe gehört nicht dazu?\n" +
            "Er bezahlt für alle Staatsangehörigen Urlaubsreisen.\n" +
            "Er zahlt Kindergeld.\n" +
            "Er unterstützt Museen.\n" +
            "Er fördert Sportler und Sportlerinnen.\n" +
            "\n" +
            "\n" +
            "Die Bundesrepublik Deutschland ist ein demokratischer und sozialer …\n" +
            "Staatenverbund.\n" +
            "Bundesstaat.\n" +
            "Staatenbund.\n" +
            "Zentralstaat.\n" +
            "Mit welchen Worten beginnt die deutsche Nationalhymne?\n" +
            "Völker, hört die Signale …\n" +
            "Einigkeit und Recht und Freiheit …\n" +
            "Freude schöner Götterfunken …\n" +
            "Deutschland einig Vaterland …\n" +
            "\n" +
            "Wer beschließt in Deutschland ein neues Gesetz?\n" +
            "Die Regierung\n" +
            "Das Parlament\n" +
            "Die Gerichte\n" +
            "Die Polizei\n" +
            "\n" +
            "Wen kann man als Bürger / Bürgerin in Deutschland nicht direkt wählen?\n" +
            "Abgeordnete des EU-Parlaments\n" +
            "Den Bundespräsidenten / die Bundespräsidentin\n" +
            "Landtagsabgeordnete\n" +
            "Bundestagsabgeordnete\n" +
            "\n" +
            "Der deutsche Staat hat viele Aufgaben. Welche Aufgabe gehört dazu?\n" +
            "Er baut Straßen und Schulen.\n" +
            "Er verkauft Lebensmittel und Kleidung.\n" +
            "Er versorgt alle Einwohner und Einwohnerinnen kostenlos\n" +
            "mit Zeitungen.\n" +
            "Er produziert Autos und Busse.\n" +
            "\n" +
            "Welches Organ gehört nicht zu den Verfassungsorganen Deutschlands?\n" +
            "Der Bundesrat\n" +
            "Der Bundespräsident / die Bundespräsidentin\n" +
            "Die Bürgerversammlung\n" +
            "Die Regierung\n" +
            "\n" +
            "Wer bestimmt in Deutschland die Schulpolitik?\n" +
            "Die Lehrer und Lehrerinnen\n" +
            "Die Bundesländer\n" +
            "Das Familienministerium\n" +
            "Die Universitäten\n" +
            "\n" +
            "\n" +
            "Zu einem demokratischen Rechtsstaat gehört es nicht, dass …\n" +
            "Menschen sich kritisch über die Regierung äußern können.\n" +
            "Bürger friedlich demonstrieren gehen dürfen.\n" +
            "Menschen von einer Privatpolizei ohne Grund verhaftet werden.\n" +
            "jemand ein Verbrechen begeht und deshalb verhaftet wird.\n" +
            "\n" +
            "\n" +
            "Was bedeutet „Rechtsstaat“ in Deutschland?\n" +
            "Der Staat hat Recht.\n" +
            "Es gibt nur rechte Parteien.\n" +
            "Die Bürger und Bürgerinnen entscheiden über Gesetze.\n" +
            "Der Staat muss die Gesetze einhalten.\n" +
            "\n" +
            "\n" +
            "Was zeigt dieses Bild?\n" +
            "Den Bundestagssitz in Berlin\n" +
            "Das Bundesverfassungsgericht in Karlsruhe\n" +
            "Das Bundesratsgebäude in Berlin\n" +
            "Das Bundeskanzleramt in Berlin\n" +
            "Wer wird meistens zum Präsidenten / zur Präsidentin des Deutschen Bundestages gewählt?\n" +
            "Der/die älteste Abgeordnete im Parlament\n" +
            "Der Ministerpräsident / die Ministerpräsidentin des größten Bundeslandes\n" +
            "Ein ehemaliger Bundeskanzler / eine ehemalige Bundeskanzlerin\n" +
            "Ein Abgeordneter / eine Abgeordnete der stärksten Fraktion\n" +
            "\n" +
            "\n" +
            "Welche Parteien wurden in Deutschland 2007 zur Partei „Die Linke“?\n" +
            "CDU und SSW\n" +
            "PDS und WASG\n" +
            "CSU und FDP\n" +
            "Bündnis 9/ Die Grünen und SPD\n" +
            "\n" +
            "\n" +
            "Die Wirtschaftsform in Deutschland nennt man …\n" +
            "freie Zentralwirtschaft.\n" +
            "soziale Marktwirtschaft.\n" +
            "gelenkte Zentralwirtschaft.\n" +
            "Planwirtschaft.\n" +
            "\n" +
            "\n" +
            "Was bedeutet „Volkssouveränität“? Alle Staatsgewalt geht vom …\n" +
            "Volke aus.\n" +
            "Bundestag aus.\n" +
            "preußischen König aus.\n" +
            "Bundesverfassungsgericht aus.\n" +
            "\n" +
            "\n" +
            "Was ist keine staatliche Gewalt in Deutschland?\n" +
            "Legislative\n" +
            "Judikative\n" +
            "Exekutive\n" +
            "Direktive\n" +
            "\n" +
            "Welches Amt gehört in Deutschland zur Gemeindeverwaltung?\n" +
            "Pfarramt\n" +
            "Ordnungsamt\n" +
            "Finanzamt\n" +
            "Auswärtiges Amt\n" +
            "\n" +
            "\n" +
            "Wer ernennt in Deutschland die Minister / die Ministerinnen der Bundesregierung?\n" +
            "Der Präsident / die Präsidentin des Bundesverfassungsgerichts\n" +
            "Der Bundespräsident / die Bundespräsidentin\n" +
            "Der Bundesratspräsident / die Bundesratspräsidentin\n" +
            "Der Bundestagspräsident / die Bundestagspräsidentin\n" +
            "\n" +
            "In Deutschland gehören der Bundestag und der Bundesrat zur …\n" +
            "Exekutive.\n" +
            "Legislative.\n" +
            "Direktive.\n" +
            "Judikative.\n" +
            "Was bedeutet „Volkssouveränität“?\n" +
            "Der König / die Königin herrscht über das Volk.\n" +
            "Das Bundesverfassungsgericht steht über der Verfassung.\n" +
            "Die Interessenverbände üben die Souveränität zusammen mit der Regierung aus.\n" +
            "Die Staatsgewalt geht vom Volke aus.\n" +
            "\n" +
            "Was gehört in Deutschland nicht zur Exekutive?\n" +
            "Die Polizei\n" +
            "Die Gerichte\n" +
            "Das Finanzamt\n" +
            "Die Ministerien\n" +
            "\n" +
            "Es gehört nicht zu den Aufgaben des Deutschen Bundestages, …\n" +
            "die Gesetze zu entwerfen.\n" +
            "die Bundesregierung zu kontrollieren.\n" +
            "den Bundeskanzler / die Bundeskanzlerin zu wählen.\n" +
            "das Bundeskabinett zu bilden.\n" +
            "\n" +
            "Was ist in Deutschland vor allem eine Aufgabe der Bundesländer?\n" +
            "Verteidigungspolitik\n" +
            "Außenpolitik\n" +
            "Wirtschaftspolitik\n" +
            "Schulpolitik\n" +
            "\n" +
            "Die Bundesrepublik Deutschland hat einen dreistufigen Verwaltungsaufbau. Wie heißt die unterste politische Stufe?\n" +
            "Stadträte\n" +
            "Landräte\n" +
            "Gemeinden\n" +
            "Bezirksämter\n" +
            "\n" +
            "Wo hält sich der deutsche Bundeskanzler / die deutsche Bundeskanzlerin am häufigsten auf? Am häufigsten ist er/sie …\n" +
            "in Bonn, weil sich dort das Bundeskanzleramt und der Bundestag befinden.\n" +
            "auf Schloss Meseberg, dem Gästehaus der Bundesregierung, um Staatsgäste zu empfangen.\n" +
            "auf Schloss Bellevue, dem Amtssitz des Bundespräsidenten / der Bundespräsidentin, um Staatsgäste zu empfangen.\n" +
            "in Berlin, weil sich dort das Bundeskanzleramt und der Bundestag befinden.\n" +
            "\n" +
            "\n" +
            "Wenn das Parlament eines deutschen Bundeslandes gewählt wird, nennt man das …\n" +
            "Kommunalwahl.\n" +
            "Landtagswahl.\n" +
            "Europawahl.\n" +
            "Bundestagswahl.\n" +
            "\n" +
            "\n" +
            "Die Bundesrepublik Deutschland ist heute gegliedert in …\n" +
            "vier Besatzungszonen.\n" +
            "einen Oststaat und einen Weststaat.\n" +
            "16 Kantone.\n" +
            "Bund, Länder und Kommunen.\n" +
            "\n" +
            "Wer schrieb den Text zur deutschen Nationalhymne?\n" +
            "Friedrich von Schiller\n" +
            "Clemens Brentano\n" +
            "Johann Wolfgang von Goethe\n" +
            "Heinrich Hoffmann von Fallersleben\n" +
            "\n" +
            "\n" +
            "Warum kontrolliert der Staat in Deutschland das Schulwesen?\n" +
            "Weil es in Deutschland nur staatliche Schulen gibt\n" +
            "Weil alle Schüler und Schülerinnen einen Schulabschluss haben müssen\n" +
            "Weil es in den Bundesländern verschiedene Schulen gibt\n" +
            "Weil es nach dem Grundgesetz seine Aufgabe ist\n" +
            "\n" +
            "\n" +
            "Der deutsche Bundespräsident Gustav Heinemann gibt Helmut Schmidt 1974 die Ernennungsurkunde zum deutschen Bundeskanzler. Was gehört zu den Aufgaben des deutschen Bundespräsidenten / der deutschen Bundespräsidentin?\n" +
            "Er/Sie führt die Regierungsgeschäfte.\n" +
            "Er/Sie kontrolliert die Regierungspartei.\n" +
            "Er/Sie wählt die Minister / Ministerinnen aus.\n" +
            "Er/Sie schlägt den Kanzler / die Kanzlerin zur Wahl vor.\n" +
            "\n" +
            "\n" +
            "Wie heißt der jetzige Bundeskanzler / die jetzige Bundeskanzlerin von Deutschland?\n" +
            "Gerhard Schröder\n" +
            "Jürgen Rüttgers\n" +
            "Klaus Wowereit\n" +
            "Angela Merkel\n" +
            "\n" +
            "\n" +
            "Die beiden größten Fraktionen im Deutschen Bundestag heißen zurzeit …\n" +
            "CDU/CSU und SPD.\n" +
            "Die Linke und Bündnis 9/ Die Grünen.\n" +
            "FDP und SPD.\n" +
            "Die Linke und FDP.\n" +
            "\n" +
            "\n" +
            "Wie heißt Deutschlands heutiges Staatsoberhaupt?\n" +
            "Frank-Walter Steinmeier\n" +
            "Norbert Lammert\n" +
            "Wolfgang Thierse\n" +
            "Edmund Stoiber\n" +
            "\n" +
            "\n" +
            "Was ist die Bundeswehr?\n" +
            "Die deutsche Polizei\n" +
            "Ein deutscher Hafen\n" +
            "Eine deutsche Bürgerinitiative\n" +
            "Die deutsche Armee\n" +
            "\n" +
            "Was bedeutet die Abkürzung FDP in Deutschland?\n" +
            "Friedliche Demonstrative Partei\n" +
            "Freie Deutschland Partei\n" +
            "Führende Demokratische Partei\n" +
            "Freie Demokratische Partei\n" +
            "Wer wählt den Bundeskanzler / die Bundeskanzlerin in Deutschland?\n" +
            "Der Bundesrat\n" +
            "Die Bundesversammlung\n" +
            "Das Volk\n" +
            "Der Bundestag\n" +
            "\n" +
            "Wer wählt den deutschen Bundeskanzler / die deutsche Bundeskanzlerin?\n" +
            "Das Volk\n" +
            "Die Bundesversammlung\n" +
            "Der Bundestag\n" +
            "Die Bundesregierung\n" +
            "\n" +
            "Wie heißt das Parlament für ganz Deutschland?\n" +
            "Bundesversammlung\n" +
            "Volkskammer\n" +
            "Bundestag\n" +
            "Bundesgerichtshof\n" +
            "\n" +
            "\n" +
            "Was bedeutet die Abkürzung CDU in Deutschland?\n" +
            "Christliche Deutsche Union\n" +
            "Club Deutscher Unternehmer\n" +
            "Christlicher Deutscher Umweltschutz\n" +
            "Christlich Demokratische Union\n" +
            "\n" +
            "\n" +
            "Was bedeutet die Abkürzung SPD?\n" +
            "Sozialistische Partei Deutschlands\n" +
            "Sozialpolitische Partei Deutschlands\n" +
            "Sozialdemokratische Partei Deutschlands\n" +
            "Sozialgerechte Partei Deutschlands\n" +
            "\n" +
            "\n" +
            "Welches Gericht in Deutschland ist zuständig für die Auslegung des Grundgesetzes?\n" +
            "Oberlandesgericht\n" +
            "Amtsgericht\n" +
            "Bundesverfassungsgericht\n" +
            "Verwaltungsgericht\n" +
            "\n" +
            "Wer leitet das deutsche Bundeskabinett?\n" +
            "Der Bundestagspräsident / die Bundestagspräsidentin\n" +
            "Der Bundespräsident / die Bundespräsidentin\n" +
            "Der Bundesratspräsident / die Bundesratspräsidentin\n" +
            "Der Bundeskanzler / die Bundeskanzlerin\n" +
            "\n" +
            "\n" +
            "Welche Hauptaufgabe hat der deutsche Bundespräsident / die deutsche Bundespräsidentin? Er / Sie …\n" +
            "regiert das Land.\n" +
            "entwirft die Gesetze.\n" +
            "repräsentiert das Land.\n" +
            "überwacht die Einhaltung der Gesetze.\n" +
            "\n" +
            "Wer bildet den deutschen Bundesrat?\n" +
            "Die Abgeordneten des Bundestages\n" +
            "Die Minister und Ministerinnen der Bundesregierung\n" +
            "Die Regierungsvertreter der Bundesländer\n" +
            "Die Parteimitglieder\n" +
            "Wer ist das Staatsoberhaupt der Bundesrepublik Deutschland?\n" +
            "Der Bundeskanzler / die Bundeskanzlerin\n" +
            "Der Bundespräsident / die Bundespräsidentin\n" +
            "Der Bundesratspräsident / die Bundesratspräsidentin\n" +
            "Der Bundestagspräsident / die Bundestagspräsidentin\n" +
            "\n" +
            "Wie nennt man in Deutschland die Vereinigung von Abgeordneten einer Partei im Parlament?\n" +
            "Verband\n" +
            "Ältestenrat\n" +
            "Fraktion\n" +
            "Opposition\n" +
            "\n" +
            "In Deutschland kann ein Regierungswechsel in einem Bundesland Auswirkungen auf die Bundespolitik haben. Das Regieren wird …\n" +
            "schwieriger, wenn sich dadurch die Mehrheit im Bundestag ändert.\n" +
            "leichter, wenn dadurch neue Parteien in den Bundesrat kommen.\n" +
            "schwieriger, wenn dadurch die Mehrheit im Bundesrat verändert wird.\n" +
            "leichter, wenn es sich um ein reiches Bundesland handelt.\n" +
            "\n" +
            "Je mehr „Zweitstimmen“ eine Partei bei einer Bundestagswahl bekommt, desto …\n" +
            "weniger Erststimmen kann sie haben.\n" +
            "mehr Direktkandidaten der Partei ziehen ins Parlament ein.\n" +
            "größer ist das Risiko, eine Koalition bilden zu müssen.\n" +
            "mehr Sitze erhält die Partei im Parlament.\n" +
            "\n" +
            "\n" +
            "Was gilt für die meisten Kinder in Deutschland?\n" +
            "Wahlpflicht\n" +
            "Schulpflicht\n" +
            "Schweigepflicht\n" +
            "Religionspflicht\n" +
            "\n" +
            "\n" +
            "Wer wählt in Deutschland den Bundespräsidenten / die Bundespräsidentin?\n" +
            "Die Bundesversammlung\n" +
            "Der Bundesrat\n" +
            "Das Bundesparlament\n" +
            "Das Bundesverfassungsgericht\n" +
            "\n" +
            "Die parlamentarische Opposition im Deutschen Bundestag …\n" +
            "kontrolliert die Regierung.\n" +
            "entscheidet, wer Bundesminister/Bundesministerin wird.\n" +
            "bestimmt, wer im Bundesrat sitzt.\n" +
            "schlägt die Regierungschefs/Regierungschefinnen der Länder vor.\n" +
            "\n" +
            "Die deutschen Bundesländer wirken an der Gesetzgebung des Bundes mit durch …\n" +
            "den Bundesrat.\n" +
            "die Bundesversammlung.\n" +
            "den Bundestag.\n" +
            "die Bundesregierung.\n" +
            "\n" +
            "Was bedeutet die Abkürzung CSU in Deutschland?\n" +
            "Christlich Sichere Union\n" +
            "Christlich Süddeutsche Union\n" +
            "Christlich Sozialer Unternehmerverband\n" +
            "Christlich-Soziale Union\n" +
            "\n" +
            "Ab welchem Alter darf man in Deutschland an der Wahl zum Deutschen Bundestag teilnehmen?\n" +
            "16\n" +
            "18\n" +
            "21\n" +
            "23\n" +
            "\n" +
            "Was muss jeder deutsche Staatsbürger / jede deutsche Staatsbürgerin ab dem 16. Lebensjahr besitzen?\n" +
            "Einen Reisepass\n" +
            "Einen Personalausweis\n" +
            "Einen Sozialversicherungsausweis\n" +
            "Einen Führerschein\n" +
            "\n" +
            "\n" +
            "Was bezahlt man in Deutschland automatisch, wenn man fest angestellt ist?\n" +
            "Sozialversicherung\n" +
            "Sozialhilfe\n" +
            "Kindergeld\n" +
            "Wohngeld\n" +
            "\n" +
            "\n" +
            "Wer bezahlt in Deutschland die Sozialversicherungen?\n" +
            "Arbeitgeber /Arbeitgeberinnen und Arbeitnehmer / Arbeitnehmerinnen\n" +
            "Nur Arbeitnehmer/Arbeitnehmerinnen\n" +
            "Alle Staatsangehörigen\n" +
            "Nur Arbeitgeber/Arbeitgeberinnen\n" +
            "\n" +
            "\n" +
            "Gewerkschaften sind Interessenverbände der …\n" +
            "Jugendlichen.\n" +
            "Arbeitnehmer und Arbeitnehmerinnen.\n" +
            "Rentner und Rentnerinnen.\n" +
            "Arbeitgeber und Arbeitgeberinnen.\n" +
            "\n" +
            "\n" +
            "Was wird in Deutschland als „Ampelkoalition“ bezeichnet? Die Zusammenarbeit …\n" +
            "der Bundestagsfraktionen von CDU und CSU\n" +
            "von SPD, FDP und Bündnis 9/ Die Grünen in einer Regierung\n" +
            "von CSU, Die Linke und Bündnis 9/ Die Grünen in einer Regierung\n" +
            "der Bundestagsfraktionen von CDU und SPD\n" +
            "\n" +
            "\n" +
            "Was ist eine Aufgabe von Wahlhelfern / Wahlhelferinnen in Deutschland?\n" +
            "Sie helfen alten Menschen bei der Stimmabgabe in der Wahlkabine.\n" +
            "Sie schreiben die Wahlbenachrichtigungen vor der Wahl.\n" +
            "Sie geben Zwischenergebnisse an die Medien weiter.\n" +
            "Sie zählen die Stimmen nach dem Ende der Wahl.\n" +
            "\n" +
            "Für wie viele Jahre wird der Bundestag in Deutschland gewählt?\n" +
            "2 Jahre\n" +
            "4 Jahre\n" +
            "6 Jahre\n" +
            "8 Jahre\n" +
            "\n" +
            "Wenn Abgeordnete im Deutschen Bundestag ihre Fraktion wechseln, …\n" +
            "dürfen sie nicht mehr an den Sitzungen des Parlaments teilnehmen.\n" +
            "kann die Regierung ihre Mehrheit verlieren.\n" +
            "muss der Bundespräsident / die Bundespräsidentin zuvor sein /ihr Einverständnis geben.\n" +
            "dürfen die Wähler / die Wählerinnen dieser Abgeordneten noch einmal wählen.\n" +
            "\n" +
            "Was gehört nicht zur gesetzlichen Sozialversicherung?\n" +
            "Die Lebensversicherung\n" +
            "Die gesetzliche Rentenversicherung\n" +
            "Die Arbeitslosenversicherung\n" +
            "Die Pflegeversicherung\n" +
            "\n" +
            "Womit kann man in der Bundesrepublik Deutschland geehrt werden, wenn man auf politischem, wirtschaftlichem, kulturellem, geistigem oder sozialem Gebiet eine besondere Leistung erbracht hat? Mit dem …\n" +
            "Bundesverdienstkreuz\n" +
            "Bundesadler\n" +
            "Vaterländischen Verdienstorden\n" +
            "Ehrentitel „Held der Deutschen Demokratischen Republik“\n" +
            "\n" +
            "Eine Frau in Deutschland verliert ihre Arbeit. Was darf nicht der Grund für diese Entlassung sein?\n" +
            "Die Frau ist lange krank und arbeitsunfähig.\n" +
            "Die Frau kam oft zu spät zur Arbeit.\n" +
            "Die Frau erledigt private Sachen während der Arbeitszeit.\n" +
            "Die Frau bekommt ein Kind und ihr Chef weiß das.\n" +
            "\n" +
            "\n" +
            "In Deutschland helfen ehrenamtliche Wahlhelfer und Wahlhelferinnen bei den Wahlen. Was ist eine Aufgabe von Wahlhelfern/ Wahlhelferinnen?\n" +
            "Sie helfen Kindern und alten Menschen beim Wählen.\n" +
            "Sie schreiben Karten und Briefe mit der Angabe des Wahllokals.\n" +
            "Sie geben Zwischenergebnisse an Journalisten weiter.\n" +
            "Sie zählen die Stimmen nach dem Ende der Wahl.\n" +
            "\n" +
            "\n" +
            "Bei einer Bundestagswahl in Deutschland darf jeder wählen, der …\n" +
            "in der Bundesrepublik Deutschland wohnt und wählen möchte.\n" +
            "Bürger/Bürgerin der Bundesrepublik Deutschland ist und mindestens 18 Jahre alt ist.\n" +
            "seit mindestens 3 Jahren in der Bundesrepublik Deutschland lebt.\n" +
            "Bürger/Bürgerin der Bundesrepublik Deutschland ist und mindestens 21 Jahre alt ist.\n" +
            "\n" +
            "Wie oft gibt es normalerweise Bundestagswahlen in Deutschland?\n" +
            "Alle drei Jahre\n" +
            "Alle vier Jahre\n" +
            "Alle fünf Jahre\n" +
            "Alle sechs Jahre\n" +
            "\n" +
            "In Deutschland darf man wählen. Was bedeutet das?\n" +
            "Alle deutschen Staatsangehörigen dürfen wählen, wenn sie das Mindestalter erreicht haben.\n" +
            "Nur verheiratete Personen dürfen wählen.\n" +
            "Nur Personen mit einem festen Arbeitsplatz dürfen wählen.\n" +
            "Alle Einwohner und Einwohnerinnen in Deutschland müssen wählen.\n" +
            "\n" +
            "Wahlen in Deutschland gewinnt die Partei, die …\n" +
            "die meisten Stimmen bekommt.\n" +
            "die meisten Männer mehrheitlich gewählt haben.\n" +
            "die meisten Stimmen bei den Arbeitern/Arbeiterinnen bekommen hat.\n" +
            "die meisten Erststimmen für ihren Kanzlerkandidaten/ ihre Kanzlerkandidatin erhalten hat.\n" +
            "\n" +
            "\n" +
            "Was bedeutet „aktives Wahlrecht“ in Deutschland?\n" +
            "Man kann gewählt werden.\n" +
            "Man muss gewählt werden.\n" +
            "Man kann wählen.\n" +
            "Man muss zur Auszählung der Stimmen gehen.\n" +
            "\n" +
            "\n" +
            "Wie viel Prozent der Zweitstimmen müssen Parteien mindestens bekommen, um in den Deutschen Bundestag gewählt zu werden?\n" +
            "3 %\n" +
            "4 %\n" +
            "5 %\n" +
            "6 %\n" +
            "\n" +
            "\n" +
            "Wahlen in Deutschland sind frei. Was bedeutet das?\n" +
            "Alle verurteilten Straftäter/Straftäterinnen dürfen nicht wählen.\n" +
            "Wenn ich wählen gehen möchte, muss mein Arbeitgeber / meine Arbeitgeberin mir freigeben.\n" +
            "Jede Person kann ohne Zwang entscheiden, ob sie wählen möchte und wen sie wählen möchte.\n" +
            "Ich kann frei entscheiden, wo ich wählen gehen möchte.\n" +
            "\n" +
            "Für wie viele Jahre wird der Bundestag in Deutschland gewählt?\n" +
            "2 Jahre\n" +
            "3 Jahre\n" +
            "4 Jahre\n" +
            "5 Jahre\n" +
            "\n" +
            "Die Wahlen in Deutschland sind …\n" +
            "speziell.\n" +
            "geheim.\n" +
            "berufsbezogen.\n" +
            "geschlechtsabhängig.\n" +
            "An demokratischen Wahlen in Deutschland teilzunehmen ist …\n" +
            "eine Pflicht.\n" +
            "ein Recht.\n" +
            "ein Zwang.\n" +
            "eine Last.\n" +
            "\n" +
            "Wenn Sie bei einer Bundestagswahl in Deutschland wählen dürfen, heißt das …\n" +
            "aktive Wahlkampagne.\n" +
            "aktives Wahlverfahren.\n" +
            "aktiver Wahlkampf.\n" +
            "aktives Wahlrecht.\n" +
            "\n" +
            "Was regelt das Wahlrecht in Deutschland?\n" +
            "Wer wählen darf, muss wählen.\n" +
            "Alle, die wollen, können wählen.\n" +
            "Wer nicht wählt, verliert das Recht zu wählen.\n" +
            "Wer wählen darf, kann wählen.\n" +
            "\n" +
            "Das Wahlsystem in Deutschland ist ein …\n" +
            "Zensuswahlrecht.\n" +
            "Dreiklassenwahlrecht.\n" +
            "Mehrheits- und Verhältniswahlrecht.\n" +
            "allgemeines Männerwahlrecht.\n" +
            "\n" +
            "Eine Partei möchte in den Deutschen Bundestag. Sie muss aber einen Mindestanteil an Wählerstimmen haben. Das heißt …\n" +
            "5 %-Hürde.\n" +
            "Zulassungsgrenze.\n" +
            "Basiswert.\n" +
            "Richtlinie.\n" +
            "\n" +
            "Was ist in Deutschland die „5 %Hürde“?\n" +
            "Abstimmungsregelung im Bundestag für kleinere Parteien\n" +
            "Anwesenheitskontrolle im Bundestag für Abstimmungen\n" +
            "Mindestanteil an Wählerstimmen, um ins Parlament zu kommen\n" +
            "Anwesenheitskontrolle im Bundesrat für Abstimmungen\n" +
            "\n" +
            "\n" +
            "In einer Demokratie ist eine Funktion von regelmäßigen Wahlen, …\n" +
            "die Bürger und Bürgerinnen zu zwingen, ihre Stimme abzugeben.\n" +
            "nach dem Willen der Wählermehrheit, den Wechsel der Regierung zu ermöglichen.\n" +
            "im Land bestehende Gesetze beizubehalten.\n" +
            "den Armen mehr Macht zu geben.\n" +
            "\n" +
            "\n" +
            "Warum gibt es die 5 % Hürde im Wahlgesetz der Bundesrepublik Deutschland? Es gibt sie, weil …\n" +
            "die Programme von vielen kleinen Parteien viele Gemeinsamkeiten haben.\n" +
            "die Bürger und Bürgerinnen bei vielen kleinen Parteien die Orientierung verlieren können.\n" +
            "viele kleine Parteien die Regierungsbildung erschweren.\n" +
            "die kleinen Parteien nicht so viel Geld haben, um die Politiker und Politikerinnen zu bezahlen.\n" +
            "Vom Volk gewählt wird in Deutschland …\n" +
            "der Bundeskanzler / die Bundeskanzlerin.\n" +
            "der Ministerpräsident / die Ministerpräsidentin eines Bundeslandes.\n" +
            "der Bundestag.\n" +
            "der Bundespräsident / die Bundespräsidentin.\n" +
            "\n" +
            "\n" +
            "In Deutschland ist ein Bürgermeister / eine Bürgermeisterin …\n" +
            "der Leiter / die Leiterin einer Schule.\n" +
            "der Chef / die Chefin einer Bank.\n" +
            "das Oberhaupt einer Gemeinde.\n" +
            "der/die Vorsitzende einer Partei.\n" +
            "\n" +
            "\n" +
            "Welchem Grundsatz unterliegen Wahlen in Deutschland? Wahlen in Deutschland sind …\n" +
            "frei, gleich, geheim.\n" +
            "offen, sicher, frei.\n" +
            "geschlossen, gleich, sicher.\n" +
            "sicher, offen, freiwillig.\n" +
            "\n" +
            "\n" +
            "Die Bundestagswahl in Deutschland ist die Wahl …\n" +
            "des Bundeskanzlers / der Bundeskanzlerin.\n" +
            "der Parlamente der Länder.\n" +
            "des Parlaments für Deutschland.\n" +
            "des Bundespräsidenten / der Bundespräsidentin.\n" +
            "\n" +
            "\n" +
            "Was bekommen wahlberechtigte Bürger und Bürgerinnen in Deutschland vor einer Wahl?\n" +
            "Eine Wahlbenachrichtigung von der Gemeinde\n" +
            "Eine Wahlerlaubnis vom Bundespräsidenten / von der Bundespräsidentin\n" +
            "Eine Benachrichtigung von der Bundesversammlung\n" +
            "Eine Benachrichtigung vom Pfarramt\n" +
            "\n" +
            "\n" +
            "Parlamentsmitglieder, die von den Bürgern und Bürgerinnen gewählt werden, nennt man …\n" +
            "Abgeordnete.\n" +
            "Kanzler/Kanzlerinnen.\n" +
            "Botschafter/Botschafterinnen.\n" +
            "Ministerpräsidenten /Ministerpräsidentinnen.\n" +
            "\n" +
            "\n" +
            "Welcher Stimmzettel wäre bei einer Bundestagswahl gültig?\n" +
            "1\n" +
            "2\n" +
            "3\n" +
            "4\n" +
            "\n" +
            "Viele Menschen in Deutschland arbeiten in ihrer Freizeit ehrenamtlich. Was bedeutet das?\n" +
            "Sie arbeiten als Soldaten/Soldatinnen.\n" +
            "Sie arbeiten freiwillig und unbezahlt in Vereinen und Verbänden.\n" +
            "Sie arbeiten in der Bundesregierung.\n" +
            "Sie arbeiten in einem Krankenhaus und verdienen dabei Geld.\n" +
            "Was ist bei Bundestags- und Landtagswahlen in Deutschland erlaubt?\n" +
            "Der Ehemann wählt für seine Frau mit.\n" +
            "Man kann durch Briefwahl seine Stimme abgeben.\n" +
            "Man kann am Wahltag telefonisch seine Stimme abgeben.\n" +
            "Kinder ab dem Alter von 14 Jahren dürfen wählen.\n" +
            "\n" +
            "Man will die Buslinie abschaffen, mit der Sie immer zur Arbeit fahren. Was können Sie machen, um die Buslinie zu erhalten?\n" +
            "Ich beteilige mich an einer Bürgerinitiative für die Erhaltung der Buslinie oder gründe selber eine Initiative.\n" +
            "Ich werde Mitglied in einem Sportverein und trainiere Radfahren.\n" +
            "Ich wende mich an das Finanzamt, weil ich als Steuerzahler/ Steuerzahlerin ein Recht auf die Buslinie habe.\n" +
            "Ich schreibe einen Brief an das Forstamt der Gemeinde.\n" +
            "\n" +
            "Wen vertreten die Gewerkschaften in Deutschland?\n" +
            "Große Unternehmen\n" +
            "Kleine Unternehmen\n" +
            "Selbstständige\n" +
            "Arbeitnehmer und Arbeitnehmerinnen\n" +
            "\n" +
            "Sie gehen in Deutschland zum Arbeitsgericht bei …\n" +
            "falscher Nebenkostenabrechnung.\n" +
            "ungerechtfertigter Kündigung durch Ihren Chef / Ihre Chefin.\n" +
            "Problemen mit den Nachbarn/Nachbarinnen.\n" +
            "Schwierigkeiten nach einem Verkehrsunfall.\n" +
            "\n" +
            "Welches Gericht ist in Deutschland bei Konflikten in der Arbeitswelt zuständig?\n" +
            "Das Familiengericht\n" +
            "Das Strafgericht\n" +
            "Das Arbeitsgericht\n" +
            "Das Amtsgericht\n" +
            "\n" +
            "Was kann ich in Deutschland machen, wenn mir mein Arbeitgeber / meine Arbeitgeberin zu Unrecht gekündigt hat?\n" +
            "Weiter arbeiten und freundlich zum Chef / zur Chefin sein\n" +
            "Ein Mahnverfahren gegen den Arbeitgeber / die Arbeitgeberin führen\n" +
            "Kündigungsschutzklage erheben\n" +
            "Den Arbeitgeber / die Arbeitgeberin bei der Polizei anzeigen\n" +
            "\n" +
            "\n" +
            "Wann kommt es in Deutschland zu einem Prozess vor Gericht? Wenn jemand …\n" +
            "zu einer anderen Religion übertritt\n" +
            "eine Straftat begangen hat und angeklagt wird\n" +
            "eine andere Meinung als die der Regierung vertritt\n" +
            "sein Auto falsch geparkt hat und es abgeschleppt wird\n" +
            "\n" +
            "\n" +
            "Wer berät in Deutschland Personen bei Rechtsfragen und vertritt sie vor Gericht?\n" +
            "Ein Rechtsanwalt / eine Rechtsanwältin\n" +
            "Ein Richter / eine Richterin\n" +
            "Ein Schöffe / eine Schöffin\n" +
            "Ein Staatsanwalt / eine Staatsanwältin\n" +
            "\n" +
            "Ein Richter / eine Richterin in Deutschland gehört zur …\n" +
            "Judikative.\n" +
            "Exekutive.\n" +
            "Operative.\n" +
            "Legislative.\n" +
            "\n" +
            "Ein Richter / eine Richterin gehört in Deutschland zur …\n" +
            "vollziehenden Gewalt.\n" +
            "rechtsprechenden Gewalt.\n" +
            "planenden Gewalt.\n" +
            "gesetzgebenden Gewalt.\n" +
            "\n" +
            "Was macht ein Schöffe / eine Schöffin in Deutschland? Er / Sie …\n" +
            "entscheidet mit Richtern / Richterinnen über Schuld und Strafe.\n" +
            "gibt Bürgern /Bürgerinnen rechtlichen Rat.\n" +
            "stellt Urkunden aus.\n" +
            "verteidigt den Angeklagten / die Angeklagte.\n" +
            "\n" +
            "\n" +
            "Was ist die Hauptaufgabe eines Richters / einer Richterin in Deutschland? Ein Richter / eine Richterin …\n" +
            "vertritt Bürger und Bürgerinnen vor einem Gericht.\n" +
            "arbeitet an einem Gericht und spricht Urteile.\n" +
            "ändert Gesetze.\n" +
            "betreut Jugendliche vor Gericht.\n" +
            "\n" +
            "\n" +
            "In Deutschland wird die Staatsgewalt geteilt. Für welche Staatsgewalt arbeitet ein Richter / eine Richterin? Für die …\n" +
            "Judikative\n" +
            "Exekutive\n" +
            "Presse\n" +
            "Legislative\n" +
            "\n" +
            "Was ist die Arbeit eines Richters / einer Richterin in Deutschland?\n" +
            "Deutschland regieren\n" +
            "Recht sprechen\n" +
            "Pläne erstellen\n" +
            "Gesetze erlassen\n" +
            "\n" +
            "\n" +
            "Wer kann Gerichtsschöffe / Gerichtsschöffin in Deutschland werden?\n" +
            "Alle in Deutschland geborenen Einwohner / Einwohnerinnen über 18 Jahre\n" +
            "Alle deutschen Staatsangehörigen älter als 24 und jünger als 7Jahre\n" +
            "Alle Personen, die seit mindestens 5 Jahren in Deutschland leben\n" +
            "Nur Personen mit einem abgeschlossenen Jurastudium\n" +
            "\n" +
            "\n" +
            "Wer baute die Mauer in Berlin?\n" +
            "Großbritannien\n" +
            "Die DDR\n" +
            "Die Bundesrepublik Deutschland\n" +
            "Die USA\n" +
            "\n" +
            "Was war am 8. Mai 1945?\n" +
            "Tod Adolf Hitlers\n" +
            "Beginn des Berliner Mauerbaus\n" +
            "Wahl von Konrad Adenauer zum Bundeskanzler\n" +
            "Ende des Zweiten Weltkriegs in Europa\n" +
            "\n" +
            "Wann waren die Nationalsozialisten in Deutschland an der Macht?\n" +
            "1888 bis 1918\n" +
            "1921 bis 1934\n" +
            "1933 bis 1945\n" +
            "1949 bis 1963\n" +
            "\n" +
            "Wie nennt man in Deutschland ein Verfahren vor einem Gericht?\n" +
            "Programm\n" +
            "Prozedur\n" +
            "Protokoll\n" +
            "Prozess\n" +
            "\n" +
            "Was ist die Aufgabe der Polizei in Deutschland?\n" +
            "Das Land zu verteidigen\n" +
            "Die Bürgerinnen und Bürger abzuhören\n" +
            "Die Gesetze zu beschließen\n" +
            "Die Einhaltung von Gesetzen zu überwachen\n" +
            "\n" +
            "Ein Gerichtsschöffe / eine Gerichtsschöffin in Deutschland ist …\n" +
            "der Stellvertreter / die Stellvertreterin des Stadtoberhaupts.\n" +
            "ein ehrenamtlicher Richter / eine ehrenamtliche Richterin.\n" +
            "ein Mitglied eines Gemeinderats.\n" +
            "eine Person, die Jura studiert hat.\n" +
            "\n" +
            "Wann waren die Nationalsozialisten mit Adolf Hitler in Deutschland an der Macht?\n" +
            "1918 bis 1923\n" +
            "1932 bis 1950\n" +
            "1933 bis 1945\n" +
            "1945 bis 1989\n" +
            "\n" +
            "Wann war der Zweite Weltkrieg zu Ende?\n" +
            "1933\n" +
            "1945\n" +
            "1949\n" +
            "1961\n" +
            "\n" +
            "In welchem Jahr wurde Hitler Reichskanzler?\n" +
            "1923\n" +
            "1927\n" +
            "1933\n" +
            "1936\n" +
            "\n" +
            "Die Nationalsozialisten mit Adolf Hitler errichteten 1933 in Deutschland …\n" +
            "eine Diktatur.\n" +
            "einen demokratischen Staat.\n" +
            "eine Monarchie.\n" +
            "ein Fürstentum.\n" +
            "\n" +
            "Was gab es in Deutschland nicht während der Zeit des Nationalsozialismus?\n" +
            "Freie Wahlen\n" +
            "Pressezensur\n" +
            "Willkürliche Verhaftungen\n" +
            "Verfolgung der Juden\n" +
            "\n" +
            "Was kennzeichnete den NS-Staat? Eine Politik …\n" +
            "des staatlichen Rassismus\n" +
            "der Meinungsfreiheit\n" +
            "der allgemeinen Religionsfreiheit\n" +
            "der Entwicklung der Demokratie\n" +
            "\n" +
            "In welchem Jahr zerstörten die Nationalsozialisten Synagogen und jüdische Geschäfte in Deutschland?\n" +
            "1925\n" +
            "1930\n" +
            "1938\n" +
            "1945\n" +
            "\n" +
            "Wie hieß der erste Bundeskanzler der Bundesrepublik Deutschland?\n" +
            "Konrad Adenauer\n" +
            "Kurt Georg Kiesinger\n" +
            "Helmut Schmidt\n" +
            "Willy Brandt\n" +
            "\n" +
            "Welche Länder wurden nach dem Zweiten Weltkrieg in Deutschland als „Alliierte Besatzungsmächte“ bezeichnet?\n" +
            "Sowjetunion, Großbritannien, Polen, Schweden\n" +
            "Frankreich, Sowjetunion, Italien, Japan\n" +
            "USA, Sowjetunion, Spanien, Portugal\n" +
            "USA, Sowjetunion, Großbritannien, Frankreich\n" +
            "\n" +
            "Das „Dritte Reich“ war eine …\n" +
            "Diktatur.\n" +
            "Demokratie.\n" +
            "Monarchie.\n" +
            "Räterepublik.\n" +
            "\n" +
            "Welcher Krieg dauerte von 1939 bis 1945?\n" +
            "Der Erste Weltkrieg\n" +
            "Der Zweite Weltkrieg\n" +
            "Der Vietnamkrieg\n" +
            "Der Golfkrieg\n" +
            "\n" +
            "Claus Graf Schenk von Stauffenberg wurde bekannt durch …\n" +
            "eine Goldmedaille bei den Olympischen Spielen 1936.\n" +
            "den Bau des Reichstagsgebäudes.\n" +
            "den Aufbau der Wehrmacht.\n" +
            "das Attentat auf Hitler am 20. Juli 1944.\n" +
            "\n" +
            "Was passierte am 9. November 1938 in Deutschland?\n" +
            "Mit dem Angriff auf Polen beginnt der Zweite Weltkrieg.\n" +
            "Die Nationalsozialisten verlieren eine Wahl und lösen den Reichstag auf.\n" +
            "Jüdische Geschäfte und Synagogen werden durch Nationalsozialisten und ihre Anhänger zerstört.\n" +
            "Hitler wird Reichspräsident und lässt alle Parteien verbieten.\n" +
            "\n" +
            "Bei welchen Demonstrationen in Deutschland riefen die Menschen „Wir sind das Volk“?\n" +
            "Beim Arbeiteraufstand 1953 in der DDR\n" +
            "Bei den Demonstrationen 1968 in der Bundesrepublik Deutschland\n" +
            "Bei den Anti-Atomkraft-Demonstrationen 1985 in der Bundesrepublik Deutschland\n" +
            "Bei den Montagsdemonstrationen 1989 in der DDR\n" +
            "\n" +
            "Welches Land war keine „Alliierte Besatzungsmacht“ in Deutschland?\n" +
            "USA\n" +
            "Sowjetunion\n" +
            "Frankreich\n" +
            "Japan\n" +
            "\n" +
            "Wann wurde die Bundesrepublik Deutschland gegründet?\n" +
            "1939\n" +
            "1945\n" +
            "1949\n" +
            "1951\n" +
            "\n" +
            "Was gab es während der Zeit des Nationalsozialismus in Deutschland?\n" +
            "Das Verbot von Parteien\n" +
            "Das Recht zur freien Entfaltung der Persönlichkeit\n" +
            "Pressefreiheit\n" +
            "Den Schutz der Menschenwürde\n" +
            "\n" +
            "Soziale Marktwirtschaft bedeutet, die Wirtschaft …\n" +
            "steuert sich allein nach Angebot und Nachfrage.\n" +
            "wird vom Staat geplant und gesteuert, Angebot und Nachfrage werden nicht berücksichtigt.\n" +
            "richtet sich nach der Nachfrage im Ausland.\n" +
            "richtet sich nach Angebot und Nachfrage, aber der Staat sorgt für einen sozialen Ausgleich.\n" +
            "\n" +
            "Die Bundesrepublik Deutschland ist ein Gründungsmitglied …\n" +
            "des Nordatlantikpakts (Nato).\n" +
            "der Vereinten Nationen (VN).\n" +
            "der Europäischen Union (EU).\n" +
            "des Warschauer Pakts.\n" +
            "\n" +
            "Wann wurde die DDR gegründet?\n" +
            "1947\n" +
            "1949\n" +
            "1953\n" +
            "1956\n" +
            "\n" +
            "Wie viele Besatzungszonen gab es nach dem Zweiten Weltkrieg?\n" +
            "3\n" +
            "4\n" +
            "5\n" +
            "6\n" +
            "\n" +
            "Welche deutsche Stadt wurde nach dem Zweiten Weltkrieg in vier Sektoren aufgeteilt?\n" +
            "München\n" +
            "Berlin\n" +
            "Dresden\n" +
            "Frankfurt (Oder)\n" +
            "\n" +
            "Wie endete der Zweite Weltkrieg in Europa offiziell?\n" +
            "Mit dem Tod Adolf Hitlers\n" +
            "Durch die bedingungslose Kapitulation Deutschlands\n" +
            "Mit dem Rückzug der Deutschen aus den besetzten Gebieten\n" +
            "Durch eine Revolution in Deutschland\n" +
            "\n" +
            "Vom Juni 1948 bis zum Mai 1949 wurden die Bürger und Bürgerinnen von West\u00ADBerlin durch eine Luftbrücke versorgt. Welcher Umstand war dafür verantwortlich?\n" +
            "Für Frankreich war eine Versorgung der West-Berliner Bevölkerung mit dem Flugzeug kostengünstiger.\n" +
            "Die amerikanischen Soldaten/Soldatinnen hatten beim Landtransport Angst vor Überfällen.\n" +
            "Für Großbritannien war die Versorgung über die Luftbrücke schneller.\n" +
            "Die Sowjetunion unterbrach den gesamten Verkehr auf dem Landwege.\n" +
            "\n" +
            "Der erste Bundeskanzler der Bundesrepublik Deutschland war …\n" +
            "Ludwig Erhard.\n" +
            "Willy Brandt.\n" +
            "Konrad Adenauer.\n" +
            "Gerhard Schröder.\n" +
            "\n" +
            "In welcher Besatzungszone wurde die DDR gegründet? In der …\n" +
            "amerikanischen Besatzungszone\n" +
            "französischen Besatzungszone\n" +
            "britischen Besatzungszone\n" +
            "sowjetischen Besatzungszone\n" +
            "\n" +
            "Was wollte Willy Brandt mit seinem Kniefall 197im ehemaligen jüdischen Ghetto in Warschau ausdrücken?\n" +
            "Er hat sich den ehemaligen Alliierten unterworfen.\n" +
            "Er bat Polen und die polnischen Juden um Vergebung.\n" +
            "Er zeigte seine Demut vor dem Warschauer Pakt.\n" +
            "Er sprach ein Gebet am Grab des Unbekannten Soldaten.\n" +
            "\n" +
            "Wann war in der Bundesrepublik Deutschland das „Wirtschaftswunder“?\n" +
            "40er-Jahre\n" +
            "50er-Jahre\n" +
            "70er-Jahre\n" +
            "80er-Jahre\n" +
            "\n" +
            "Wofür stand der Ausdruck „Eiserner Vorhang“? Für die Abschottung …\n" +
            "des Warschauer Pakts gegen den Westen\n" +
            "Norddeutschlands gegen Süddeutschland\n" +
            "Nazi-Deutschlands gegen die Alliierten\n" +
            "Europas gegen die USA\n" +
            "\n" +
            "Welcher deutsche Staat hatte eine schwarzrotgoldene Flagge mit Hammer, Zirkel und Ährenkranz?\n" +
            "Preußen\n" +
            "Bundesrepublik Deutschland\n" +
            "„Drittes Reich“\n" +
            "DDR\n" +
            "\n" +
            "Wann baute die DDR die Mauer in Berlin?\n" +
            "1919\n" +
            "1933\n" +
            "1961\n" +
            "1990\n" +
            "\n" +
            "Wann wurde die Mauer in Berlin für alle geöffnet?\n" +
            "1987\n" +
            "1989\n" +
            "1992\n" +
            "1995\n" +
            "\n" +
            "Welche Parteien wurden 1946 zwangsweise zur SED vereint, der Einheitspartei der späteren DDR?\n" +
            "KPD und SPD\n" +
            "SPD und CDU\n" +
            "CDU und FDP\n" +
            "KPD und CSU\n" +
            "\n" +
            "Was nannten die Menschen in Deutschland sehr lange „Die Stunde Null“?\n" +
            "Damit wird die Zeit nach der Wende im Jahr 1989 bezeichnet.\n" +
            "Damit wurde der Beginn des Zweiten Weltkriegs bezeichnet.\n" +
            "Darunter verstand man das Ende des Zweiten Weltkriegs\n" +
            "und den Beginn des Wiederaufbaus.\n" +
            "Damit ist die Stunde gemeint, in der die Uhr von der Sommerzeit auf die Winterzeit umgestellt wird.\n" +
            "\n" +
            "Im Jahr 1953 gab es in der DDR einen Aufstand, an den lange Zeit in der Bundesrepublik Deutschland ein Feiertag erinnerte. Wann war das?\n" +
            "1. Mai\n" +
            "17. Juni\n" +
            "20. Juli\n" +
            "9. November\n" +
            "\n" +
            "In welchem Jahr wurde die Mauer in Berlin gebaut?\n" +
            "1953\n" +
            "1956\n" +
            "1959\n" +
            "1961\n" +
            "\n" +
            "Was bedeutet die Abkürzung DDR?\n" +
            "Dritter Deutscher Rundfunk\n" +
            "Die Deutsche Republik\n" +
            "Dritte Deutsche Republik\n" +
            "Deutsche Demokratische Republik\n" +
            "\n" +
            "Welches heutige deutsche Bundesland gehörte früher zum Gebiet der DDR?\n" +
            "Brandenburg\n" +
            "Bayern\n" +
            "Saarland\n" +
            "Hessen\n" +
            "\n" +
            "Von 1961 bis 1989 war Berlin …\n" +
            "ohne Bürgermeister.\n" +
            "ein eigener Staat.\n" +
            "durch eine Mauer geteilt.\n" +
            "nur mit dem Flugzeug erreichbar.\n" +
            "\n" +
            "Welches heutige deutsche Bundesland gehörte früher zum Gebiet der DDR?\n" +
            "Hessen\n" +
            "Sachsen-Anhalt\n" +
            "Nordrhein-Westfalen\n" +
            "Saarland\n" +
            "\n" +
            "Welches heutige deutsche Bundesland gehörte früher zum Gebiet der DDR?\n" +
            "Thüringen\n" +
            "Hessen\n" +
            "Bayern\n" +
            "Bremen\n" +
            "\n" +
            "Mit der Abkürzung „Stasi“ meinte man in der DDR …\n" +
            "das Parlament.\n" +
            "das Ministerium für Staatssicherheit.\n" +
            "eine regierende Partei.\n" +
            "das Ministerium für Volksbildung.\n" +
            "\n" +
            "Welche der folgenden Auflistungen enthält nur Bundesländer, die zum Gebiet der früheren DDR gehörten?\n" +
            "Niedersachsen, Nordrhein-Westfalen, Hessen, SchleswigHolstein, Brandenburg\n" +
            "Mecklenburg-Vorpommern, Brandenburg, Sachsen, SachsenAnhalt, Thüringen\n" +
            "Bayern, Baden-Württemberg, Rheinland-Pfalz, Thüringen, Sachsen\n" +
            "Sachsen, Thüringen, Hessen, Niedersachsen, Brandenburg\n" +
            "\n" +
            "Wie hieß das Wirtschaftssystem der DDR?\n" +
            "Marktwirtschaft\n" +
            "Planwirtschaft\n" +
            "Angebot und Nachfrage\n" +
            "Kapitalismus\n" +
            "\n" +
            "Am 3. Oktober feiert man in Deutschland den Tag der Deutschen …\n" +
            "Einheit.\n" +
            "Nation.\n" +
            "Bundesländer.\n" +
            "Städte.\n" +
            "\n" +
            "Warum nennt man die Zeit im Herbst 1989 in der DDR „die Wende“? In dieser Zeit veränderte sich die DDR politisch …\n" +
            "von einer Diktatur zur Demokratie.\n" +
            "von einer liberalen Marktwirtschaft zum Sozialismus.\n" +
            "von einer Monarchie zur Sozialdemokratie.\n" +
            "von einem religiösen Staat zu einem kommunistischen Staat.\n" +
            "\n" +
            "Welches heutige deutsche Bundesland gehörte früher zum Gebiet der DDR?\n" +
            "Bayern\n" +
            "Niedersachsen\n" +
            "Sachsen\n" +
            "Baden-Württemberg\n" +
            "\n" +
            "Welches heutige deutsche Bundesland gehörte früher zum Gebiet der DDR?\n" +
            "Hessen\n" +
            "Schleswig-Holstein\n" +
            "Mecklenburg-Vorpommern\n" +
            "Saarland\n" +
            "\n" +
            "Zu wem gehörte die DDR im „Kalten Krieg“?\n" +
            "Zu den Westmächten\n" +
            "Zum Warschauer Pakt\n" +
            "Zur Nato\n" +
            "Zu den blockfreien Staaten\n" +
            "\n" +
            "Wie wurden die Bundesrepublik Deutschland und die DDR zu einem Staat?\n" +
            "Die Bundesrepublik Deutschland hat die DDR besetzt.\n" +
            "Die heutigen fünf östlichen Bundesländer sind der Bundesrepublik Deutschland beigetreten.\n" +
            "Die westlichen Bundesländer sind der DDR beigetreten.\n" +
            "Die DDR hat die Bundesrepublik Deutschland besetzt.\n" +
            "\n" +
            "Mit dem Beitritt der DDR zur Bundesrepublik Deutschland gehören die neuen Bundesländer nun auch …\n" +
            "zur Europäischen Union.\n" +
            "zum Warschauer Pakt.\n" +
            "zur OPEC.\n" +
            "zur Europäischen Verteidigungsgemeinschaft.\n" +
            "\n" +
            "In welchem Militärbündnis war die DDR Mitglied?\n" +
            "In der NATO\n" +
            "Im Rheinbund\n" +
            "Im Warschauer Pakt\n" +
            "Im Europabündnis\n" +
            "\n" +
            "Welches war das Wappen der Deutschen Demokratischen Republik?\n" +
            "1\n" +
            "2\n" +
            "3\n" +
            "4\n" +
            "\n" +
            "Welcher Politiker steht für die „Ostverträge“?\n" +
            "Helmut Kohl\n" +
            "Willy Brandt\n" +
            "Michail Gorbatschow\n" +
            "Ludwig Erhard\n" +
            "\n" +
            "Wie viele Einwohner hat Deutschland?\n" +
            "7Millionen\n" +
            "78 Millionen\n" +
            "8Millionen\n" +
            "9Millionen\n" +
            "\n" +
            "Wer wird als „Kanzler der Deutschen Einheit“ bezeichnet?\n" +
            "Gerhard Schröder\n" +
            "Helmut Kohl\n" +
            "Konrad Adenauer\n" +
            "Helmut Schmidt\n" +
            "\n" +
            "Was bedeutete im Jahr 1989 in Deutschland das Wort „Montagsdemonstration“?\n" +
            "In der Bundesrepublik waren Demonstrationen nur am Montag erlaubt.\n" +
            "Montags waren Demonstrationen gegen das DDR-Regime.\n" +
            "Am ersten Montag im Monat trafen sich in der Bundesrepublik Deutschland Demonstranten.\n" +
            "Montags demonstrierte man in der DDR gegen den Westen.\n" +
            "\n" +
            "Was war die „Stasi“?\n" +
            "Der Geheimdienst im „Dritten Reich“\n" +
            "Eine berühmte deutsche Gedenkstätte\n" +
            "Der Geheimdienst der DDR\n" +
            "Ein deutscher Sportverein während des Zweiten Weltkriegs\n" +
            "\n" +
            "Was ereignete sich am 17. Juni 1953 in der DDR?\n" +
            "Der feierliche Beitritt zum Warschauer Pakt\n" +
            "Landesweite Streiks und ein Volksaufstand\n" +
            "Der 1. SED-Parteitag\n" +
            "Der erste Besuch Fidel Castros\n" +
            "\n" +
            "Wie heißt Deutschland mit vollem Namen?\n" +
            "Bundesstaat Deutschland\n" +
            "Bundesländer Deutschland\n" +
            "Bundesrepublik Deutschland\n" +
            "Bundesbezirk Deutschland\n" +
            "\n" +
            "Welche Farben hat die deutsche Flagge?\n" +
            "Schwarz-rot-gold\n" +
            "Rot-weiß-schwarz\n" +
            "Schwarz-rot-grün\n" +
            "Schwarz-gelb-rot\n" +
            "\n" +
            "Welches Symbol ist im Plenarsaal des Deutschen Bundestages zu sehen?\n" +
            "Der Bundesadler\n" +
            "Die Fahne der Stadt Berlin\n" +
            "Der Reichsadler\n" +
            "Die Reichskrone\n" +
            "\n" +
            "In welchem Zeitraum gab es die Deutsche Demokratische Republik (DDR)?\n" +
            "1919 bis 1927\n" +
            "1933 bis 1945\n" +
            "1945 bis 1961\n" +
            "1949 bis 1990\n" +
            "\n" +
            "Deutschland hat die Grenzen von heute seit …\n" +
            "1933.\n" +
            "1949.\n" +
            "1971.\n" +
            "1990.\n" +
            "\n" +
            "Deutschland ist Mitglied des Schengener Abkommens. Was bedeutet das?\n" +
            "Deutsche können in viele Länder Europas ohne Passkontrolle reisen.\n" +
            "Alle Menschen können ohne Personenkontrolle in Deutschland einreisen.\n" +
            "Deutsche können ohne Passkontrolle in jedes Land reisen.\n" +
            "Deutsche können in jedem Land mit dem Euro bezahlen.\n" +
            "\n" +
            "Welches Land ist ein Nachbarland von Deutschland?\n" +
            "Rumänien\n" +
            "Bulgarien\n" +
            "Polen\n" +
            "Griechenland\n" +
            "\n" +
            "In welchem anderen Land gibt es eine große deutschsprachige Bevölkerung?\n" +
            "Tschechien\n" +
            "Norwegen\n" +
            "Spanien\n" +
            "Österreich\n" +
            "\n" +
            "Welches Land ist ein Nachbarland von Deutschland?\n" +
            "Finnland\n" +
            "Dänemark\n" +
            "Norwegen\n" +
            "Schweden\n" +
            "\n" +
            "Wie viele Bundesländer kamen bei der Wiedervereinigung 199zur Bundesrepublik Deutschland hinzu?\n" +
            "4\n" +
            "5\n" +
            "6\n" +
            "7\n" +
            "\n" +
            "Der 27. Januar ist in Deutschland ein offizieller Gedenktag. Woran erinnert dieser Tag?\n" +
            "An das Ende des Zweiten Weltkriegs\n" +
            "An die Verabschiedung des Grundgesetzes\n" +
            "An die Wiedervereinigung Deutschlands\n" +
            "An die Opfer des Nationalsozialismus\n" +
            "\n" +
            "Welches Land ist ein Nachbarland von Deutschland?\n" +
            "Ungarn\n" +
            "Portugal\n" +
            "Spanien\n" +
            "Schweiz\n" +
            "\n" +
            "Was bedeutet die Abkürzung EU?\n" +
            "Europäische Unternehmen\n" +
            "Europäische Union\n" +
            "Einheitliche Union\n" +
            "Euro Union\n" +
            "\n" +
            "Welche ist die Flagge der Europäischen Union?\n" +
            "1\n" +
            "2\n" +
            "3\n" +
            "4\n" +
            "\n" +
            "Wie wird der Beitritt der DDR zur Bundesrepublik Deutschland im Jahr 199allgemein genannt?\n" +
            "NATO-Osterweiterung\n" +
            "EU-Osterweiterung\n" +
            "Deutsche Wiedervereinigung\n" +
            "Europäische Gemeinschaft\n" +
            "\n" +
            "\n" +
            "Welches Land ist ein Nachbarland von Deutschland?\n" +
            "Spanien\n" +
            "Bulgarien\n" +
            "Norwegen\n" +
            "Luxemburg\n" +
            "\n" +
            "Was bedeutet der Begriff „Europäische Integration“?\n" +
            "Damit sind amerikanische Einwanderer in Europa gemeint.\n" +
            "Der Begriff meint den Einwanderungsstopp nach Europa.\n" +
            "Damit sind europäische Auswanderer in den USA gemeint.\n" +
            "Der Begriff meint den Zusammenschluss europäischer Staaten zur EU.\n" +
            "\n" +
            "Welches Land ist ein Nachbarland von Deutschland?\n" +
            "Tschechien\n" +
            "Bulgarien\n" +
            "Griechenland\n" +
            "Portugal\n" +
            "\n" +
            "Der französische Staatspräsident François Mitterand und der deutsche Bundeskanzler Helmut Kohl gedenken in Verdun gemeinsam der Toten beider Weltkriege. Welches Ziel der Europäischen Union wird bei diesem Treffen deutlich?\n" +
            "Freundschaft zwischen England und Deutschland\n" +
            "Reisefreiheit in alle Länder der EU\n" +
            "Frieden und Sicherheit in den Ländern der EU\n" +
            "Einheitliche Feiertage in den Ländern der EU\n" +
            "\n" +
            "2007 wurde das 5jährige Jubiläum der Römischen Verträge gefeiert. Was war der Inhalt der Verträge?\n" +
            "Beitritt Deutschlands zur NATO\n" +
            "Gründung der Europäischen Wirtschaftsgemeinschaft (EWG)\n" +
            "Verpflichtung Deutschlands zu Reparationsleistungen\n" +
            "Festlegung der Oder-Neiße-Linie als Ostgrenze\n" +
            "\n" +
            "Durch welche Verträge schloss sich die Bundesrepublik Deutschland mit anderen Staaten zur Europäischen Wirtschaftsgemeinschaft zusammen?\n" +
            "Durch die Hamburger Verträge\n" +
            "Durch die Römischen Verträge\n" +
            "Durch die Pariser Verträge\n" +
            "Durch die Londoner Verträge\n" +
            "\n" +
            "Das Europäische Parlament wird regelmäßig gewählt, nämlich alle …\n" +
            "5 Jahre.\n" +
            "6 Jahre.\n" +
            "7 Jahre.\n" +
            "8 Jahre.\n" +
            "\n" +
            "Wer wird bei der Europawahl gewählt?\n" +
            "Die Europäische Kommission\n" +
            "Die Länder, die in die EU eintreten dürfen\n" +
            "Die Abgeordneten des Europäischen Parlaments\n" +
            "Die europäische Verfassung\n" +
            "\n" +
            "Wo ist der Sitz des Europäischen Parlaments?\n" +
            "London\n" +
            "Paris\n" +
            "Berlin\n" +
            "Straßburg\n" +
            "\n" +
            "Wie viele Mitgliedstaaten hat die EU heute?\n" +
            "21\n" +
            "23\n" +
            "25\n" +
            "28\n" +
            "\n" +
            "An welchen Orten arbeitet das Europäische Parlament?\n" +
            "Paris, London und Den Haag\n" +
            "Straßburg, Luxemburg und Brüssel\n" +
            "Rom, Bern und Wien\n" +
            "Bonn, Zürich und Mailand\n" +
            "\n" +
            "Seit wann bezahlt man in Deutschland mit dem Euro in bar?\n" +
            "1995\n" +
            "1998\n" +
            "2002\n" +
            "2005\n" +
            "\n" +
            "Frau Seger bekommt ein Kind. Was muss sie tun, um Elterngeld zu erhalten?\n" +
            "Sie muss an ihre Krankenkasse schreiben.\n" +
            "Sie muss einen Antrag bei der Elterngeldstelle stellen.\n" +
            "Sie muss nichts tun, denn sie bekommt automatisch Elterngeld.\n" +
            "Sie muss das Arbeitsamt um Erlaubnis bitten.\n" +
            "\n" +
            "Maik und Sybille wollen mit Freunden an ihrem deutschen Wohnort eine Demonstration auf der Straße abhalten. Was müssen sie vorher tun?\n" +
            "Sie müssen die Demonstration anmelden.\n" +
            "Sie müssen nichts tun. Man darf in Deutschland jederzeit überall demonstrieren.\n" +
            "Sie können gar nichts tun, denn Demonstrationen sind in Deutschland grundsätzlich verboten.\n" +
            "Maik und Sybille müssen einen neuen Verein gründen, weil nur Vereine demonstrieren dürfen.\n" +
            "\n" +
            "Wer darf in Deutschland nicht als Paar zusammenleben?\n" +
            "Hans (2Jahre) und Marie (19 Jahre)\n" +
            "Tom (2Jahre) und Klaus (45 Jahre)\n" +
            "Sofie (35 Jahre) und Lisa (4Jahre)\n" +
            "Anne (13 Jahre) und Tim (25 Jahre)\n" +
            "\n" +
            "Eine Frau ist schwanger. Sie ist kurz vor und nach der Geburt ihres Kindes vom Gesetz besonders beschützt. Wie heißt dieser Schutz?\n" +
            "Elternzeit\n" +
            "Mutterschutz\n" +
            "Geburtsvorbereitung\n" +
            "Wochenbett\n" +
            "\n" +
            "Wer ist in Deutschland hauptsächlich verantwortlich für die Kindererziehung?\n" +
            "Der Staat\n" +
            "Die Eltern\n" +
            "Die Verwandten\n" +
            "Die Schulen\n" +
            "\n" +
            "Wenn man in Deutschland ein Kind schlägt, …\n" +
            "geht das niemanden etwas an.\n" +
            "geht das nur die Familie etwas an.\n" +
            "kann man dafür nicht bestraft werden.\n" +
            "kann man dafür bestraft werden.\n" +
            "\n" +
            "Wer entscheidet, ob ein Kind in Deutschland in den Kindergarten geht?\n" +
            "Der Staat\n" +
            "Die Bundesländer\n" +
            "Die Eltern / die Erziehungsberechtigten\n" +
            "Die Schulen\n" +
            "\n" +
            "Welchen Schulabschluss braucht man normalerweise, um an einer Universität in Deutschland ein Studium zu beginnen?\n" +
            "Das Abitur\n" +
            "Ein Diplom\n" +
            "Die Prokura\n" +
            "Eine Gesellenprüfung\n" +
            "\n" +
            "Ab welchem Alter ist man in Deutschland volljährig?\n" +
            "16\n" +
            "18\n" +
            "19\n" +
            "21\n" +
            "\n" +
            "Die Erziehung der Kinder in Deutschland ist vor allem Aufgabe …\n" +
            "des Staates.\n" +
            "der Eltern.\n" +
            "der Großeltern.\n" +
            "der Schulen.\n" +
            "\n" +
            "In Deutschland hat man die besten Chancen auf einen gut bezahlten Arbeitsplatz, wenn man …\n" +
            "katholisch ist.\n" +
            "gut ausgebildet ist.\n" +
            "eine Frau ist.\n" +
            "Mitglied einer Partei ist.\n" +
            "\n" +
            "In Deutschland …\n" +
            "darf man zur gleichen Zeit nur mit einem Partner / einer Partnerin verheiratet sein.\n" +
            "kann man mehrere Ehepartner/Ehepartnerinnen gleichzeitig haben.\n" +
            "darf man nicht wieder heiraten, wenn man einmal verheiratet war.\n" +
            "darf eine Frau nicht wieder heiraten, wenn ihr Mann gestorben ist.\n" +
            "\n" +
            "Wo müssen Sie sich anmelden, wenn Sie in Deutschland umziehen?\n" +
            "Beim Einwohnermeldeamt\n" +
            "Beim Standesamt\n" +
            "Beim Ordnungsamt\n" +
            "Beim Gewerbeamt\n" +
            "\n" +
            "Bei Erziehungsproblemen können Eltern in Deutschland Hilfe erhalten vom …\n" +
            "Ordnungsamt.\n" +
            "Schulamt.\n" +
            "Jugendamt.\n" +
            "Gesundheitsamt.\n" +
            "\n" +
            "Eine erwachsene Frau möchte in Deutschland das Abitur nachholen. Das kann sie an …\n" +
            "einer Hochschule\n" +
            "einem Abendgymnasium\n" +
            "einer Hauptschule\n" +
            "einer Privatuniversität\n" +
            "\n" +
            "Das Berufsinformationszentrum BIZ bei der Bundesagentur für Arbeit in Deutschland hilft bei der …\n" +
            "Rentenberechnung.\n" +
            "Lehrstellensuche.\n" +
            "Steuererklärung.\n" +
            "Krankenversicherung.\n" +
            "\n" +
            "Ein Mann möchte mit 3Jahren in Deutschland sein Abitur nachholen. Wo kann er das tun? An …\n" +
            "einer Hochschule\n" +
            "einem Abendgymnasium\n" +
            "einer Hauptschule\n" +
            "einer Privatuniversität\n" +
            "\n" +
            "In Deutschland sind Jugendliche ab 14 Jahren strafmündig. Das bedeutet: Jugendliche, die 14 Jahre und älter sind und gegen Strafgesetze verstoßen …\n" +
            "werden bestraft.\n" +
            "werden wie Erwachsene behandelt.\n" +
            "teilen die Strafe mit ihren Eltern.\n" +
            "werden nicht bestraft.\n" +
            "\n" +
            "In Deutschland dürfen sich Ehepaare scheiden lassen. Meistens müssen sie dazu das „Trennungsjahr“ einhalten. Was bedeutet das?\n" +
            "Der Scheidungsprozess dauert ein Jahr.\n" +
            "Mann und Frau sind ein Jahr verheiratet, dann ist die Scheidung möglich.\n" +
            "Das Besuchsrecht für die Kinder gilt ein Jahr.\n" +
            "Mann und Frau führen mindestens ein Jahr getrennt ihr eigenes Leben. Danach ist die Scheidung möglich.\n" +
            "\n" +
            "Ein Ehepaar möchte in Deutschland ein Restaurant eröffnen. Was braucht es dazu unbedingt?\n" +
            "Eine Erlaubnis der Polizei\n" +
            "Eine Genehmigung einer Partei\n" +
            "Eine Genehmigung des Einwohnermeldeamtes\n" +
            "Eine Gaststättenerlaubnis von der zuständigen Behörde\n" +
            "\n" +
            "Was darf das Jugendamt in Deutschland?\n" +
            "Es entscheidet, welche Schule das Kind besucht.\n" +
            "Es kann ein Kind, das geschlagen wird oder hungern muss, aus der Familie nehmen.\n" +
            "Es bezahlt das Kindergeld an die Eltern.\n" +
            "Es kontrolliert, ob das Kind einen Kindergarten besucht.\n" +
            "\n" +
            "In Deutschland hat ein Kind in der Schule …\n" +
            "Recht auf unbegrenzte Freizeit.\n" +
            "Wahlfreiheit für alle Fächer.\n" +
            "Anspruch auf Schulgeld.\n" +
            "Anwesenheitspflicht.\n" +
            "\n" +
            "Was bedeutet in Deutschland der Grundsatz der Gleichbehandlung?\n" +
            "Niemand darf z. B. wegen einer Behinderung benachteiligt werden.\n" +
            "Man darf andere Personen benachteiligen, wenn ausreichende persönliche Gründe hierfür vorliegen.\n" +
            "Niemand darf gegen Personen klagen, wenn sie benachteiligt wurden.\n" +
            "Es ist für alle Gesetz, benachteiligten Gruppen jährlich Geld zu spenden.\n" +
            "\n" +
            "Zu welchem Fest tragen Menschen in Deutschland bunte Kostüme und Masken?\n" +
            "An Rosenmontag\n" +
            "Am Maifeiertag\n" +
            "Beim Oktoberfest\n" +
            "An Pfingsten\n" +
            "\n" +
            "Wohin muss man in Deutschland zuerst gehen, wenn man heiraten möchte?\n" +
            "Zum Einwohnermeldeamt\n" +
            "Zum Ordnungsamt\n" +
            "Zur Agentur für Arbeit\n" +
            "Zum Standesamt\n" +
            "\n" +
            "Eine junge Frau in Deutschland, 22 Jahre alt, lebt mit ihrem Freund zusammen. Die Eltern der Frau finden das nicht gut, weil ihnen der Freund nicht gefällt. Was können die Eltern tun?\n" +
            "Sie müssen die Entscheidung der volljährigen Tochter respektieren.\n" +
            "Sie haben das Recht, die Tochter in die elterliche Wohnung zurückzuholen.\n" +
            "Sie können zur Polizei gehen und die Tochter anzeigen.\n" +
            "Sie suchen einen anderen Mann für die Tochter.\n" +
            "\n" +
            "In Deutschland haben Kinder ab dem Alter von drei Jahren bis zur Ersteinschulung einen Anspruch auf …\n" +
            "monatliches Taschengeld.\n" +
            "einen Platz in einem Sportverein.\n" +
            "einen Kindergartenplatz.\n" +
            "einen Ferienpass.\n" +
            "\n" +
            "Was ist in Deutschland ein Brauch zu Weihnachten?\n" +
            "Bunte Eier verstecken\n" +
            "Einen Tannenbaum schmücken\n" +
            "Sich mit Masken und Kostümen verkleiden\n" +
            "Kürbisse vor die Tür stellen\n" +
            "\n" +
            "Bei Erziehungsproblemen gehen Sie in Deutschland …\n" +
            "zum Arzt / zur Ärztin.\n" +
            "zum Gesundheitsamt.\n" +
            "zum Einwohnermeldeamt.\n" +
            "zum Jugendamt.\n" +
            "\n" +
            "Was braucht man in Deutschland für eine Ehescheidung?\n" +
            "Die Einwilligung der Eltern\n" +
            "Ein Attest eines Arztes / einer Ärztin\n" +
            "Die Einwilligung der Kinder\n" +
            "Die Unterstützung eines Anwalts / einer Anwältin\n" +
            "\n" +
            "\n" +
            "Wann beginnt die gesetzliche Nachtruhe in Deutschland?\n" +
            "Wenn die Sonne untergeht\n" +
            "Wenn die Nachbarn schlafen gehen\n" +
            "Um Uhr, Mitternacht\n" +
            "Um 22 Uhr\n" +
            "\n" +
            "Eine junge Frau will den Führerschein machen. Sie hat Angst vor der Prüfung, weil ihre Muttersprache nicht Deutsch ist. Was ist richtig?\n" +
            "Sie muss mindestens zehn Jahre in Deutschland leben, bevor sie den Führerschein machen kann.\n" +
            "Wenn sie kein Deutsch kann, darf sie keinen Führerschein haben.\n" +
            "Sie muss den Führerschein in dem Land machen, in dem man ihre Sprache spricht.\n" +
            "Sie kann die Theorie-Prüfung vielleicht in ihrer Muttersprache machen. Es gibt mehr als zehn Sprachen zur Auswahl.\n" +
            "\n" +
            "Die Volkshochschule in Deutschland ist eine Einrichtung …\n" +
            "für den Religionsunterricht.\n" +
            "nur für Jugendliche.\n" +
            "zur Weiterbildung.\n" +
            "nur für Rentner und Rentnerinnen.\n" +
            "\n" +
            "Welche Lebensform ist in Deutschland nicht erlaubt?\n" +
            "Mann und Frau sind geschieden und leben mit neuen Partnern zusammen.\n" +
            "Zwei Frauen leben zusammen.\n" +
            "Ein allein erziehender Vater lebt mit seinen zwei Kindern zusammen.\n" +
            "Ein Mann ist mit zwei Frauen zur selben Zeit verheiratet.\n" +
            "\n" +
            "Sie haben in Deutschland absichtlich einen Brief geöffnet, der an eine andere Person adressiert ist. Was haben Sie nicht beachtet?\n" +
            "Das Schweigerecht\n" +
            "Das Briefgeheimnis\n" +
            "Die Schweigepflicht\n" +
            "Die Meinungsfreiheit\n" +
            "\n" +
            "Was sollten Sie tun, wenn Sie von Ihrem Ansprechpartner /Ihrer Ansprechpartnerin in einer deutschen Behörde schlecht behandelt werden?\n" +
            "Ich kann nichts tun.\n" +
            "Ich muss mir diese Behandlung gefallen lassen.\n" +
            "Ich drohe der Person.\n" +
            "Ich kann mich beim Behördenleiter / bei der Behördenleiterin beschweren.\n" +
            "\n" +
            "Eine Frau, die ein zweijähriges Kind hat, bewirbt sich in Deutschland um eine Stelle. Was ist ein Beispiel für Diskriminierung? Sie bekommt die Stelle nur deshalb nicht, weil sie …\n" +
            "kein Englisch spricht.\n" +
            "zu hohe Gehaltsvorstellungen hat.\n" +
            "keine Erfahrungen in diesem Beruf hat.\n" +
            "Mutter ist.\n" +
            "\n" +
            "In den meisten Mietshäusern in Deutschland gibt es eine „Hausordnung“. Was steht in einer solchen „Hausordnung“? Sie nennt …\n" +
            "Regeln für die Benutzung öffentlicher Verkehrsmittel.\n" +
            "alle Mieterinnen und Mieter im Haus.\n" +
            "Regeln, an die sich alle Bewohner und Bewohnerinnen halten müssen.\n" +
            "die Adresse des nächsten Ordnungsamtes.\n" +
            "\n" +
            "Zwei Freunde wollen in ein öffentliches Schwimmbad in Deutschland. Beide haben eine dunkle Hautfarbe und werden deshalb nicht hineingelassen. Welches Recht wird in dieser Situation verletzt? Das Recht auf …\n" +
            "Meinungsfreiheit\n" +
            "Gleichbehandlung\n" +
            "Versammlungsfreiheit\n" +
            "Freizügigkeit\n" +
            "\n" +
            "Was tun Sie, wenn Sie eine falsche Rechnung von einer deutschen Behörde bekommen?\n" +
            "Ich lasse die Rechnung liegen.\n" +
            "Ich lege Widerspruch bei der Behörde ein.\n" +
            "Ich schicke die Rechnung an die Behörde zurück.\n" +
            "Ich gehe mit der Rechnung zum Finanzamt.\n" +
            "\n" +
            "Frau Frost arbeitet als fest angestellte Mitarbeiterin in einem Büro. Was muss sie nicht vom Gehalt bezahlen?\n" +
            "Lohnsteuer\n" +
            "Beiträge zur Arbeitslosenversicherung\n" +
            "Beiträge zur Renten- und Krankenversicherung\n" +
            "Umsatzsteuer\n" +
            "\n" +
            "Sie möchten bei einer Firma in Deutschland Ihr Arbeitsverhältnis beenden. Was müssen Sie beachten?\n" +
            "Die Gehaltszahlungen\n" +
            "Die Arbeitszeit\n" +
            "Die Kündigungsfrist\n" +
            "Die Versi";

    public static void main(String[] args) {
        str = str.replaceAll("[0-9%,.()?/-]"," ");
        str = str.replaceAll("[ ]+", " ");
        str = str.replace("\n", " ");
        String[] strArr = str.split(" ");
        TreeSet<String> set = new TreeSet<>(Arrays.asList(strArr));

        try {
            FileWriter myWriter = new FileWriter("D:\\LebenInDeutschland.txt");
            for (String s : set) {
                myWriter.write(s+"\n");
            }

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }
}
