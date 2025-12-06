package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartRiver: ImageVector
    get() {
        val current = _chartRiver
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartRiver",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m12.43 20.02 8.04 4.68 a2 2 0 0 0 1.05 .3 2 2 0 0 0 .49 -.06 l7.25 -1.97 A1 1 0 0 0 30 22 V8 a1 1 0 0 0 -1.26 -.97 L21.5 8.98 13.47 4.3 a2 2 0 0 0 -1.87 -.13 L4 7.47 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2 H4 v-4.34Z M28 21.23 l-6.5 1.75 -8.03 -4.68 a2 2 0 0 0 -1.87 -.13 L4 21.47 v-4.81 l8.43 -3.64 8.04 4.68 a2 2 0 0 0 1.05 .3 2 2 0 0 0 .49 -.06 L28 16.31Z M12.43 6.02 l8.04 4.68 a2 2 0 0 0 1.54 .24 L28 9.31 v4.92 l-6.5 1.75 -8.03 -4.68 a2 2 0 0 0 -1.87 -.13 L4 14.47 V9.66Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 12.43 20.02
                moveTo(x = 12.43f, y = 20.02f)
                // l 8.04 4.68
                lineToRelative(dx = 8.04f, dy = 4.68f)
                // a 2 2 0 0 0 1.05 0.3
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.05f,
                    dy1 = 0.3f,
                )
                // a 2 2 0 0 0 0.49 -0.06
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.49f,
                    dy1 = -0.06f,
                )
                // l 7.25 -1.97
                lineToRelative(dx = 7.25f, dy = -1.97f)
                // A 1 1 0 0 0 30 22
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 30.0f,
                    y1 = 22.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
                // a 1 1 0 0 0 -1.26 -0.97
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.26f,
                    dy1 = -0.97f,
                )
                // L 21.5 8.98
                lineTo(x = 21.5f, y = 8.98f)
                // L 13.47 4.3
                lineTo(x = 13.47f, y = 4.3f)
                // a 2 2 0 0 0 -1.87 -0.13
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.87f,
                    dy1 = -0.13f,
                )
                // L 4 7.47
                lineTo(x = 4.0f, y = 7.47f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 26
                horizontalLineToRelative(dx = 26.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -4.34z
                verticalLineToRelative(dy = -4.34f)
                close()
                // M 28 21.23
                moveTo(x = 28.0f, y = 21.23f)
                // l -6.5 1.75
                lineToRelative(dx = -6.5f, dy = 1.75f)
                // l -8.03 -4.68
                lineToRelative(dx = -8.03f, dy = -4.68f)
                // a 2 2 0 0 0 -1.87 -0.13
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.87f,
                    dy1 = -0.13f,
                )
                // L 4 21.47
                lineTo(x = 4.0f, y = 21.47f)
                // v -4.81
                verticalLineToRelative(dy = -4.81f)
                // l 8.43 -3.64
                lineToRelative(dx = 8.43f, dy = -3.64f)
                // l 8.04 4.68
                lineToRelative(dx = 8.04f, dy = 4.68f)
                // a 2 2 0 0 0 1.05 0.3
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.05f,
                    dy1 = 0.3f,
                )
                // a 2 2 0 0 0 0.49 -0.06
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.49f,
                    dy1 = -0.06f,
                )
                // L 28 16.31z
                lineTo(x = 28.0f, y = 16.31f)
                close()
                // M 12.43 6.02
                moveTo(x = 12.43f, y = 6.02f)
                // l 8.04 4.68
                lineToRelative(dx = 8.04f, dy = 4.68f)
                // a 2 2 0 0 0 1.54 0.24
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.54f,
                    dy1 = 0.24f,
                )
                // L 28 9.31
                lineTo(x = 28.0f, y = 9.31f)
                // v 4.92
                verticalLineToRelative(dy = 4.92f)
                // l -6.5 1.75
                lineToRelative(dx = -6.5f, dy = 1.75f)
                // l -8.03 -4.68
                lineToRelative(dx = -8.03f, dy = -4.68f)
                // a 2 2 0 0 0 -1.87 -0.13
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.87f,
                    dy1 = -0.13f,
                )
                // L 4 14.47
                lineTo(x = 4.0f, y = 14.47f)
                // V 9.66z
                verticalLineTo(y = 9.66f)
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
        }.build().also { _chartRiver = it }
    }

@Suppress("ObjectPropertyName")
private var _chartRiver: ImageVector? = null
