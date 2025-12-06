package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AcceptActionUsage: ImageVector
    get() {
        val current = _acceptActionUsage
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AcceptActionUsage",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M23 11.03 8 11 l7 5 -7 5 h15 a1 1 0 0 0 1 -1 v-7.97 a1 1 0 0 0 -1 -1
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23 11.03
                moveTo(x = 23.0f, y = 11.03f)
                // L 8 11
                lineTo(x = 8.0f, y = 11.0f)
                // l 7 5
                lineToRelative(dx = 7.0f, dy = 5.0f)
                // l -7 5
                lineToRelative(dx = -7.0f, dy = 5.0f)
                // h 15
                horizontalLineToRelative(dx = 15.0f)
                // a 1 1 0 0 0 1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.0f,
                    dy1 = -1.0f,
                )
                // v -7.97
                verticalLineToRelative(dy = -7.97f)
                // a 1 1 0 0 0 -1 -1
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.0f,
                    dy1 = -1.0f,
                )
            }
            // M21 30 H11 c-4.96 0 -9 -4.04 -9 -9 V11 c0 -4.96 4.04 -9 9 -9 h10 c4.96 0 9 4.04 9 9 v10 c0 4.96 -4.04 9 -9 9 M11 4 a7 7 0 0 0 -7 7 v10 a7 7 0 0 0 7 7 h10 a7 7 0 0 0 7 -7 V11 a7 7 0 0 0 -7 -7z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 21 30
                moveTo(x = 21.0f, y = 30.0f)
                // H 11
                horizontalLineTo(x = 11.0f)
                // c -4.96 0 -9 -4.04 -9 -9
                curveToRelative(
                    dx1 = -4.96f,
                    dy1 = 0.0f,
                    dx2 = -9.0f,
                    dy2 = -4.04f,
                    dx3 = -9.0f,
                    dy3 = -9.0f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // c 0 -4.96 4.04 -9 9 -9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -4.96f,
                    dx2 = 4.04f,
                    dy2 = -9.0f,
                    dx3 = 9.0f,
                    dy3 = -9.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // c 4.96 0 9 4.04 9 9
                curveToRelative(
                    dx1 = 4.96f,
                    dy1 = 0.0f,
                    dx2 = 9.0f,
                    dy2 = 4.04f,
                    dx3 = 9.0f,
                    dy3 = 9.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // c 0 4.96 -4.04 9 -9 9
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 4.96f,
                    dx2 = -4.04f,
                    dy2 = 9.0f,
                    dx3 = -9.0f,
                    dy3 = 9.0f,
                )
                // M 11 4
                moveTo(x = 11.0f, y = 4.0f)
                // a 7 7 0 0 0 -7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = 7.0f,
                )
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // a 7 7 0 0 0 7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                // h 10
                horizontalLineToRelative(dx = 10.0f)
                // a 7 7 0 0 0 7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = -7.0f,
                )
                // V 11
                verticalLineTo(y = 11.0f)
                // a 7 7 0 0 0 -7 -7z
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
                )
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
            path(
                fill = SolidColor(Color.Transparent),
                strokeLineWidth = 0.0f,
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
        }.build().also { _acceptActionUsage = it }
    }

@Suppress("ObjectPropertyName")
private var _acceptActionUsage: ImageVector? = null
