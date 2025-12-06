package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RulePartial: ImageVector
    get() {
        val current = _rulePartial
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.RulePartial",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 16 c-3.9 0 -7 3.1 -7 7 s3.1 7 7 7 7 -3.1 7 -7 -3.1 -7 -7 -7 m0 12 V18 c2.8 0 5 2.2 5 5 s-2.2 5 -5 5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 16
                moveTo(x = 23.0f, y = 16.0f)
                // c -3.9 0 -7 3.1 -7 7
                curveToRelative(
                    dx1 = -3.9f,
                    dy1 = 0.0f,
                    dx2 = -7.0f,
                    dy2 = 3.1f,
                    dx3 = -7.0f,
                    dy3 = 7.0f,
                )
                // s 3.1 7 7 7
                reflectiveCurveToRelative(
                    dx1 = 3.1f,
                    dy1 = 7.0f,
                    dx2 = 7.0f,
                    dy2 = 7.0f,
                )
                // s 7 -3.1 7 -7
                reflectiveCurveToRelative(
                    dx1 = 7.0f,
                    dy1 = -3.1f,
                    dx2 = 7.0f,
                    dy2 = -7.0f,
                )
                // s -3.1 -7 -7 -7
                reflectiveCurveToRelative(
                    dx1 = -3.1f,
                    dy1 = -7.0f,
                    dx2 = -7.0f,
                    dy2 = -7.0f,
                )
                // m 0 12
                moveToRelative(dx = 0.0f, dy = 12.0f)
                // V 18
                verticalLineTo(y = 18.0f)
                // c 2.8 0 5 2.2 5 5
                curveToRelative(
                    dx1 = 2.8f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = 2.2f,
                    dx3 = 5.0f,
                    dy3 = 5.0f,
                )
                // s -2.2 5 -5 5
                reflectiveCurveToRelative(
                    dx1 = -2.2f,
                    dy1 = 5.0f,
                    dx2 = -5.0f,
                    dy2 = 5.0f,
                )
            }
            // <rect width="6" height="2" x="8.0" y="16.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 16
                moveTo(x = 8.0f, y = 16.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -6z
                horizontalLineToRelative(dx = -6.0f)
                close()
            }
            // <rect width="12" height="2" x="8.0" y="10.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 8 10
                moveTo(x = 8.0f, y = 10.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -12z
                horizontalLineToRelative(dx = -12.0f)
                close()
            }
            // M26 4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v13 c0 4.1 2.2 7.8 5.8 9.7 l5.2 2.8 v-2.3 l-4.2 -2.3 A8.8 8.8 0 0 1 4 17 V4 h20 v9 h2z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 4
                moveTo(x = 26.0f, y = 4.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 13
                verticalLineToRelative(dy = 13.0f)
                // c 0 4.1 2.2 7.8 5.8 9.7
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.1f,
                    dx2 = 2.2f,
                    dy2 = 7.8f,
                    dx3 = 5.8f,
                    dy3 = 9.7f,
                )
                // l 5.2 2.8
                lineToRelative(dx = 5.2f, dy = 2.8f)
                // v -2.3
                verticalLineToRelative(dy = -2.3f)
                // l -4.2 -2.3
                lineToRelative(dx = -4.2f, dy = -2.3f)
                // A 8.8 8.8 0 0 1 4 17
                arcTo(
                    horizontalEllipseRadius = 8.8f,
                    verticalEllipseRadius = 8.8f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 4.0f,
                    y1 = 17.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // v 9
                verticalLineToRelative(dy = 9.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -32z
                horizontalLineToRelative(dx = -32.0f)
                close()
            }
        }.build().also { _rulePartial = it }
    }

@Suppress("ObjectPropertyName")
private var _rulePartial: ImageVector? = null
