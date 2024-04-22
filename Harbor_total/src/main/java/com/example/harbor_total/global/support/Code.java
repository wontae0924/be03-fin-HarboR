package com.example.harbor_total.global.support;

import lombok.Getter;

/**
 * @코드리스트
 * @E01~E15 소속 팀 코드
 * @D01~D51 직무 코드
 * @O01~O05 근무유형 코드
 * @G01~G02 성별 코드
 * @B01~B010 은행 코드
 * @S01~S65 직위 코드
 * @Sx00 업무상태 코드
 * @T01~T05 부서 코드
 * @K1000 (주)Harbor
 */
@Getter
public enum Code {
    E01("개발 1팀"),
    E02("개발 2팀"),
    E03("개발 3팀"),
    E04("영엉 1팀"),
    E05("영업 2팀"),
    E06("영업 3팀"),
    E07("기획 1팀"),
    E08("기획 2팀"),
    E09("기획 3팀"),
    E10("인사 1팀"),
    E11("인사 2팀"),
    E12("인사 3팀"),
    E13("마케팅 1팀"),
    E14("마케팅 2팀"),
    E15("마케팅 3팀"),

    D01("아날로그 엑스퍼트"),
    D02("디지털 엑스퍼트"),
    D03("시스템 아키텍처 설계자"),
    D04("운영체제 엔지니어"),
    D05("네트워크 엔지니어"),
    D06("데이터베이스 엔지니어"),
    D07("미들웨어 개발자"),
    D08("미들웨어 시스템템 관리자"),
    D09("어플리케이션 소프트웨어 개발자"),
    D10("어플리케이션 품질보증 엔지니어"),
    D11("어플리케이션 소프트웨어 아키텍트"),
    D12("어플리케이션 프로젝트 매니저"),
    D13("어플리케이션 유지보수 엔지니어"),
    D14("기타 소프트웨어 매니저"),
    D15("기계 관리자"),
    D16("ICT 시스템 분석및 설계자"),
    D17("ICT 프로그래밍 개발자"),
    D18("ICT 버전관리자"),
    D19("ICT 품질관리자"),
    D20("ICT 배포관리자"),
    D21("ICT 시스템 모니터링 관리자"),
    D22("ICT 고객관리자"),
    D23("ICT 보안관리자"),
    D24("IPS 보안 분석가"),
    D25("IPS 보안 엔지니어"),
    D26("IPS 보안 아키텍트"),
    D27("IPS 보안 운영 및 관리자"),
    D28("IPS 보안 컨설턴트"),
    D29("인사담당자"),
    D30("재무 담당자"),
    D31("문서 관리자"),
    D32("시설 관리자"),
    D33("자문 및 컨설팅 담당자"),
    D34("IDC 네트워크 엔지니어"),
    D35("IDC 시스템 엔지니어"),
    D36("IDC 보안 엔지니어"),
    D37("IDC 데이터베이스 관리자"),
    D38("IDC 시설 관리자"),
    D39("R&D 연구원"),
    D40("R&D 개발자"),
    D41("R&D 설계 엔지니어"),
    D42("R&D 프로젝트 관리자"),
    D43("R&D 품질 보증 엔지니어"),
    D44("솔루션 아키텍트"),
    D45("시스템 아키텍트"),
    D46("데이터 아키텍트"),
    D47("기업 아키텍트"),
    D48("마케팅 전략 및 기획자"),
    D49("디지털 마케터"),
    D50("콘텐츠 마케터"),
    D51("고객 관리 및 리텐션"),

    O01("출근"),
    O02("퇴근"),
    O03("출장"),
    O04("휴가"),
    O05("휴계"),
    O06("고정"),
    O07("시차"),
    O08("반차"),
    O09("병가"),

    G01("남자"),
    G02("여자"),

    B01("국민은행"),
    B02("우리은행"),
    B03("신한은행"),
    B04("하나은행"),
    B05("기업은행"),
    B06("NH농협은행"),
    B07("산업은행"),
    B08("한국수출입은행"),
    B09("한국투자공사"),
    B10("BNK금융그룹"),

    S11("사원 1호봉"),
    S12("사원 2호봉"),
    S13("사원 3호봉"),
    S14("사원 4호봉"),
    S15("사원 5호봉"),
    S21("주임 1호봉"),
    S22("주임 2호봉"),
    S23("주임 3호봉"),
    S24("주임 4호봉"),
    S25("주임 5호봉"),
    S31("대리 1호봉"),
    S32("대리 2호봉"),
    S33("대리 3호봉"),
    S34("대리 4호봉"),
    S35("대리 5호봉"),
    S41("과장 1호봉"),
    S42("과장 2호봉"),
    S43("과장 3호봉"),
    S44("과장 4호봉"),
    S45("과장 5호봉"),
    S51("차장 1호봉"),
    S52("차장 2호봉"),
    S53("차장 3호봉"),
    S54("차장 4호봉"),
    S55("차장 5호봉"),
    S61("부장 1호봉"),
    S62("부장 2호봉"),
    S63("부장 3호봉"),
    S64("부장 4호봉"),
    S65("부장 5호봉"),

    S100("재작중"),
    S200("퇴사자"),
    S300("휴직중"),

    T01("개발팀"),
    T02("영업팀"),
    T03("기획팀"),
    T04("인사팀"),
    T05("마케팅팀"),
    K1000("(주)Harbor"),

    X01("지각"),
    X02("정상");

    private final String message;

    Code(String message) {
        this.message = message;
    }

    public static Code getCodeByMessage(String message) {
        for (Code code : Code.values()) {
            if (code.message.equals(message)) {
                return code;
            }
        }
        throw new IllegalArgumentException("등록되지 않은 코드입니다.");
    }
}