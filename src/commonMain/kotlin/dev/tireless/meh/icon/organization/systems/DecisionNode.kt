package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DecisionNode: ImageVector
    get() {
        val current = _decisionNode
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DecisionNode",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 2 v8 h-4 l-8 -8 -8 8 H4 V2 H2 v8 a2 2 0 0 0 2 2 h4 l7 7 v7.17 l-2.59 -2.58 L11 25 l5 5 5 -5 -1.41 -1.41 L17 26.17 V19 l7 -7 h4 a2 2 0 0 0 2 -2 V2z M16 17.17 9.83 11 16 4.83 22.17 11z
            path(
                strokeLineWidth = 0.0f,
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 2
                moveTo(x = 28.0f, y = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // l -8 -8
                lineToRelative(dx = -8.0f, dy = -8.0f)
                // l -8 8
                lineToRelative(dx = -8.0f, dy = 8.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
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
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // l 7 7
                lineToRelative(dx = 7.0f, dy = 7.0f)
                // v 7.17
                verticalLineToRelative(dy = 7.17f)
                // l -2.59 -2.58
                lineToRelative(dx = -2.59f, dy = -2.58f)
                // L 11 25
                lineTo(x = 11.0f, y = 25.0f)
                // l 5 5
                lineToRelative(dx = 5.0f, dy = 5.0f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // l -1.41 -1.41
                lineToRelative(dx = -1.41f, dy = -1.41f)
                // L 17 26.17
                lineTo(x = 17.0f, y = 26.17f)
                // V 19
                verticalLineTo(y = 19.0f)
                // l 7 -7
                lineToRelative(dx = 7.0f, dy = -7.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 2z
                verticalLineTo(y = 2.0f)
                close()
                // M 16 17.17
                moveTo(x = 16.0f, y = 17.17f)
                // L 9.83 11
                lineTo(x = 9.83f, y = 11.0f)
                // L 16 4.83
                lineTo(x = 16.0f, y = 4.83f)
                // L 22.17 11z
                lineTo(x = 22.17f, y = 11.0f)
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
        }.build().also { _decisionNode = it }
    }

@Suppress("ObjectPropertyName")
private var _decisionNode: ImageVector? = null
