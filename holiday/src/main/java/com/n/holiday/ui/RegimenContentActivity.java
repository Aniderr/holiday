package com.n.holiday.ui;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.n.holiday.R;
import com.zg.apps.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegimenContentActivity extends BaseActivity {

    @Bind(R.id.title)
    TextView title;

    @Bind(R.id.content_img)
    ImageView contentImg;

    @Bind(R.id.content_01)
    TextView content1;

    @Bind(R.id.content_02)
    TextView content2;

    @Bind(R.id.content_03)
    TextView content3;

    @Bind(R.id.content_04)
    TextView content4;

    @Bind(R.id.content_05)
    TextView content5;

    @Bind(R.id.content_06)
    TextView content6;

    @Bind(R.id.content_tv)
    TextView contentTv;

    String chun[] = {
            "饮食调养方面要考虑春季阳气初生，宜食辛甘发散之品，不宜食酸收之味。《素问藏气法时论》说：“肝主春，……肝苦急，急食甘以缓之，……肝欲散，急食辛以散之，用辛补之，酸泻之”。过了立春就意味着春天要到了，万物生发，一派生机勃勃。\n" +
                    "春季养生要顺应春天阳气生发，万物始生的特点，注意保护阳气，着眼于一个“生”字。按自然界属性，春属木，与肝相应。肝的生理特点主疏泄，在志为怒，恶抑郁而喜调达。有目的地选择一些柔肝养肝、疏肝力理气的草药和食品，草药如枸杞、郁金、丹参、元胡等，食品选择辛温发散的大枣、豆豉、葱、香菜、花生等灵活地进行配方选膳。\n" +
                    "在春季精神养生方面，要力戒暴怒，更忌情怀忧郁，做到心胸开阔，乐观向上，保持心境愉悦的好心态。同时要充分利用、珍惜春季大自然“发陈”之时，借阳气上升，万物萌生，人体新陈代谢旺盛之机，通过适当的调摄，使春阳之气得以宣达，代谢机能得以正常运行。",
    "在雨水节气之后，随着降雨有所增多，寒湿之邪最易困着脾脏。同时湿邪留恋，难以去除，故雨水前后应当着重养护脾脏。雨水节气中，地湿之气渐升，且早晨时有露、霜出现。所以针对这样的气候特点，饮食调养应侧重于调养脾胃和祛风除湿。又由于此时气候较阴冷，可以适当地进补，如蜂蜜、大枣、山药、银耳等都是适合这一节气的补品。\n" +
            "这种变化无常的天气，容易引起人的情绪波动，乃至心神不安，影响人的身心健康，对高血压、心脏病、哮喘患者更是不利。为了消除这些不利的因素，除了应当继续进行春捂外，应采取积极的精神调摄养生锻炼法。保持情绪稳定对身心健康有着十分重要的作用。\n" +
            "雨水后，春风送暖，致病的细菌、病毒易随风传播，故春季传染病常易暴发流行。每个人应该保护好自己，注意锻炼身体，增强抵抗力，预防疾病的发生。",
    "惊蛰时节人体的肝阳之气渐升，阴血相对不足，养生应顺乎阳气的升发、万物始生的特点，使自身的精神、情志、气血也如春日一样舒展畅达，生机盎然。\n" +
            "从饮食方面来看，惊蛰时节饮食起居应顺肝之性，助益脾气，令五脏和平。宜多吃富含植物蛋白质、维生素的清淡食物，少食动物脂肪类食物。可多食鸭血、菠菜、芦荟、水萝卜、苦瓜、木耳菜、芹菜、油菜、山药、莲子、银耳等食物。\n" +
            "由于春季与肝相应，如养生不当则可伤肝。现代流行病学调查亦证实，惊蛰属肝病的高发季节。此外，诸如流感、流脑、水痘、带状疱疹、流行性出血热等在这一节气都易流行爆发，因此要严防此类疾病。",
    "由于春分节气平分了昼夜、寒暑，人们在保健养生时应注意保持人体的阴阳平衡状态。《素问?骨空论》：“调其阴阳，不足则补，有余则泻”。传统饮食养生与中医治疗均可概括为补虚、泻实两方面。如益气、养血、滋阴、助阳、填精、生津为补虚；解表、清热、利水、泻下、祛寒、去风、燥湿等方面则可视为泻实。\n" +
            "中医养生实践证明，无论补或泻，都应坚持调整阴阳，以平为期的原则，科学地进行饮食保健，才能有效地防治很多非感染性疾病。\n" +
            "春天到来从立春节气到清明节气前后是草木生长萌芽期，人体血液也正处于旺盛时期，激素水平也处于相对高峰期，此时易发常见的非感染性疾病有高血压、月经失调、痔疮及过敏性疾病等。\n" +
            "在此节气的饮食调养，应当根据自己的实际情况选择能够保持机体功能协调平衡的膳食，禁忌偏热、偏寒、偏升、偏降的饮食误区，如在烹调鱼、虾、蟹等寒性食物时，其原则必佐以葱、姜、酒、醋类温性调料，以防止本菜肴性寒偏凉，食后有损脾胃而引起脘腹不舒之弊。",
    "“就中医养生来讲，清明是一个尤为重要的节气。”中医认为人应四时，春季万物生长，机体也是如此。从中医来说，吐纳调息法对人体阳气有益。因此，建议大家穿着宽松衣服多到空气清新之处，比如公园、广场、树林、山坡等地慢走、打拳、做操，尽量多活动，使阳气增长有路。\n" +
            "而立春之后，体内肝气随着春日渐深而愈盛，在清明之际达到最旺。常言道过犹不及，如果肝气过旺，会对脾胃产生不良影响，妨碍食物正常消化吸收，还可造成情绪失调、气血运行不畅，从而引发各种疾病。这段时间是高血压病和呼吸系统疾病的高发期，要予以重视。\n" +
            "清明节又称“寒食节”，有些地方还保留着清明禁火吃冷食的习惯。不过，有些人是不适合吃冷食的，在清明时节，凡是耗损或阻碍阳气的情况都应该避免。\n" +
            "清明时节的饮食宜温，应多吃些蔬菜水果，尤其是韭菜等时令蔬菜，还有白菜、萝卜等也适宜多吃。另外，清明节气中可多吃些护肝养肺的食品，比如荠菜、菠菜、山药，对身体有好处。",
            "谷雨到来，暮春到了，万物生长渐旺，天气也渐热。中午气温较高，但早晚气温仍较低，因此早晚时要适当加穿衣服，尤其要注意切勿大汗后吹风，以防感冒；过敏体质的人外出时还要预防花粉过敏，预防过敏性鼻炎、过敏性哮喘等的发作。\n" +
                    "此时阳气渐长，阴气渐消，要早睡早起，不要过度出汗，以调养脏气。另外，由于谷雨时节雨水较多，要防湿邪侵入人体，出现肩颈痛、关节疼痛、脘腹胀满、不欲饮食等病症。\n" +
                    "在情志、运动方面也如清明节养生一样，保持心情舒畅、心胸宽广，听音乐、钓鱼、春游、太极拳、散步等都能陶冶性情，切忌遇事忧愁焦虑，甚至动肝火。\n" +
                    "此时，肝脏气伏，心气逐渐旺盛，脾气也处于旺盛时期，正是身体补益的大好时机，但不能像冬天一样进补，应当食用一些益肝补肾的食物，以顺应阴阳的变化，为安然度过盛夏打下基础。"};


    String xia[] = {
            "立夏之后，天气逐渐转热，饮食宜清淡，应以易消化、富含维生素的食物为主，大鱼大肉和油腻辛辣的食物要少吃。立夏以后饮食原则是“春夏养阳”，养阳重在养心，养心可多喝牛奶、多吃豆制品、鸡肉、瘦肉等，既能补充营养，又起到强心的作用。平时多吃蔬菜、水果及粗粮，可增加纤维素、维生素B、C的供给，能起到预防动脉硬化的作用。总之立夏之季要养心，为安度酷暑做准备，使身体各脏腑功能正常，以达到“正气充足，邪不可干”的境界。\n" +
                    "传统中医认为，“暑易伤气”，“暑易入心”。因此，值此时节，人们要重视精神的调养，加强对心脏的保养，尤其是老年人要有意识地进行精神调养，保持神清气和、心情愉快的状态，切忌大悲大喜，以免伤心、伤身、伤神。",
            "进入小满后，气温不断升高，人们往往喜爱用冷饮消暑降温，但冷饮过量会导致腹痛、腹泻等病症。此时进食生冷饮食易引起胃肠不适而出现腹痛、腹泻等症，由于小儿消化系统发育尚未健全，老人脏腑机能逐渐衰退，故小孩及老人更易出现此种情况。因此，饮食方面要注意避免过量进食生冷食物。\n" +
                    "　 \n" +
                    "另外，小满后不但天气炎热，汗出较多，雨水也较多，饮食调养宜以清爽清淡的素食为主，常吃具有清利湿热、养阴作用的食物，如赤小豆、薏苡仁、绿豆、冬瓜、黄瓜、黄花菜、水芹、荸荠、黑木耳、胡萝卜、西红柿、西瓜、山药、鲫鱼、草鱼、鸭肉等，忌吃膏粱厚味、甘肥滋腻、生湿助湿的食物，当然也可配合药膳进行调理，还可以常饮些生脉饮以益气生津。",
            "中医养生专家提示我们，芒种节气的最佳时令饮食是：桑椹。又名桑果，早在两千多年前，桑椹就已是皇帝御用的补品。成熟的桑椹味甜汁多，酸甜适口，又被称为“民间圣果”。\n" +
                    "桑椹味甘酸，性微寒，入心、肝、肾经，具有补肝益肾、生津润肠、乌发明目等功效，主治阴血不足而致的头晕目眩、耳鸣心悸、烦躁失眠、腰膝酸软、须发早白、消渴口干、大便干结等症。桑椹入胃，能补充胃液的缺乏，促进胃液的消化，入肠能促进肠液分泌，增进胃肠蠕动，因而有补益强壮之功。现代医学认为，桑椹果实中含有丰富的葡萄糖、蔗糖、果糖、胡萝卜素、维生素（A、B1、B2、C）、苹果酸、琥珀酸、酒石酸及矿物质钙、磷、铁、铜、锌等营养物质。桑树特殊的生长环境决定了桑椹具有天然生长、无任何污染的特点，被医学界誉为\"21世纪的最佳保健果品\"。",
            "在中医养生理论中，夏至是阳气最旺的时节，这一时节的养生保健，一方面要顺应夏季阳盛于外的特点，注意保护阳气；另一方面，夏至也是所谓“阴阳争死生分”的时节，俗话说“夏至—阴生”，也就是说，尽管天气炎热，可阴气已开始生长。 \n" +
                    "在此时节，为顺应自然界阴阳盛衰的变化，一般宜晚睡早起，并利用午休来弥补夜晚睡眠的不足。年老体弱者则应早睡早起，尽量保持每天有7小时的睡眠时间。夏至时节，大多数人会有全身困倦乏力以及头痛头晕的症状，严重者可影响日常生活和工作。究其原因，首先是由于这一时节气温高，人体只能通过排汗来散热，使人体内的水分大量流失，此时若不及时补充水分，就会使人体血容量减少，大脑会因此而供血不足，进而造成头痛头晕。造成头痛头晕的另一种原因是，人体出汗时体表血管会扩张，更多的血液会流向体表，这种血液的再分配可使血压偏低的人血压更低，从而发生头痛头晕。",
            "小暑是二十四节气的第11个节气，也是人体阳气最旺盛的时候，“春夏养阳”。所以人们在工作劳动之时，要注意劳逸结合，保护人体的阳气。\n" +
                    "“热在三伏”，此时正是进入伏天的开始。“伏”即伏藏的意思，所以人们应当少外出以避暑气。民间度过伏天的办法，就是吃清凉消暑的食品。俗话说“头伏饺子二伏面，三伏烙饼摊鸡蛋”。这种吃法便是为了使身体多出汗，排出体内的各种毒素。天气热的时候要喝粥，用荷叶、土茯苓、扁豆、薏米、猪苓、泽泻、木棉花等材料煲成的消暑汤或粥，或甜或咸，非常适合此节气食用，多吃水果也有益的防暑，但是不要食用过量，以免增加肠胃负担，严重的会造成腹泻。民间还有：“冬不坐石，夏不坐木。”的说法。\n" +
                    "小暑过后，气温高、湿度大。久置露天里的木料，如椅凳等，经过露打雨淋，含水分较多，表面看上去是干的，可是经太阳一晒，温度升高，便会向外散发潮气，在上面坐久了，能诱发痔疮、风湿和关节炎等疾病。所以，尤其是中老年人，一定要注意不能长时间坐在露天放置的木料上。",
    "大暑期间应该多吃丝瓜、西兰花和茄子等当季蔬菜。大暑天气酷热，出汗多，脾胃活动相对较差。这时人会感觉比较累和食欲不振。而淮山有补脾健胃，益气补肾作用。多吃淮山一类益气养阴的食品，可以促进消化，改善腰膝酸软，使人感到精力旺\n" +
            "如果你是高血压或糖尿病患者，那么吃南瓜就最好不过。南瓜富含维生素、蛋白质和多种氨基酸，而且以碳水化合物为主，脂肪含量很低，多吃有助于降低血糖和血脂。另外，南瓜还能排毒养颜，爱美的女士当然不能错过。俗语说“冬吃萝卜夏吃姜”。吃姜有助于驱除体内寒气，大家可以尝试一下子姜炒牛肉、子姜炒木耳等菜式。但吃姜的时间也有讲究，最好不要在晚上吃。冬补三九，夏补三伏。家禽肉的营养成分主要是蛋白质，其次是脂肪、微生物和矿物质等，相对于家畜肉而言，是低脂肪高蛋白的食物，其蛋白质也属于优质蛋白。鸡、鸭、鸽子等家禽都是大暑进补的上选。"};


    String qiu[] = {
      "立秋的气候是由热转凉的交接节气，也是阳气渐收，阴气渐长，由阳盛逐渐转变为阴盛的时期，是万物成熟收获的季节，也是人体阴阳代谢出现阳消阴长的过渡时期。因此秋季养生，凡精神情志、饮食起居、运动锻炼、皆以养收为原则。\n" +
              "秋内应于肺，肺在志为悲（忧），悲忧易伤肺，肺气虚则机体对不良刺激的耐受性下降，易生悲忧之情绪，所以在进行自我调养时切不可背离自然规律，循其古人之纲要“使志安宁，以缓秋刑，收敛神气，使秋气平；无外其志，使肺气清，此秋气之应，养收之道也”。\n" +
              "《素问?脏气法时论》说：“肺主秋……肺收敛，急食酸以收之，用酸补之，辛泻之”。可见酸味收敛肺气，辛味发散泻肺，秋天宜收不宜散，所以要尽量少吃葱、姜等辛味之品，适当多食酸味果蔬。\n" +
              "总之，秋季时节，可适当食用芝麻、糯米、粳米、蜂蜜、枇杷、菠萝、乳品等柔润食物，以益胃生津。",
            "秋天阴气增、阳气减，对应人体的阳气也随着内收，为了贮存体内阳气。然而，随着天气转凉，很多人会有懒洋洋的疲劳感，早上不爱起，白天不爱动，这就是“春困秋乏”中所指的“秋乏”。要保证充足睡眠，改掉夏季晚睡习惯，争取晚上10点前入睡，以比夏天增加1小时睡眠为好，并保证早睡早起。另外，适当午睡也利于化解秋乏。\n" +
                    "夏天结束了，就意味着秋季的开始。这个时期，气侯逐渐干燥，身体里肺经当值。秋天要多吃些滋阴润燥的食物，避免燥邪伤害。保持饮食清淡，不吃或少吃辛辣烧烤食物，如辣椒、生姜、花椒、葱、桂皮、酒等；少吃油腻的肉食。多吃含维生素的食物，如西红柿、辣椒、茄子、马铃薯、梨等；多吃碱性食物，如苹果、海带以及新鲜蔬菜等。适量增加优 质蛋白质的摄入，如鸡蛋、瘦肉、鱼、乳制品及豆制品等。此外，还应多喝水，以保持肺脏与呼吸道的正常湿润度。",
            "白露是典型的秋天节气，古语说：“白露节气勿露身，早晚要叮咛。”意在提醒人们此时白天虽然温和，但早晚已凉，打赤脯容易着凉。\n" +
                    "白露时节，支气管哮喘发病率很高，因此要做好预防工作。此节气的养生重点是加强身体锻炼，注意早晚不要受凉，对过敏性疾病积极预防。\n" +
                    "白露时节要防止鼻腔疾病、哮喘病和支气管病的发生。特别是因体质过敏而引发上述疾病的患者，在饮食调节上更要慎重，平时要少吃或不吃鱼虾海腥、生冷炙烩腌菜和辛辣酸咸甘肥的食物。\n" +
                    "在白露一节气中要预防秋燥，燥邪伤人，容易耗人津液，而出现口干、唇干、鼻干、咽干及大便干结、皮肤干裂等症状。预防秋燥的方法很多，可适当地多服一些富含维生素的食品，也可选用一些宣肺化痰、滋阴益气的中药，如人参、沙参等，对缓解秋燥有良效。",
            "秋分节气已经真正进入到秋季，作为昼夜时间相等的节气，人们在养生中也应本着阴阳平衡的规律，使机体保持“阴平阳秘”的原则，按照《素问?至真要大论》所说：“谨察阴阳之所在，以平为期”，阴阳所在不可出现偏颇。要想保持机体的阴阳平衡，首先要防止外界邪气的侵袭。\n" +
                    "同时，秋燥温与凉的变化，还与每个人的体质和机体反应有关。要防止凉燥，就得坚持锻炼身体，增强体质，提高抗病能力。秋季锻炼，重在益肺润燥，如练吐纳功、叩齿咽津润燥功。饮食调养方面，应多喝水，吃清润、温润的食物，如芝麻、核桃、糯米、蜂蜜、乳品、梨等，可以起到滋阴润肺、养阴生津的作用。",
            "“寒露”时节起，雨水渐少，天气干燥，昼热夜凉。从中医角度上说，这节气在南方气候最大的特点是“燥”邪当令，而燥邪最容易伤肺伤胃。此时期人们的汗液蒸发较快，因而常出现皮肤干燥，皱纹增多，口干咽燥，干咳少痰，甚至会毛发脱落和大便秘结等。所以养生的重点是养阴防燥、润肺益胃。\n" +
                    "要避免因剧烈运动、过度劳累等耗散精气津液。在饮食上还应少吃辛辣刺激、香燥、熏烤等类食品，宜多吃些芝麻、核桃、银耳、萝卜、番茄、莲藕、牛奶、百合、沙参等有滋阴润燥、益胃生津作用的食品。同时室内要保持一定的湿度，注意补充水分，多吃雪梨、香蕉、哈密瓜、苹果、水柿、提子等水果。此外还应重视涂擦护肤霜等以保护皮肤，防止干裂。",
            "霜降节气是慢性胃炎和胃十二指肠溃疡病复发的高峰期。老年人也极容易患上“老寒腿”（膝关节骨性关节炎）的毛病，慢性支气管炎也容易复发或加重。这时应该多吃些梨，苹果，白果，洋葱，芥菜(雪里蕻)。\n" +
                    "霜降之时，在五行中属土，根据中医养生学的观点，在四季五补（春要升补、夏要清补、长夏要淡补、秋要平补、冬要温补）的相互关系上，此时与长夏同属土，所以应以淡补为原则，并且要补血气以养胃。\n" +
                    "饮食进补当依据食物的性味、归经加以区别。饮食养生学侧重于根据食物的“性味归经”来调节人体阴阳，滋养五脏六腑和预防疾病。因此，在传统养生学中，食物也根据其“性味归经”而分为了不同的类型。"
    };


    String dong[] = {
            "立冬以后，天气转寒，如何增强对寒冷的抗御能力？不外乎使体内产热增加，散热减少，其方法与衣食住行无不相关。 调整饮食增加热量是其中的方法之一。寒冷的环境，适当进食高热量食品，能促进糖、脂肪、蛋白质的分解代谢。\n" +
                    "冬季饮食调养，宜用滋阴潜阳、热量较高的膳食，也要多吃新鲜蔬菜水果以避免维生素和矿物质缺乏。碳水化合物、脂肪都是产生热能的营养素，食物中的碳水化合物主要来自粮食和薯类，谷类食物不能减少，成年人日需400-500克。\n" +
                    "冬要温补：少食生冷，但也不宜躁热，有的放矢地食用一些滋阴潜阳，热量较高的膳食为宜，同时也要多吃新鲜蔬菜，以避免维生素的缺乏，如：牛羊肉、乌鸡、鲫鱼，多饮豆浆、牛奶，多吃萝卜、青菜、豆腐、木耳等。",
            "孙思邈云：“安身之本，必资于食……不知食宜结，不足以生存也。”合理的饮食，可以使人身体强健、益寿延年，而饮食不当则是导致疾病和早衰的重要原因之一。为避免血液黏稠，应多食保护心脑血管的食品，如丹参、山楂、黑木耳、西红柿、芹菜、红心萝卜等。\n" +
                    "适宜吃降血脂食品，如苦瓜、玉米、荞麦、胡萝卜等。这个季节宜吃温补性食物和益肾食品。温补性食物有羊肉、牛肉、鸡肉、狗肉、鹿茸等；益肾食品有以腰果、芡实、山药熬的粥，栗子炖肉、白果炖鸡、大骨头汤、核桃等。另外，要多吃炖食和黑色食品，如黑木耳、黑芝麻、黑豆等。",
            "此时，我国北方患感冒人较多，如能服点大雪顺安养生汤，对抵抗寒邪袭之体表、口鼻很有益处。具体方法如下： \n" +
                    "　　\n" +
                    "第一、在大雪前中后三天的酉时（17-19时，肾经主时）：食用大雪养生汤。具体方法为：将冬虫夏草3克、狗肉250克、上肉桂3克，用水煎煮（可放调味品），将狗肉和汤一块服下。祛寒育肾。 \n" +
                    "　　\n" +
                    "第二、从中医养生学的角度看，大雪已到了“进补”的大好时节。在大雪至冬至期间，可食用下列食品： 枸杞肉丝、木耳冬瓜三鲜汤。",
            "冬至在养生学上是一个最重要的节气，主要是因为“冬至一阳生”。按八卦学说，此时为地雷复卦。卦象中上面五个阴爻，下面一个阳爻，象征阳气的初生。我国古时曾以冬至定为子月，即一年的开始。在一天十二时辰中，子时也是人体一阳初生的时间。\n" +
                    "古代养生修炼非常重视阳气初生这一时期。认为阳气初生时，要像农民育苗、妇人怀孕一样，需小心保护，精心调养，使其逐渐壮大。因为只有人体内的阳气充足，才会达到祛病延年的目的。所以子时、子月便在养生学中有着重要的地位。\n" +
                    "冬令进补有三种说法：一是在立冬后至立春前；二是在冬至前后；三是三九天。专家认为，冬令进补时间的选择因人而异。患有慢性疾病又属于阳虚体质的人需长时间进补，可从立冬开始直至立春；体质一般而不需大补的人，可在三九天集中进补。正如民间早就有\"夏补三伏、冬补三九\"的说法。冬至是数九的开始，因此民间认为，在冬至前后进补为最佳。",
            "中医认为寒为阴邪，最寒冷的节气也是阴邪最盛的时期，从饮食养生的角度讲，要特别注意在日常饮食中多食用一些温热食物以补益身体，防御寒冷气候对人体的侵袭。日常食物中属于热性的食物主要有鳟鱼、辣椒、肉桂、花椒等；属于温性的食物有糯米、高粱米、刀豆、韭菜、茴香、香菜、荠菜、芦笋、芥菜、南瓜、生姜、葱、大蒜、杏子、桃子、大枣、桂圆、荔枝、木瓜、樱桃、石榴、乌梅、香椽、佛手、栗子、核桃仁、杏仁、羊肉、猪肝、猪肚、火腿、狗肉、鸡肉、羊乳、鹅蛋、鳝鱼、鳙鱼、鲢鱼、虾、海参、淡菜、蚶、酒等。特别要提出的是，小寒时节正是吃麻辣火锅、红焖羊肉的好时节。",
            "冬三月是生机潜伏、万物蛰藏的时令，此时人体的阴阳消长代谢也处于相当缓慢的时候，所以此时应该早睡晚起，不要轻易扰动阳气，凡事不要过度操劳，要使神志深藏于内，避免急躁发怒。大寒是冬季六节气之一，此时天气寒冷已极，故名大寒。大寒的养生，要着眼于“藏”。意思是说，人们在此期间要控制自己的精神活动，保持精神安静，把神藏于内不要暴露于外。这样才有利于安度冬季。\n" +
                    "总之，大寒是二十四节气之尾，也是冬季即将结束之季，隐隐中已可感受到大地回春的迹象。"
    };


    private int key;
    @Override
    protected int bindLayout() {
        return R.layout.activity_regimen_content;
    }

    @Override
    protected void bindUIValue(Bundle bundle) {
        ButterKnife.bind(this);

        Typeface fontFace = Typeface.createFromAsset(getAssets(),
                "fonts/hwxk.ttf");
        title.setTypeface(fontFace);

        key  = getIntent().getExtras().getInt("key");

        showData(key);
    }

    /**
     * 根据点击项显示内容
     * @param key
     */
    private void showData(int key) {

        switch (key){
            case 1:
                contentImg.setImageResource(R.mipmap.chun1);
                content1.setText(R.string.lichun);
                content1.setTextColor(getResources().getColor(R.color.color_234605));
                content2.setText(R.string.yushui);
                content2.setTextColor(getResources().getColor(R.color.color_234605));
                content3.setText(R.string.jingzhe);
                content3.setTextColor(getResources().getColor(R.color.color_234605));
                content4.setText(R.string.chunfen);
                content4.setTextColor(getResources().getColor(R.color.color_234605));
                content5.setText(R.string.qingming);
                content5.setTextColor(getResources().getColor(R.color.color_234605));
                content6.setText(R.string.guyu);
                content6.setTextColor(getResources().getColor(R.color.color_234605));
                contentTv.setTextColor(getResources().getColor(R.color.color_234605));
                break;
            case 2:
                contentImg.setImageResource(R.mipmap.xia1);
                content1.setText(R.string.lixia);
                content1.setTextColor(getResources().getColor(R.color.color_dong));
                content2.setText(R.string.xiaoman);
                content2.setTextColor(getResources().getColor(R.color.color_dong));
                content3.setText(R.string.mangzhong);
                content3.setTextColor(getResources().getColor(R.color.color_dong));
                content4.setText(R.string.xiazhi);
                content4.setTextColor(getResources().getColor(R.color.color_dong));
                content5.setText(R.string.xiaoshu);
                content5.setTextColor(getResources().getColor(R.color.color_dong));
                content6.setText(R.string.dashu);
                content6.setTextColor(getResources().getColor(R.color.color_dong));
                contentTv.setTextColor(getResources().getColor(R.color.color_dong));
                break;
            case 3:
                contentImg.setImageResource(R.mipmap.qiu1);
                content1.setText(R.string.liqiu);
                content1.setTextColor(getResources().getColor(R.color.color_a14d0f));
                content2.setText(R.string.chushu);
                content2.setTextColor(getResources().getColor(R.color.color_a14d0f));
                content3.setText(R.string.bailu);
                content3.setTextColor(getResources().getColor(R.color.color_a14d0f));
                content4.setText(R.string.qiufen);
                content4.setTextColor(getResources().getColor(R.color.color_a14d0f));
                content5.setText(R.string.hanlu);
                content5.setTextColor(getResources().getColor(R.color.color_a14d0f));
                content6.setText(R.string.shuangjiang);
                content6.setTextColor(getResources().getColor(R.color.color_a14d0f));
                contentTv.setTextColor(getResources().getColor(R.color.color_a14d0f));
                break;
            case 4:
                contentImg.setImageResource(R.mipmap.dong1);
                content1.setText(R.string.lidong);
                content1.setTextColor(getResources().getColor(R.color.color_565179));
                content2.setText(R.string.xiaoxue);
                content2.setTextColor(getResources().getColor(R.color.color_565179));
                content3.setText(R.string.daxue);
                content3.setTextColor(getResources().getColor(R.color.color_565179));
                content4.setText(R.string.dongzhi);
                content4.setTextColor(getResources().getColor(R.color.color_565179));
                content5.setText(R.string.xiaohan);
                content5.setTextColor(getResources().getColor(R.color.color_565179));
                content6.setText(R.string.dahan);
                content6.setTextColor(getResources().getColor(R.color.color_565179));
                contentTv.setTextColor(getResources().getColor(R.color.color_565179));
                break;
        }
    }


    @OnClick({
            R.id.back,
            R.id.content_01,
            R.id.content_02,
            R.id.content_03,
            R.id.content_04,
            R.id.content_05,
            R.id.content_06
    })
    public void click(View view){

        switch (view.getId()){
            case R.id.back:
                finish();
                break;
            case R.id.content_01:
                switch (key){
                    case 1:
                        contentTv.setText(chun[0]);
                        break;
                    case 2:
                        contentTv.setText(xia[0]);
                        break;
                    case 3:
                        contentTv.setText(qiu[0]);
                        break;
                    case 4:
                        contentTv.setText(dong[0]);
                        break;
                }
                break;
            case R.id.content_02:
                switch (key){
                    case 1:
                        contentTv.setText(chun[1]);
                        break;
                    case 2:
                        contentTv.setText(xia[1]);
                        break;
                    case 3:
                        contentTv.setText(qiu[1]);
                        break;
                    case 4:
                        contentTv.setText(dong[1]);
                        break;
                }
                break;
            case R.id.content_03:
                switch (key){
                    case 1:
                        contentTv.setText(chun[2]);
                        break;
                    case 2:
                        contentTv.setText(xia[2]);
                        break;
                    case 3:
                        contentTv.setText(qiu[2]);
                        break;
                    case 4:
                        contentTv.setText(dong[2]);
                        break;
                }
                break;
            case R.id.content_04:
                switch (key){
                    case 1:
                        contentTv.setText(chun[3]);
                        break;
                    case 2:
                        contentTv.setText(xia[3]);
                        break;
                    case 3:
                        contentTv.setText(qiu[3]);
                        break;
                    case 4:
                        contentTv.setText(dong[3]);
                        break;
                }
                break;
            case R.id.content_05:
                switch (key){
                    case 1:
                        contentTv.setText(chun[4]);
                        break;
                    case 2:
                        contentTv.setText(xia[4]);
                        break;
                    case 3:
                        contentTv.setText(qiu[4]);
                        break;
                    case 4:
                        contentTv.setText(dong[4]);
                        break;
                }
                break;
            case R.id.content_06:
                switch (key){
                    case 1:
                        contentTv.setText(chun[5]);
                        break;
                    case 2:
                        contentTv.setText(xia[5]);
                        break;
                    case 3:
                        contentTv.setText(qiu[5]);
                        break;
                    case 4:
                        contentTv.setText(dong[5]);
                        break;
                }
                break;
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
